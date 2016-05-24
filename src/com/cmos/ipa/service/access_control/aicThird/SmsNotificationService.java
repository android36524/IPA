package com.cmos.ipa.service.access_control.aicThird;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-20T09:51:20.593+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "SmsNotificationService", 
                  wsdlLocation = "file:wsdl/AICThird.wsdl",
                  targetNamespace = "http://www.sdp.com.cn/wsdl/sag/sms/notification/v2_1/interface") 
public class SmsNotificationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.sdp.com.cn/wsdl/sag/sms/notification/v2_1/interface", "SmsNotificationService");
    public final static QName SmsNotificationPort1 = new QName("http://www.sdp.com.cn/wsdl/sag/sms/notification/v2_1/interface", "SmsNotificationPort1");
    public final static QName SmsNotificationPort = new QName("http://www.sdp.com.cn/wsdl/sag/sms/notification/v2_1/interface", "SmsNotificationPort");
    static {
        URL url = null;
        try {
            url = new URL("file:wsdl/AICThird.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SmsNotificationService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:wsdl/AICThird.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SmsNotificationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SmsNotificationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SmsNotificationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SmsNotificationService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SmsNotificationService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SmsNotificationService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SmsNotificationPort
     */
    @WebEndpoint(name = "SmsNotificationPort1")
    public SmsNotificationPort getSmsNotificationPort1() {
        return super.getPort(SmsNotificationPort1, SmsNotificationPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SmsNotificationPort
     */
    @WebEndpoint(name = "SmsNotificationPort1")
    public SmsNotificationPort getSmsNotificationPort1(WebServiceFeature... features) {
        return super.getPort(SmsNotificationPort1, SmsNotificationPort.class, features);
    }


    /**
     *
     * @return
     *     returns SmsNotificationPort
     */
    @WebEndpoint(name = "SmsNotificationPort")
    public SmsNotificationPort getSmsNotificationPort() {
        return super.getPort(SmsNotificationPort, SmsNotificationPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SmsNotificationPort
     */
    @WebEndpoint(name = "SmsNotificationPort")
    public SmsNotificationPort getSmsNotificationPort(WebServiceFeature... features) {
        return super.getPort(SmsNotificationPort, SmsNotificationPort.class, features);
    }

}