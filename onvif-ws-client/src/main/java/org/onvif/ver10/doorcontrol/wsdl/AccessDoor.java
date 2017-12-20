
package org.onvif.ver10.doorcontrol.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Token" type="{http://www.onvif.org/ver10/pacs}ReferenceToken"/&gt;
 *         &lt;element name="UseExtendedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AccessTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="OpenTooLongTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreAlarmTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}AccessDoorExtension" minOccurs="0"/&gt;
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
    "token",
    "useExtendedTime",
    "accessTime",
    "openTooLongTime",
    "preAlarmTime",
    "extension"
})
@XmlRootElement(name = "AccessDoor")
public class AccessDoor {

    @XmlElement(name = "Token", required = true)
    protected String token;
    @XmlElement(name = "UseExtendedTime")
    protected Boolean useExtendedTime;
    @XmlElement(name = "AccessTime")
    protected Duration accessTime;
    @XmlElement(name = "OpenTooLongTime")
    protected Duration openTooLongTime;
    @XmlElement(name = "PreAlarmTime")
    protected Duration preAlarmTime;
    @XmlElement(name = "Extension")
    protected AccessDoorExtension extension;

    /**
     * Recupera il valore della proprietà token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Imposta il valore della proprietà token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Recupera il valore della proprietà useExtendedTime.
     * This getter has been renamed from isUseExtendedTime() to getUseExtendedTime() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseExtendedTime() {
        return useExtendedTime;
    }

    /**
     * Imposta il valore della proprietà useExtendedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseExtendedTime(Boolean value) {
        this.useExtendedTime = value;
    }

    /**
     * Recupera il valore della proprietà accessTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAccessTime() {
        return accessTime;
    }

    /**
     * Imposta il valore della proprietà accessTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAccessTime(Duration value) {
        this.accessTime = value;
    }

    /**
     * Recupera il valore della proprietà openTooLongTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOpenTooLongTime() {
        return openTooLongTime;
    }

    /**
     * Imposta il valore della proprietà openTooLongTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOpenTooLongTime(Duration value) {
        this.openTooLongTime = value;
    }

    /**
     * Recupera il valore della proprietà preAlarmTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreAlarmTime() {
        return preAlarmTime;
    }

    /**
     * Imposta il valore della proprietà preAlarmTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreAlarmTime(Duration value) {
        this.preAlarmTime = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link AccessDoorExtension }
     *     
     */
    public AccessDoorExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessDoorExtension }
     *     
     */
    public void setExtension(AccessDoorExtension value) {
        this.extension = value;
    }

}
