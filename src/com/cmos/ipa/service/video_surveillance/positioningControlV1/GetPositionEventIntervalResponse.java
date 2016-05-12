
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
 *         &lt;element name="positionEventInterval" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "positionEventInterval"
})
@XmlRootElement(name = "GetPositionEventIntervalResponse")
public class GetPositionEventIntervalResponse {

    @XmlElement(required = true)
    protected String positionEventInterval;

    /**
     * 获取positionEventInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionEventInterval() {
        return positionEventInterval;
    }

    /**
     * 设置positionEventInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionEventInterval(String value) {
        this.positionEventInterval = value;
    }

}
