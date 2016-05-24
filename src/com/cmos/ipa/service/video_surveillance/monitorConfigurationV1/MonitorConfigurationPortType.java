package com.cmos.ipa.service.video_surveillance.monitorConfigurationV1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-12T18:18:23.556+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", name = "MonitorConfigurationPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface MonitorConfigurationPortType {

    /**
     * Returns a given monitor's configuration to factory defaults.
     * 			
     */
    @WebMethod(operationName = "ResetConfiguration", action = "urn:schemas-pelco-com:service:MonitorConfiguration:1#ResetConfiguration")
    @RequestWrapper(localName = "ResetConfiguration", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.ResetConfiguration")
    @ResponseWrapper(localName = "ResetConfigurationResponse", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.ResetConfigurationResponse")
    public void resetConfiguration();

    /**
     * Instructs the monitor to visually identify itself on screen
     * 				for maintenance purposes.
     * 			
     */
    @WebMethod(operationName = "Identify", action = "urn:schemas-pelco-com:service:MonitorConfiguration:1#Identify")
    @RequestWrapper(localName = "Identify", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.Identify")
    @ResponseWrapper(localName = "IdentifyResponse", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.IdentifyResponse")
    @WebResult(name = "displayName", targetNamespace = "")
    public String identify();

    /**
     * Updates a given channel's configuration.
     * 			
     */
    @WebMethod(operationName = "SetChannelConfiguration", action = "urn:schemas-pelco-com:service:MonitorConfiguration:1#SetChannelConfiguration")
    @RequestWrapper(localName = "SetChannelConfiguration", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.SetChannelConfiguration")
    @ResponseWrapper(localName = "SetChannelConfigurationResponse", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.SetChannelConfigurationResponse")
    public void setChannelConfiguration(
            @WebParam(name = "channelConfig", targetNamespace = "")
            ChannelConfig channelConfig
    );

    /**
     * Returns the currently active channel number.
     * 			
     */
    @WebMethod(operationName = "GetActiveChannel", action = "urn:schemas-pelco-com:service:MonitorConfiguration:1#GetActiveChannel")
    @RequestWrapper(localName = "GetActiveChannel", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.GetActiveChannel")
    @ResponseWrapper(localName = "GetActiveChannelResponse", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.GetActiveChannelResponse")
    @WebResult(name = "activeChannel", targetNamespace = "")
    public int getActiveChannel();

    /**
     * Returns a given channel's current configuration.
     * 			
     */
    @WebMethod(operationName = "GetChannelConfiguration", action = "urn:schemas-pelco-com:service:MonitorConfiguration:1#GetChannelConfiguration")
    @RequestWrapper(localName = "GetChannelConfiguration", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.GetChannelConfiguration")
    @ResponseWrapper(localName = "GetChannelConfigurationResponse", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.GetChannelConfigurationResponse")
    public void getChannelConfiguration(
            @WebParam(mode = WebParam.Mode.INOUT, name = "channelConfig", targetNamespace = "")
            javax.xml.ws.Holder<ChannelConfig> channelConfig
    );

    /**
     * Returns the current monitor layout.
     * 			
     */
    @WebMethod(operationName = "GetLayout", action = "urn:schemas-pelco-com:service:MonitorConfiguration:1#GetLayout")
    @RequestWrapper(localName = "GetLayout", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.GetLayout")
    @ResponseWrapper(localName = "GetLayoutResponse", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.GetLayoutResponse")
    @WebResult(name = "layout", targetNamespace = "")
    public int getLayout();

    /**
     * Returns the current volume.
     * 			
     */
    @WebMethod(operationName = "GetVolume", action = "urn:schemas-pelco-com:service:MonitorConfiguration:1#GetVolume")
    @RequestWrapper(localName = "GetVolume", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.GetVolume")
    @ResponseWrapper(localName = "GetVolumeResponse", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.GetVolumeResponse")
    @WebResult(name = "volume", targetNamespace = "")
    public int getVolume();

    /**
     * Makes a desired channel active.
     * 			
     */
    @WebMethod(operationName = "SetActiveChannel", action = "urn:schemas-pelco-com:service:MonitorConfiguration:1#SetActiveChannel")
    @RequestWrapper(localName = "SetActiveChannel", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.SetActiveChannel")
    @ResponseWrapper(localName = "SetActiveChannelResponse", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.SetActiveChannelResponse")
    public void setActiveChannel(
            @WebParam(name = "activeChannel", targetNamespace = "")
            int activeChannel
    );

    /**
     * Returns a given monitors's current configuration.
     * 			
     */
    @WebMethod(operationName = "GetMonitorConfiguration", action = "urn:schemas-pelco-com:service:MonitorConfiguration:1#GetMonitorConfiguration")
    @RequestWrapper(localName = "GetMonitorConfiguration", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.GetMonitorConfiguration")
    @ResponseWrapper(localName = "GetMonitorConfigurationResponse", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.GetMonitorConfigurationResponse")
    @WebResult(name = "monitorConfig", targetNamespace = "")
    public MonitorConfig getMonitorConfiguration();

    /**
     * Sets a given monitor's configuration.
     * 			
     */
    @WebMethod(operationName = "SetMonitorConfiguration", action = "urn:schemas-pelco-com:service:MonitorConfiguration:1#SetMonitorConfiguration")
    @RequestWrapper(localName = "SetMonitorConfiguration", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.SetMonitorConfiguration")
    @ResponseWrapper(localName = "SetMonitorConfigurationResponse", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.SetMonitorConfigurationResponse")
    public void setMonitorConfiguration(
            @WebParam(name = "monitorConfig", targetNamespace = "")
            MonitorConfig monitorConfig
    );

    /**
     * Sets the desired monitor layout.
     * 			
     */
    @WebMethod(operationName = "SetLayout", action = "urn:schemas-pelco-com:service:MonitorConfiguration:1#SetLayout")
    @RequestWrapper(localName = "SetLayout", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.SetLayout")
    @ResponseWrapper(localName = "SetLayoutResponse", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.SetLayoutResponse")
    public void setLayout(
            @WebParam(name = "layout", targetNamespace = "")
            int layout
    );

    /**
     * Sets the desired volume.
     * 			
     */
    @WebMethod(operationName = "SetVolume", action = "urn:schemas-pelco-com:service:MonitorConfiguration:1#SetVolume")
    @RequestWrapper(localName = "SetVolume", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.SetVolume")
    @ResponseWrapper(localName = "SetVolumeResponse", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.SetVolumeResponse")
    public void setVolume(
            @WebParam(name = "volume", targetNamespace = "")
            int volume
    );

    /**
     * Clears any alert text associated with the channel identified by channelId.
     * 			
     */
    @WebMethod(operationName = "ClearAlert", action = "urn:schemas-pelco-com:service:MonitorConfiguration:1#ClearAlert")
    @RequestWrapper(localName = "ClearAlert", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.ClearAlert")
    @ResponseWrapper(localName = "ClearAlertResponse", targetNamespace = "urn:schemas-pelco-com:service:MonitorConfiguration:1", className = "com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.ClearAlertResponse")
    public void clearAlert(
            @WebParam(name = "channelId", targetNamespace = "")
            int channelId
    );
}