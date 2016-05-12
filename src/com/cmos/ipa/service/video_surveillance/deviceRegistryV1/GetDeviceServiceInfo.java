
package com.cmos.ipa.service.video_surveillance.deviceRegistryV1;

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
 *         &lt;element name="deviceUdn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="svcInfoFlags" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pageReq" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "deviceUdn",
    "svcInfoFlags",
    "pageReq"
})
@XmlRootElement(name = "GetDeviceServiceInfo")
public class GetDeviceServiceInfo {

    @XmlElement(required = true)
    protected String deviceUdn;
    @XmlElement(required = true)
    protected String svcInfoFlags;
    @XmlElement(required = true)
    protected String pageReq;

    /**
     * 获取deviceUdn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceUdn() {
        return deviceUdn;
    }

    /**
     * 设置deviceUdn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceUdn(String value) {
        this.deviceUdn = value;
    }

    /**
     * 获取svcInfoFlags属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcInfoFlags() {
        return svcInfoFlags;
    }

    /**
     * 设置svcInfoFlags属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcInfoFlags(String value) {
        this.svcInfoFlags = value;
    }

    /**
     * 获取pageReq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageReq() {
        return pageReq;
    }

    /**
     * 设置pageReq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageReq(String value) {
        this.pageReq = value;
    }

}
