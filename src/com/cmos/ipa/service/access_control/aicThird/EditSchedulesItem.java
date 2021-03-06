
package com.cmos.ipa.service.access_control.aicThird;

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
 *         &lt;element name="Guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SchedulesGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IntervalID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Begintime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Endtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "guid",
    "schedulesGuid",
    "day",
    "intervalID",
    "begintime",
    "endtime",
    "extParam"
})
@XmlRootElement(name = "EditSchedulesItem")
public class EditSchedulesItem {

    @XmlElement(name = "Guid")
    protected String guid;
    @XmlElement(name = "SchedulesGuid")
    protected String schedulesGuid;
    @XmlElement(name = "Day")
    protected int day;
    @XmlElement(name = "IntervalID")
    protected int intervalID;
    @XmlElement(name = "Begintime")
    protected String begintime;
    @XmlElement(name = "Endtime")
    protected String endtime;
    protected String extParam;

    /**
     * 获取guid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * 设置guid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * 获取schedulesGuid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedulesGuid() {
        return schedulesGuid;
    }

    /**
     * 设置schedulesGuid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedulesGuid(String value) {
        this.schedulesGuid = value;
    }

    /**
     * 获取day属性的值。
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * 设置day属性的值。
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * 获取intervalID属性的值。
     * 
     */
    public int getIntervalID() {
        return intervalID;
    }

    /**
     * 设置intervalID属性的值。
     * 
     */
    public void setIntervalID(int value) {
        this.intervalID = value;
    }

    /**
     * 获取begintime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegintime() {
        return begintime;
    }

    /**
     * 设置begintime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegintime(String value) {
        this.begintime = value;
    }

    /**
     * 获取endtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * 设置endtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndtime(String value) {
        this.endtime = value;
    }

    /**
     * 获取extParam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtParam() {
        return extParam;
    }

    /**
     * 设置extParam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtParam(String value) {
        this.extParam = value;
    }

}
