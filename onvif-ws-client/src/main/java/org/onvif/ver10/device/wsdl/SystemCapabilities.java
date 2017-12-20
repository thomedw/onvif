
package org.onvif.ver10.device.wsdl;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per SystemCapabilities complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SystemCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DiscoveryResolve" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DiscoveryBye" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RemoteDiscovery" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SystemBackup" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SystemLogging" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FirmwareUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HttpFirmwareUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HttpSystemBackup" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HttpSystemLogging" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HttpSupportInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="StorageConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemCapabilities")
public class SystemCapabilities {

    @XmlAttribute(name = "DiscoveryResolve")
    protected Boolean discoveryResolve;
    @XmlAttribute(name = "DiscoveryBye")
    protected Boolean discoveryBye;
    @XmlAttribute(name = "RemoteDiscovery")
    protected Boolean remoteDiscovery;
    @XmlAttribute(name = "SystemBackup")
    protected Boolean systemBackup;
    @XmlAttribute(name = "SystemLogging")
    protected Boolean systemLogging;
    @XmlAttribute(name = "FirmwareUpgrade")
    protected Boolean firmwareUpgrade;
    @XmlAttribute(name = "HttpFirmwareUpgrade")
    protected Boolean httpFirmwareUpgrade;
    @XmlAttribute(name = "HttpSystemBackup")
    protected Boolean httpSystemBackup;
    @XmlAttribute(name = "HttpSystemLogging")
    protected Boolean httpSystemLogging;
    @XmlAttribute(name = "HttpSupportInformation")
    protected Boolean httpSupportInformation;
    @XmlAttribute(name = "StorageConfiguration")
    protected Boolean storageConfiguration;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà discoveryResolve.
     * This getter has been renamed from isDiscoveryResolve() to getDiscoveryResolve() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDiscoveryResolve() {
        return discoveryResolve;
    }

    /**
     * Imposta il valore della proprietà discoveryResolve.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscoveryResolve(Boolean value) {
        this.discoveryResolve = value;
    }

    /**
     * Recupera il valore della proprietà discoveryBye.
     * This getter has been renamed from isDiscoveryBye() to getDiscoveryBye() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDiscoveryBye() {
        return discoveryBye;
    }

    /**
     * Imposta il valore della proprietà discoveryBye.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscoveryBye(Boolean value) {
        this.discoveryBye = value;
    }

    /**
     * Recupera il valore della proprietà remoteDiscovery.
     * This getter has been renamed from isRemoteDiscovery() to getRemoteDiscovery() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRemoteDiscovery() {
        return remoteDiscovery;
    }

    /**
     * Imposta il valore della proprietà remoteDiscovery.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteDiscovery(Boolean value) {
        this.remoteDiscovery = value;
    }

    /**
     * Recupera il valore della proprietà systemBackup.
     * This getter has been renamed from isSystemBackup() to getSystemBackup() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSystemBackup() {
        return systemBackup;
    }

    /**
     * Imposta il valore della proprietà systemBackup.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSystemBackup(Boolean value) {
        this.systemBackup = value;
    }

    /**
     * Recupera il valore della proprietà systemLogging.
     * This getter has been renamed from isSystemLogging() to getSystemLogging() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSystemLogging() {
        return systemLogging;
    }

    /**
     * Imposta il valore della proprietà systemLogging.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSystemLogging(Boolean value) {
        this.systemLogging = value;
    }

    /**
     * Recupera il valore della proprietà firmwareUpgrade.
     * This getter has been renamed from isFirmwareUpgrade() to getFirmwareUpgrade() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFirmwareUpgrade() {
        return firmwareUpgrade;
    }

    /**
     * Imposta il valore della proprietà firmwareUpgrade.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirmwareUpgrade(Boolean value) {
        this.firmwareUpgrade = value;
    }

    /**
     * Recupera il valore della proprietà httpFirmwareUpgrade.
     * This getter has been renamed from isHttpFirmwareUpgrade() to getHttpFirmwareUpgrade() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHttpFirmwareUpgrade() {
        return httpFirmwareUpgrade;
    }

    /**
     * Imposta il valore della proprietà httpFirmwareUpgrade.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHttpFirmwareUpgrade(Boolean value) {
        this.httpFirmwareUpgrade = value;
    }

    /**
     * Recupera il valore della proprietà httpSystemBackup.
     * This getter has been renamed from isHttpSystemBackup() to getHttpSystemBackup() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHttpSystemBackup() {
        return httpSystemBackup;
    }

    /**
     * Imposta il valore della proprietà httpSystemBackup.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHttpSystemBackup(Boolean value) {
        this.httpSystemBackup = value;
    }

    /**
     * Recupera il valore della proprietà httpSystemLogging.
     * This getter has been renamed from isHttpSystemLogging() to getHttpSystemLogging() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHttpSystemLogging() {
        return httpSystemLogging;
    }

    /**
     * Imposta il valore della proprietà httpSystemLogging.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHttpSystemLogging(Boolean value) {
        this.httpSystemLogging = value;
    }

    /**
     * Recupera il valore della proprietà httpSupportInformation.
     * This getter has been renamed from isHttpSupportInformation() to getHttpSupportInformation() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHttpSupportInformation() {
        return httpSupportInformation;
    }

    /**
     * Imposta il valore della proprietà httpSupportInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHttpSupportInformation(Boolean value) {
        this.httpSupportInformation = value;
    }

    /**
     * Recupera il valore della proprietà storageConfiguration.
     * This getter has been renamed from isStorageConfiguration() to getStorageConfiguration() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getStorageConfiguration() {
        return storageConfiguration;
    }

    /**
     * Imposta il valore della proprietà storageConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStorageConfiguration(Boolean value) {
        this.storageConfiguration = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
