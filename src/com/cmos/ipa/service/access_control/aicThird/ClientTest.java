
package com.cmos.ipa.service.access_control.aicThird;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-20T09:51:20.459+08:00
 * Generated source version: 3.1.6
 * 
 */
public final class ClientTest {

    private static final QName SERVICE_NAME = new QName("http://www.sdp.com.cn/wsdl/sag/sms/notification/v2_1/interface", "SmsNotificationService");

    private ClientTest() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = SmsNotificationService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        SmsNotificationService ss = new SmsNotificationService(wsdlURL, SERVICE_NAME);
        SmsNotificationPort port = ss.getSmsNotificationPort();

        {
            System.out.println("Invoking query...");
            int _query_type = 19;
            String _query__return = port.query(_query_type);
            System.out.println("query.result=" + _query__return);


        }

//        {
//            System.out.println("Invoking cmdOutput...");
//            String _cmdOutput_ipAddr = "127.0.0.1";
//            int _cmdOutput_target = 1;
//            int _cmdOutput_functioncode = 0;
//            int _cmdOutput_state = 1;
//            int _cmdOutput__return = port.cmdOutput(_cmdOutput_ipAddr, _cmdOutput_target, _cmdOutput_functioncode, _cmdOutput_state);
//            System.out.println("cmdOutput.result=" + _cmdOutput__return);
//
//
//        }

        System.exit(0);
    }

}