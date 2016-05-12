package com.cmos.ipa.service.video_surveillance.metaDataV1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This service allows clients to insert text into the video stream.
 * 		
 *
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-12T18:18:20.713+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "MetaData", 
                  wsdlLocation = "file:wsdl/MetaDataV1.wsdl",
                  targetNamespace = "urn:schemas-pelco-com:service:MetaData:1") 
public class MetaData extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:schemas-pelco-com:service:MetaData:1", "MetaData");
    public final static QName MetaData = new QName("urn:schemas-pelco-com:service:MetaData:1", "MetaData");
    static {
        URL url = null;
        try {
            url = new URL("file:wsdl/MetaDataV1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MetaData.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:a/MetaDataV1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MetaData(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MetaData(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MetaData() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public MetaData(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MetaData(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MetaData(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns MetaDataPortType
     */
    @WebEndpoint(name = "MetaData")
    public MetaDataPortType getMetaData() {
        return super.getPort(MetaData, MetaDataPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MetaDataPortType
     */
    @WebEndpoint(name = "MetaData")
    public MetaDataPortType getMetaData(WebServiceFeature... features) {
        return super.getPort(MetaData, MetaDataPortType.class, features);
    }

}
