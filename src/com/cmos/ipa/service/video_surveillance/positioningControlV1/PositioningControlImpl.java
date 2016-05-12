
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.cmos.ipa.service.video_surveillance.positioningControlV1;

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
 * 2016-05-12T18:18:32.395+08:00
 * Generated source version: 3.1.6
 * 
 */

@WebService(
                      serviceName = "PositioningControl",
                      portName = "PositioningControl",
                      targetNamespace = "urn:schemas-pelco-com:service:PositioningControl:1",
                      wsdlLocation = "file:a/PositioningControlV1.wsdl",
                      endpointInterface = "com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType")
                      
public class PositioningControlImpl implements PositioningControlPortType {

    private static final Logger LOG = Logger.getLogger(PositioningControlImpl.class.getName());

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#getPositionEventInterval(*
     */
    public String getPositionEventInterval() {
        LOG.info("Executing operation getPositionEventInterval");
        try {
            String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#setPosition(com.cmos.ipa.service.video_surveillance.positioningControlV1.Velocity  position )*
     */
    public void setPosition(Velocity position) {
        LOG.info("Executing operation setPosition");
        System.out.println(position);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#initializePosition(com.cmos.ipa.service.video_surveillance.positioningControlV1.Velocity  position )*
     */
    public void initializePosition(Velocity position) {
        LOG.info("Executing operation initializePosition");
        System.out.println(position);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#setPositionEventInterval(java.lang.String  positionEventInterval )*
     */
    public void setPositionEventInterval(String positionEventInterval) {
        LOG.info("Executing operation setPositionEventInterval");
        System.out.println(positionEventInterval);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#setVelocity(com.cmos.ipa.service.video_surveillance.positioningControlV1.Velocity  velocity )*
     */
    public void setVelocity(Velocity velocity) {
        LOG.info("Executing operation setVelocity");
        System.out.println(velocity);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#getSpeedProfile(java.lang.String  profileId )*
     */
    public SpeedProfile getSpeedProfile(String profileId) {
        LOG.info("Executing operation getSpeedProfile");
        System.out.println(profileId);
        try {
            SpeedProfile _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#getVelocityURL(*
     */
    public String getVelocityURL() {
        LOG.info("Executing operation getVelocityURL");
        try {
            String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#getPosition(*
     */
    public Velocity getPosition() {
        LOG.info("Executing operation getPosition");
        try {
            Velocity _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#getVelocity(*
     */
    public Velocity getVelocity() {
        LOG.info("Executing operation getVelocity");
        try {
            Velocity _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#getVelocityLimits(*
     */
    public VelocityLimits getVelocityLimits() {
        LOG.info("Executing operation getVelocityLimits");
        try {
            VelocityLimits _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#getAllSpeedProfiles(*
     */
    public java.util.List<SpeedProfile> getAllSpeedProfiles() {
        LOG.info("Executing operation getAllSpeedProfiles");
        try {
            java.util.List<SpeedProfile> _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#getPositionLimits(*
     */
    public AxisLimits getPositionLimits() {
        LOG.info("Executing operation getPositionLimits");
        try {
            AxisLimits _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#restoreDefaultPositionLimits(*
     */
    public void restoreDefaultPositionLimits() { 
        LOG.info("Executing operation restoreDefaultPositionLimits");
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#enableSpeedProfile(java.lang.String  profileId )*
     */
    public void enableSpeedProfile(String profileId) {
        LOG.info("Executing operation enableSpeedProfile");
        System.out.println(profileId);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#restoreDefaultSpeedProfile(*
     */
    public void restoreDefaultSpeedProfile() { 
        LOG.info("Executing operation restoreDefaultSpeedProfile");
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#getEnabledSpeedProfile(*
     */
    public SpeedProfile getEnabledSpeedProfile() {
        LOG.info("Executing operation getEnabledSpeedProfile");
        try {
            SpeedProfile _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#setAzimuthZero(int  azimuthZero )*
     */
    public void setAzimuthZero(int azimuthZero) { 
        LOG.info("Executing operation setAzimuthZero");
        System.out.println(azimuthZero);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#getAzimuthZero(*
     */
    public int getAzimuthZero() { 
        LOG.info("Executing operation getAzimuthZero");
        try {
            int _return = 0;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.positioningControlV1.PositioningControlPortType#viewObject(com.cmos.ipa.service.video_surveillance.positioningControlV1.Velocity  position ,)long  radius )*
     */
    public void viewObject(Velocity position,long radius) {
        LOG.info("Executing operation viewObject");
        System.out.println(position);
        System.out.println(radius);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
