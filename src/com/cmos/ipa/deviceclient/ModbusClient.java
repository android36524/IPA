package com.cmos.ipa.deviceclient;

import java.util.ArrayList;
import java.util.List;

import com.cmos.ipa.pojo.MsgAlarm;
import com.cmos.ipa.pojo.MsgStatus;
import com.cmos.ipa.protocol.modbus.ModbusFactory;
import com.cmos.ipa.protocol.modbus.ModbusLocator;
import com.cmos.ipa.protocol.modbus.ModbusMaster;
import com.cmos.ipa.protocol.modbus.code.DataType;
import com.cmos.ipa.protocol.modbus.code.RegisterRange;
import com.cmos.ipa.protocol.modbus.exception.ErrorResponseException;
import com.cmos.ipa.protocol.modbus.exception.ModbusInitException;
import com.cmos.ipa.protocol.modbus.exception.ModbusTransportException;
import com.cmos.ipa.protocol.modbus.ip.IpParameters;
import com.cmos.ipa.utils.DataPropertyUtil;
import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.log.Logger;

/**
 * <code>ModbusClient</code>
 * @author Hardy
 * @date 2016/6/8 4:21
 * @version 1.0
 */
public class ModbusClient{

    //接受消息线程
    protected Thread receiverT;
    //发送消息线程
    protected Thread senderT;

    private Logger log;

    private ModbusMaster master;

    //重置标志位
    protected boolean needReset = true;

    public static ModbusClient mc;

    public ModbusClient(){
        this.log = Logger.getInstance();
    }

    public static ModbusClient init(){
        if(mc == null) {
            synchronized (ModbusClient.class) {
                if (mc == null) {
                    mc = new ModbusClient();
                }
            }
        }
        return mc;
    }

    /**
     * <code>告警消息入队列</code>
     * @return
     */
    protected boolean enAlarmQueue(MsgAlarm ma){
        boolean result = Global.alarmQueue.add(ma);
        if(result){
            Global.AlarmQueueIn += 1;
        }
        return result;
    }

    /**
     * <code>告警消息出队列</code>
     * @return
     */
    protected MsgAlarm outAlarmQueue() throws InterruptedException {
        MsgAlarm ma = Global.alarmQueue.poll();
        if (ma != null) {
            Global.AlarmQueueIn -= 1;
        }
        return ma;
    }

    /**
     * <code>状态消息入队列</code>
     * @return
     */
    protected boolean enStatusQueue(MsgStatus ms){
        boolean result = Global.statusQueue.add(ms);
        if(result){
            Global.StatusQueueIn += 1;
        }
        return result;
    }

    /**
     * <code>状态消息出队列</code>
     * @return
     */
    protected MsgStatus outStatusQueue() throws InterruptedException {
        MsgStatus ms = Global.statusQueue.poll();
        if (ms != null) {
            Global.StatusQueueIn -= 1;
        }
        return ms;
    }

    /**
     * <code>建立与设备的连接</code>
     * @return
     */
     public ModbusMaster conn(){
         IpParameters params = new IpParameters();
         params.setHost(Global.DeviceAddr);
         params.setPort(Global.DevicePort);
         master = new ModbusFactory().createTcpMaster(params, false);
         return master;
     }


