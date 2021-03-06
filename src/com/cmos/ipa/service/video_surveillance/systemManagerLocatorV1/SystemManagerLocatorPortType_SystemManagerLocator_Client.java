
package com.cmos.ipa.service.video_surveillance.systemManagerLocatorV1;

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
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-12T18:18:51.234+08:00
 * Generated source version: 3.1.6
 * 
 */
public final class SystemManagerLocatorPortType_SystemManagerLocator_Client {

    private static final QName SERVICE_NAME = new QName("urn:schemas-pelco-com:service:SystemManagerLocator:1", "SystemManagerLocator");

    private SystemManagerLocatorPortType_SystemManagerLocator_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = SystemManagerLocator.WSDL_LOCATION;
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
      
        SystemManagerLocator ss = new SystemManagerLocator(wsdlURL, SERVICE_NAME);
        SystemManagerLocatorPortType port = ss.getSystemManagerLocator();  
        
        {
        System.out.println("Invoking getLocation...");
        GetLocationHeaderType _getLocation_header = null;
        GetLocationType _getLocation_parameters = null;
        GetLocationResponseType _getLocation__return = port.getLocation(_getLocation_header, _getLocation_parameters);
        System.out.println("getLocation.result=" + _getLocation__return);


        }

        System.exit(0);
    }

}
