
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.cmos.ipa.service.video_surveillance.motionDetectionV1;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-12T18:18:26.619+08:00
 * Generated source version: 3.1.6
 * 
 */

@WebService(
                      serviceName = "MotionDetection",
                      portName = "MotionDetection",
                      targetNamespace = "urn:schemas-pelco-com:service:MotionDetection:1",
                      wsdlLocation = "file:a/MotionDetectionV1.wsdl",
                      endpointInterface = "com.cmos.ipa.service.video_surveillance.motionDetectionV1.MotionDetectionPortType")
                      
public class MotionDetectionImpl implements MotionDetectionPortType {

    private static final Logger LOG = Logger.getLogger(MotionDetectionImpl.class.getName());

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.motionDetectionV1.MotionDetectionPortType#resetMDConfiguration(*
     */
    public void resetMDConfiguration() { 
        LOG.info("Executing operation resetMDConfiguration");
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.motionDetectionV1.MotionDetectionPortType#setEnabled(int  enabled ,)java.lang.Integer  asyncId )*
     */
    public void setEnabled(int enabled,javax.xml.ws.Holder<Integer> asyncId) {
        LOG.info("Executing operation setEnabled");
        System.out.println(enabled);
        System.out.println(asyncId.value);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.motionDetectionV1.MotionDetectionPortType#clearMDRegions(java.lang.Integer  asyncId )*
     */
    public void clearMDRegions(javax.xml.ws.Holder<Integer> asyncId) {
        LOG.info("Executing operation clearMDRegions");
        System.out.println(asyncId.value);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.motionDetectionV1.MotionDetectionPortType#getMDConfiguration(*
     */
    public MDConfig getMDConfiguration() {
        LOG.info("Executing operation getMDConfiguration");
        try {
            MDConfig _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.motionDetectionV1.MotionDetectionPortType#getMaxRegions(java.lang.Integer  asyncId ,)java.lang.Integer  maxRegions )*
     */
    public void getMaxRegions(javax.xml.ws.Holder<Integer> asyncId,javax.xml.ws.Holder<Integer> maxRegions) {
        LOG.info("Executing operation getMaxRegions");
        System.out.println(asyncId.value);
        try {
            Integer maxRegionsValue = null;
            maxRegions.value = maxRegionsValue;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.motionDetectionV1.MotionDetectionPortType#getAlarmState(*
     */
    public int getAlarmState() { 
        LOG.info("Executing operation getAlarmState");
        try {
            int _return = 0;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.motionDetectionV1.MotionDetectionPortType#getGridSize(java.lang.Integer  asyncId ,)java.lang.Integer  rows ,)java.lang.Integer  columns )*
     */
    public void getGridSize(javax.xml.ws.Holder<Integer> asyncId,javax.xml.ws.Holder<Integer> rows,javax.xml.ws.Holder<Integer> columns) {
        LOG.info("Executing operation getGridSize");
        System.out.println(asyncId.value);
        try {
            Integer rowsValue = null;
            rows.value = rowsValue;
            Integer columnsValue = null;
            columns.value = columnsValue;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.motionDetectionV1.MotionDetectionPortType#getEnabled(java.lang.Integer  asyncId ,)java.lang.Integer  enabled )*
     */
    public void getEnabled(javax.xml.ws.Holder<Integer> asyncId,javax.xml.ws.Holder<Integer> enabled) {
        LOG.info("Executing operation getEnabled");
        System.out.println(asyncId.value);
        try {
            Integer enabledValue = null;
            enabled.value = enabledValue;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.motionDetectionV1.MotionDetectionPortType#getMaxSensitivity(java.lang.Integer  asyncId ,)java.lang.Integer  maxSensitivity )*
     */
    public void getMaxSensitivity(javax.xml.ws.Holder<Integer> asyncId,javax.xml.ws.Holder<Integer> maxSensitivity) {
        LOG.info("Executing operation getMaxSensitivity");
        System.out.println(asyncId.value);
        try {
            Integer maxSensitivityValue = null;
            maxSensitivity.value = maxSensitivityValue;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.motionDetectionV1.MotionDetectionPortType#getMDRegions(java.lang.Integer  asyncId ,)com.cmos.ipa.service.video_surveillance.motionDetectionV1.MDRegionList  regionList )*
     */
    public void getMDRegions(javax.xml.ws.Holder<Integer> asyncId,javax.xml.ws.Holder<MDRegionList> regionList) {
        LOG.info("Executing operation getMDRegions");
        System.out.println(asyncId.value);
        try {
            MDRegionList regionListValue = null;
            regionList.value = regionListValue;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.motionDetectionV1.MotionDetectionPortType#setMDRegions(com.cmos.ipa.service.video_surveillance.motionDetectionV1.MDRegionList  regionList ,)java.lang.Integer  asyncId )*
     */
    public void setMDRegions(MDRegionList regionList,javax.xml.ws.Holder<Integer> asyncId) {
        LOG.info("Executing operation setMDRegions");
        System.out.println(regionList);
        System.out.println(asyncId.value);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.motionDetectionV1.MotionDetectionPortType#setMDConfiguration(com.cmos.ipa.service.video_surveillance.motionDetectionV1.MDConfig  mdConfig )*
     */
    public void setMDConfiguration(MDConfig mdConfig) {
        LOG.info("Executing operation setMDConfiguration");
        System.out.println(mdConfig);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