    /**
     * 客户端线程启动
     *
     * @throws Exception
     */
    public void start(){

        master = conn();
        try {
            master.init();
        } catch (ModbusInitException e) {
            e.printStackTrace();
        }

        //启动发送消息线程[-->设备服务端]
        Thread senderT = new Thread() {
            @Override
            public void run() {

            }
        };
        senderT.setPriority(Thread.MAX_PRIORITY);
        senderT.start();


        //启动接受消息线程[设备服务端-->]
        Thread receiverT = new Thread() {
            @Override
            public void run() {
                while(true){

                    List<MsgStatus> mstatusList = assembled();

                    if(mstatusList!=null&&mstatusList.size()>0){
                		for(MsgStatus mstatus:mstatusList){
                			if(mstatus.getPackageNum()>0){
                				//判断状态消息队列是否已经满额 满额先进行移除再添加
                				if(Global.StatusQueueIn <= Global.QUEUE_CACHE_NUM){
                					enStatusQueue(mstatus);
                				}else{
                					try {
                						outStatusQueue();
                						enStatusQueue(mstatus);
                					} catch (InterruptedException e) {
                						log.log_error("ModbusClient>>start>>InterruptedException>>",e);
                						Thread.currentThread().interrupt();
                					}
                				}
                			}
                		}
                	}

                    try {
                        Thread.sleep(Global.COLLETCONTAB);
                    } catch (InterruptedException e) {
                        log.log_error("ModbusClient>>start>>Thread>>InterruptedException>>", e);
                        Thread.currentThread().interrupt();
                    }
                }
            }
        };
        receiverT.setPriority(Thread.MAX_PRIORITY);
        receiverT.start();

    }

    /**
     * <code>根据设备返回信息，组装状态消息</code>
     * @return
     */
    public List<MsgStatus> assembled(){
    	List<MsgStatus> msgStatusList = new ArrayList<MsgStatus>();
    	 MsgStatus mstatus =null;
    	  String[] deviceName = new String[255];
	        String[] deviceCode = new String[255];
	        String[] deviceLocate = new String[255];
	        String[] devicePara = new String[255];
	        String[]  status1 = new String[255];
	        String[]  status2 = new String[255];
	        String[]  status3 = new String[255];
	        String[]  status4 = new String[255];
	        String[]  status5 = new String[255];
    	 int count = 0;
        for(int i=0;i<100;i++){
        	if(i%14==0){
        		mstatus =  new MsgStatus();
    	        deviceName = new String[255];
    	        deviceCode = new String[255];
    	        deviceLocate = new String[255];
    	        devicePara = new String[255];
    	        status1 = new String[255];
    	        status2 = new String[255];
    	        status3 = new String[255];
    	        status4 = new String[255];
    	        status5 = new String[255];
    	        count=0;
        	}
            try {
                //根据不同的点位得到不同的值
                ModbusLocator loc = new ModbusLocator(1, RegisterRange.HOLDING_REGISTER, i, DataType.TWO_BYTE_INT_UNSIGNED);
                if(loc != null){
                    String s = DataPropertyUtil.getProperty(String.valueOf(i));
                    if(s != null && s.length() > 0) {
                        String[] s1 = s.split("_");
                        deviceName[count] = s1[0];
                        deviceCode[count] = s1[0];
                        String[] s2 = s1[1].split("#");
                        deviceLocate[count] = s2[0];
                        devicePara[count] = s2[1];
                        // Get the point value
                        status1[count] = String.valueOf(master.getValue(loc));
                        status2[count] = "0";
                        status3[count] = "0";
                        status4[count] = "0";
                        status5[count] = "0";
                        count++;
                    }
                }
            } catch (ModbusTransportException e) {
                log.log_error("ModbusClient>>start>>Thread>>ModbusTransportException>>", e);
            } catch (ErrorResponseException e) {
                log.log_error("ModbusClient>>start>>Thread>>ErrorResponseException>>", e);
            }
            if(i%14==13){
            	  mstatus.setDeviceName(deviceName);
                  mstatus.setDeviceCode(deviceCode);
                  mstatus.setDeviceLocate(deviceLocate);
                  mstatus.setPackageNum((byte) count);
                  mstatus.setDevicePara(devicePara);
                  mstatus.setStatus1(status1);
                  mstatus.setStatus2(status2);
                  mstatus.setStatus3(status3);
                  mstatus.setStatus4(status4);
                  mstatus.setStatus5(status5);
                  msgStatusList.add(mstatus);
        	}
        }
        return msgStatusList;
    }
}
