
package com.cmos.ipa.service.video_surveillance.deviceCapability;

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
 * 2016-05-12T18:18:09.534+08:00
 * Generated source version: 3.1.6
 * 
 */
public final class DeviceCapabilityPortType_DeviceCapability_Client {

    private static final QName SERVICE_NAME = new QName("http://www.pelco.com/api/DeviceCapability/1", "DeviceCapability");

    private DeviceCapabilityPortType_DeviceCapability_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = DeviceCapability.WSDL_LOCATION;
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
      
        DeviceCapability ss = new DeviceCapability(wsdlURL, SERVICE_NAME);
        DeviceCapabilityPortType port = ss.getDeviceCapability();  
        
        {
        System.out.println("Invoking getPrimaryStreamCapabilities...");
        CompressionFormat _getPrimaryStreamCapabilities_compressionFormat = null;
        try {
            StreamConfiguration _getPrimaryStreamCapabilities__return = port.getPrimaryStreamCapabilities(_getPrimaryStreamCapabilities_compressionFormat);
            System.out.println("getPrimaryStreamCapabilities.result=" + _getPrimaryStreamCapabilities__return);

        } catch (InvalidArgumentFault e) { 
            System.out.println("Expected exception: InvalidArgumentFault has occurred.");
            System.out.println(e.toString());
        } catch (ActionNotSupportedFault e) { 
            System.out.println("Expected exception: ActionNotSupportedFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getSecondaryStreamCapabilities...");
        CompressionFormat _getSecondaryStreamCapabilities_compressionFormat = null;
        try {
            StreamSetting _getSecondaryStreamCapabilities__return = port.getSecondaryStreamCapabilities(_getSecondaryStreamCapabilities_compressionFormat);
            System.out.println("getSecondaryStreamCapabilities.result=" + _getSecondaryStreamCapabilities__return);

        } catch (InvalidArgumentFault e) { 
            System.out.println("Expected exception: InvalidArgumentFault has occurred.");
            System.out.println(e.toString());
        } catch (ActionNotSupportedFault e) { 
            System.out.println("Expected exception: ActionNotSupportedFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDeviceCapability...");
        try {
            Capability _getDeviceCapability__return = port.getDeviceCapability();
            System.out.println("getDeviceCapability.result=" + _getDeviceCapability__return);

        } catch (ActionNotSupportedFault e) { 
            System.out.println("Expected exception: ActionNotSupportedFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getStreamConfigurations...");
        try {
            StreamConfiguration _getStreamConfigurations__return = port.getStreamConfigurations();
            System.out.println("getStreamConfigurations.result=" + _getStreamConfigurations__return);

        } catch (ActionNotSupportedFault e) { 
            System.out.println("Expected exception: ActionNotSupportedFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getServices...");
        try {
            Services _getServices__return = port.getServices();
            System.out.println("getServices.result=" + _getServices__return);

        } catch (ActionNotSupportedFault e) { 
            System.out.println("Expected exception: ActionNotSupportedFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getRecommendedStreamConfiguration...");
        ServiceNamespaces _getRecommendedStreamConfiguration_serviceNamespaces = null;
        try {
            StreamConfiguration _getRecommendedStreamConfiguration__return = port.getRecommendedStreamConfiguration(_getRecommendedStreamConfiguration_serviceNamespaces);
            System.out.println("getRecommendedStreamConfiguration.result=" + _getRecommendedStreamConfiguration__return);

        } catch (InvalidArgumentFault e) { 
            System.out.println("Expected exception: InvalidArgumentFault has occurred.");
            System.out.println(e.toString());
        } catch (ActionNotSupportedFault e) { 
            System.out.println("Expected exception: ActionNotSupportedFault has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
