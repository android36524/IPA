
package com.cmos.ipa.service.video_surveillance.audioInputRtspV1;

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
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-12T18:17:57.794+08:00
 * Generated source version: 3.1.6
 * 
 */
public final class AudioInputRtspPortType_AudioInputRtsp_Client {

    private static final QName SERVICE_NAME = new QName("urn:schemas-pelco-com:service:AudioInputRtsp:1", "AudioInputRtsp");

    private AudioInputRtspPortType_AudioInputRtsp_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = AudioInputRtsp.WSDL_LOCATION;
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
      
        AudioInputRtsp ss = new AudioInputRtsp(wsdlURL, SERVICE_NAME);
        AudioInputRtspPortType port = ss.getAudioInputRtsp();  
        
        {
        System.out.println("Invoking setChannelParameters...");
        SetChannelParameters _setChannelParameters_parameters = null;
        Object _setChannelParameters__return = port.setChannelParameters(_setChannelParameters_parameters);
        System.out.println("setChannelParameters.result=" + _setChannelParameters__return);


        }
        {
        System.out.println("Invoking setEnabled...");
        boolean _setEnabled_enabled = false;
        port.setEnabled(_setEnabled_enabled);


        }
        {
        System.out.println("Invoking getChannelParameters...");
        int _getChannelParameters_channelId = 0;
        AudioOutSettings _getChannelParameters__return = port.getChannelParameters(_getChannelParameters_channelId);
        System.out.println("getChannelParameters.result=" + _getChannelParameters__return);


        }
        {
        System.out.println("Invoking disconnect...");
        int _disconnect_streamId = 0;
        String _disconnect__return = port.disconnect(_disconnect_streamId);
        System.out.println("disconnect.result=" + _disconnect__return);


        }
        {
        System.out.println("Invoking getEnabled...");
        boolean _getEnabled__return = port.getEnabled();
        System.out.println("getEnabled.result=" + _getEnabled__return);


        }
        {
        System.out.println("Invoking query...");
        ChannelInfoList _query__return = port.query();
        System.out.println("query.result=" + _query__return);


        }
        {
        System.out.println("Invoking connect...");
        String _connect_sourceURI = "";
        int _connect_channelId = 0;
        int _connect_sessionTimeoutSeconds = 0;
        javax.xml.ws.Holder<Integer> _connect_streamId = new javax.xml.ws.Holder<Integer>();
        javax.xml.ws.Holder<String> _connect_streamStatus = new javax.xml.ws.Holder<String>();
        port.connect(_connect_sourceURI, _connect_channelId, _connect_sessionTimeoutSeconds, _connect_streamId, _connect_streamStatus);

        System.out.println("connect._connect_streamId=" + _connect_streamId.value);
        System.out.println("connect._connect_streamStatus=" + _connect_streamStatus.value);

        }
        {
        System.out.println("Invoking keepAlive...");
        int _keepAlive_streamId = 0;
        String _keepAlive__return = port.keepAlive(_keepAlive_streamId);
        System.out.println("keepAlive.result=" + _keepAlive__return);


        }

        System.exit(0);
    }

}
