
package com.cmos.ipa.service.video_surveillance.positioningControlV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AzimuthZero" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "azimuthZero"
})
@XmlRootElement(name = "SetAzimuthZero")
public class SetAzimuthZero {

    @XmlElement(name = "AzimuthZero")
    protected int azimuthZero;

    /**
     * 获取azimuthZero属性的值。
     * 
     */
    public int getAzimuthZero() {
        return azimuthZero;
    }

    /**
     * 设置azimuthZero属性的值。
     * 
     */
    public void setAzimuthZero(int value) {
        this.azimuthZero = value;
    }

}
