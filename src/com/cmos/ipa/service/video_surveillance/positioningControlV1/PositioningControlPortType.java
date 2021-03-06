package com.cmos.ipa.service.video_surveillance.positioningControlV1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-12T18:18:32.422+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", name = "PositioningControlPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface PositioningControlPortType {

    @WebMethod(operationName = "GetPositionEventInterval", action = "urn:schemas-pelco-com:service:PositioningControl:1#GetPositionEventInterval")
    @RequestWrapper(localName = "GetPositionEventInterval", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetPositionEventInterval")
    @ResponseWrapper(localName = "GetPositionEventIntervalResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetPositionEventIntervalResponse")
    @WebResult(name = "positionEventInterval", targetNamespace = "")
    public String getPositionEventInterval();

    /**
     * Translates/Rotates the device to the absolute position coordinates indicated by the request's Velocity instance.
     */
    @WebMethod(operationName = "SetPosition", action = "urn:schemas-pelco-com:service:PositioningControl:1#SetPosition")
    @RequestWrapper(localName = "SetPosition", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.SetPosition")
    @ResponseWrapper(localName = "SetPositionResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.SetPositionResponse")
    public void setPosition(
            @WebParam(name = "position", targetNamespace = "")
            Velocity position
    );

    /**
     * Initializes the current position of the device to its absolute position within a global coordinate system. 
     */
    @WebMethod(operationName = "InitializePosition", action = "urn:schemas-pelco-com:service:PositioningControl:1#InitializePosition")
    @RequestWrapper(localName = "InitializePosition", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.InitializePosition")
    @ResponseWrapper(localName = "InitializePositionResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.InitializePositionResponse")
    public void initializePosition(
            @WebParam(name = "position", targetNamespace = "")
            Velocity position
    );

    @WebMethod(operationName = "SetPositionEventInterval", action = "urn:schemas-pelco-com:service:PositioningControl:1#SetPositionEventInterval")
    @RequestWrapper(localName = "SetPositionEventInterval", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.SetPositionEventInterval")
    @ResponseWrapper(localName = "SetPositionEventIntervalResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.SetPositionEventIntervalResponse")
    public void setPositionEventInterval(
            @WebParam(name = "positionEventInterval", targetNamespace = "")
            String positionEventInterval
    );

    @WebMethod(operationName = "SetVelocity", action = "urn:schemas-pelco-com:service:PositioningControl:1#SetVelocity")
    @RequestWrapper(localName = "SetVelocity", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.SetVelocity")
    @ResponseWrapper(localName = "SetVelocityResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.SetVelocityResponse")
    public void setVelocity(
            @WebParam(name = "velocity", targetNamespace = "")
            Velocity velocity
    );

    /**
     * Retrieves a Speed profile for a given profile id
     */
    @WebMethod(operationName = "GetSpeedProfile", action = "urn:schemas-pelco-com:service:PositioningControl:1#GetSpeedProfile")
    @RequestWrapper(localName = "GetSpeedProfile", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetSpeedProfile")
    @ResponseWrapper(localName = "GetSpeedProfileResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetSpeedProfileResponse")
    @WebResult(name = "SpeedProfile", targetNamespace = "")
    public SpeedProfile getSpeedProfile(
            @WebParam(name = "ProfileId", targetNamespace = "")
            String profileId
    );

    /**
     * Returns the URL to which SetVelocity commands can be issued through UDP.
     */
    @WebMethod(operationName = "GetVelocityURL", action = "urn:schemas-pelco-com:service:PositioningControl:1#GetVelocityURL")
    @RequestWrapper(localName = "GetVelocityURL", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetVelocityURL")
    @ResponseWrapper(localName = "GetVelocityURLResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetVelocityURLResponse")
    @WebResult(name = "velocityURL", targetNamespace = "")
    public String getVelocityURL();

    @WebMethod(operationName = "GetPosition", action = "urn:schemas-pelco-com:service:PositioningControl:1#GetPosition")
    @RequestWrapper(localName = "GetPosition", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetPosition")
    @ResponseWrapper(localName = "GetPositionResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetPositionResponse")
    @WebResult(name = "position", targetNamespace = "")
    public Velocity getPosition();

    @WebMethod(operationName = "GetVelocity", action = "urn:schemas-pelco-com:service:PositioningControl:1#GetVelocity")
    @RequestWrapper(localName = "GetVelocity", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetVelocity")
    @ResponseWrapper(localName = "GetVelocityResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetVelocityResponse")
    @WebResult(name = "velocity", targetNamespace = "")
    public Velocity getVelocity();

    /**
     * Returns the current translational/rotational velocity limits of the device.
     */
    @WebMethod(operationName = "GetVelocityLimits", action = "urn:schemas-pelco-com:service:PositioningControl:1#GetVelocityLimits")
    @RequestWrapper(localName = "GetVelocityLimits", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetVelocityLimits")
    @ResponseWrapper(localName = "GetVelocityLimitsResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetVelocityLimitsResponse")
    @WebResult(name = "velocityLimits", targetNamespace = "")
    public VelocityLimits getVelocityLimits();

    /**
     * Retrieves all available Speed Profiles.
     */
    @WebMethod(operationName = "GetAllSpeedProfiles", action = "urn:schemas-pelco-com:service:PositioningControl:1#GetAllSpeedProfiles")
    @RequestWrapper(localName = "GetAllSpeedProfiles", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetAllSpeedProfiles")
    @ResponseWrapper(localName = "GetAllSpeedProfilesResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetAllSpeedProfilesResponse")
    @WebResult(name = "SpeedProfile", targetNamespace = "")
    public java.util.List<SpeedProfile> getAllSpeedProfiles();

    /**
     * Gets the position limits associated with the device.
     */
    @WebMethod(operationName = "GetPositionLimits", action = "urn:schemas-pelco-com:service:PositioningControl:1#GetPositionLimits")
    @RequestWrapper(localName = "GetPositionLimits", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetPositionLimits")
    @ResponseWrapper(localName = "GetPositionLimitsResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetPositionLimitsResponse")
    @WebResult(name = "positionLimits", targetNamespace = "")
    public AxisLimits getPositionLimits();

    /**
     * Enables the default position limits
     */
    @WebMethod(operationName = "RestoreDefaultPositionLimits", action = "urn:schemas-pelco-com:service:PositioningControl:1#RestoreDefaultPositionLimits")
    @RequestWrapper(localName = "RestoreDefaultPositionLimits", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.RestoreDefaultPositionLimits")
    @ResponseWrapper(localName = "RestoreDefaultPositionLimitsResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.RestoreDefaultPositionLimitsResponse")
    public void restoreDefaultPositionLimits();

    /**
     * Enables a speed profile.
     */
    @WebMethod(operationName = "EnableSpeedProfile", action = "urn:schemas-pelco-com:service:PositioningControl:1#EnableSpeedProfile")
    @RequestWrapper(localName = "EnableSpeedProfile", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.EnableSpeedProfile")
    @ResponseWrapper(localName = "EnableSpeedProfileResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.EnableSpeedProfileResponse")
    public void enableSpeedProfile(
            @WebParam(name = "ProfileId", targetNamespace = "")
            String profileId
    );

    /**
     * Enables the default speed profile
     */
    @WebMethod(operationName = "RestoreDefaultSpeedProfile", action = "urn:schemas-pelco-com:service:PositioningControl:1#RestoreDefaultSpeedProfile")
    @RequestWrapper(localName = "RestoreDefaultSpeedProfile", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.RestoreDefaultSpeedProfile")
    @ResponseWrapper(localName = "RestoreDefaultSpeedProfileResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.RestoreDefaultSpeedProfileResponse")
    public void restoreDefaultSpeedProfile();

    /**
     * Retrieves the currently enabled Speed Profile.
     */
    @WebMethod(operationName = "GetEnabledSpeedProfile", action = "urn:schemas-pelco-com:service:PositioningControl:1#GetEnabledSpeedProfile")
    @RequestWrapper(localName = "GetEnabledSpeedProfile", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetEnabledSpeedProfile")
    @ResponseWrapper(localName = "GetEnabledSpeedProfileResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetEnabledSpeedProfileResponse")
    @WebResult(name = "EnabledSpeedProfile", targetNamespace = "")
    public SpeedProfile getEnabledSpeedProfile();

    /**
     * Azimuth Zero is defined as north on the x-axis in the spherical coordinate system. It is an angular measurement with centidegrees for units (from 0-36000). There is no y or z component. This basically sets "North" in the device.
     */
    @WebMethod(operationName = "SetAzimuthZero", action = "urn:schemas-pelco-com:service:PositioningControl:1#SetAzimuthZero")
    @RequestWrapper(localName = "SetAzimuthZero", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.SetAzimuthZero")
    @ResponseWrapper(localName = "SetAzimuthZeroResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.SetAzimuthZeroResponse")
    public void setAzimuthZero(
            @WebParam(name = "AzimuthZero", targetNamespace = "")
            int azimuthZero
    );

    /**
     * The internal position (in centidegrees) of the current azimuth zero setting.
     */
    @WebMethod(operationName = "GetAzimuthZero", action = "urn:schemas-pelco-com:service:PositioningControl:1#GetAzimuthZero")
    @RequestWrapper(localName = "GetAzimuthZero", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetAzimuthZero")
    @ResponseWrapper(localName = "GetAzimuthZeroResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.GetAzimuthZeroResponse")
    @WebResult(name = "AzimuthZero", targetNamespace = "")
    public int getAzimuthZero();

    @WebMethod(operationName = "ViewObject", action = "urn:schemas-pelco-com:service:PositioningControl:1#ViewObject")
    @RequestWrapper(localName = "ViewObject", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.ViewObject")
    @ResponseWrapper(localName = "ViewObjectResponse", targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1", className = "com.cmos.ipa.service.video_surveillance.positioningControlV1.ViewObjectResponse")
    public void viewObject(
            @WebParam(name = "position", targetNamespace = "")
            Velocity position,
            @WebParam(name = "radius", targetNamespace = "")
            long radius
    );
}
