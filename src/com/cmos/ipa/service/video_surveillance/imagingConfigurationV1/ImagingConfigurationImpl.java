
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.cmos.ipa.service.video_surveillance.imagingConfigurationV1;

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
 * 2016-05-12T18:18:15.461+08:00
 * Generated source version: 3.1.6
 * 
 */

@WebService(
                      serviceName = "ImagingConfiguration",
                      portName = "ImagingConfiguration",
                      targetNamespace = "http://www.pelco.com/api/ImagingConfiguration/1",
                      wsdlLocation = "file:a/ImagingConfigurationV1.wsdl",
                      endpointInterface = "com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ImagingConfigurationPortType")
                      
public class ImagingConfigurationImpl implements ImagingConfigurationPortType {

    private static final Logger LOG = Logger.getLogger(ImagingConfigurationImpl.class.getName());

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ImagingConfigurationPortType#getColorPalette(*
     */
    public ColorPalette getColorPalette() {
        LOG.info("Executing operation getColorPalette");
        try {
            ColorPalette _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ImagingConfigurationPortType#getImageEnhancementLevel(*
     */
    public int getImageEnhancementLevel() { 
        LOG.info("Executing operation getImageEnhancementLevel");
        try {
            int _return = 0;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ImagingConfigurationPortType#setColorPalette(com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ColorPalette  colorPalette )*
     */
    public void setColorPalette(ColorPalette colorPalette) {
        LOG.info("Executing operation setColorPalette");
        System.out.println(colorPalette);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ImagingConfigurationPortType#calibrateNow(*
     */
    public void calibrateNow() { 
        LOG.info("Executing operation calibrateNow");
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ImagingConfigurationPortType#getAllColorPalettes(*
     */
    public java.util.List<ColorPalette> getAllColorPalettes() {
        LOG.info("Executing operation getAllColorPalettes");
        try {
            java.util.List<ColorPalette> _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ImagingConfigurationPortType#getRecalibrationMode(*
     */
    public RecalibrationMode getRecalibrationMode() {
        LOG.info("Executing operation getRecalibrationMode");
        try {
            RecalibrationMode _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ImagingConfigurationPortType#setRecalibrationMode(com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.RecalibrationMode  recalibrationMode )*
     */
    public void setRecalibrationMode(RecalibrationMode recalibrationMode) {
        LOG.info("Executing operation setRecalibrationMode");
        System.out.println(recalibrationMode);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ImagingConfigurationPortType#getCalibrationInterval(*
     */
    public javax.xml.datatype.Duration getCalibrationInterval() { 
        LOG.info("Executing operation getCalibrationInterval");
        try {
            javax.xml.datatype.Duration _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ImagingConfigurationPortType#setImageEnhancementLevel(int  imageEnhancementLevel )*
     */
    public void setImageEnhancementLevel(int imageEnhancementLevel) { 
        LOG.info("Executing operation setImageEnhancementLevel");
        System.out.println(imageEnhancementLevel);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ImagingConfigurationPortType#getSharpness(*
     */
    public ModeValuePair getSharpness() {
        LOG.info("Executing operation getSharpness");
        try {
            ModeValuePair _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ImagingConfigurationPortType#setSharpness(com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ModeValuePair  sharpness )*
     */
    public void setSharpness(ModeValuePair sharpness) {
        LOG.info("Executing operation setSharpness");
        System.out.println(sharpness);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ImagingConfigurationPortType#delayRecalibration(javax.xml.datatype.Duration  calibrationDelay )*
     */
    public void delayRecalibration(javax.xml.datatype.Duration calibrationDelay) { 
        LOG.info("Executing operation delayRecalibration");
        System.out.println(calibrationDelay);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ImagingConfigurationPortType#setCalibrationInterval(javax.xml.datatype.Duration  calibrationInterval )*
     */
    public void setCalibrationInterval(javax.xml.datatype.Duration calibrationInterval) { 
        LOG.info("Executing operation setCalibrationInterval");
        System.out.println(calibrationInterval);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
