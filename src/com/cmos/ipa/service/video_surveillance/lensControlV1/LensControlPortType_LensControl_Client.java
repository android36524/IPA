
package com.cmos.ipa.service.video_surveillance.lensControlV1;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-12T18:18:18.045+08:00
 * Generated source version: 3.1.6
 * 
 */
public final class LensControlPortType_LensControl_Client {

    private static final QName SERVICE_NAME = new QName("urn:schemas-pelco-com:service:LensControl:1", "LensControl");

    private LensControlPortType_LensControl_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = LensControl.WSDL_LOCATION;
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
      
        LensControl ss = new LensControl(wsdlURL, SERVICE_NAME);
        LensControlPortType port = ss.getLensControl();  
        
        {
        System.out.println("Invoking getMaxDigitalMag...");
        long _getMaxDigitalMag__return = port.getMaxDigitalMag();
        System.out.println("getMaxDigitalMag.result=" + _getMaxDigitalMag__return);


        }
        {
        System.out.println("Invoking getMaxAOV...");
        long _getMaxAOV__return = port.getMaxAOV();
        System.out.println("getMaxAOV.result=" + _getMaxAOV__return);


        }
        {
        System.out.println("Invoking stop...");
        port.stop();


        }
        {
        System.out.println("Invoking autoFocus...");
        int _autoFocus_onOff = 0;
        port.autoFocus(_autoFocus_onOff);


        }
        {
        System.out.println("Invoking getMaxMag...");
        long _getMaxMag__return = port.getMaxMag();
        System.out.println("getMaxMag.result=" + _getMaxMag__return);


        }
        {
        System.out.println("Invoking zoom...");
        long _zoom_inOut = 0;
        port.zoom(_zoom_inOut);


        }
        {
        System.out.println("Invoking focus...");
        long _focus_nearFar = 0;
        port.focus(_focus_nearFar);


        }
        {
        System.out.println("Invoking setMag...");
        long _setMag_magnification = 0;
        port.setMag(_setMag_magnification);


        }
        {
        System.out.println("Invoking autoIris...");
        int _autoIris_onOff = 0;
        port.autoIris(_autoIris_onOff);


        }
        {
        System.out.println("Invoking getMaxOpticalMag...");
        long _getMaxOpticalMag__return = port.getMaxOpticalMag();
        System.out.println("getMaxOpticalMag.result=" + _getMaxOpticalMag__return);


        }
        {
        System.out.println("Invoking iris...");
        long _iris_openClose = 0;
        port.iris(_iris_openClose);


        }
        {
        System.out.println("Invoking getMag...");
        long _getMag__return = port.getMag();
        System.out.println("getMag.result=" + _getMag__return);


        }

        System.exit(0);
    }

}