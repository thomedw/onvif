
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element name="DiscoveryResolve" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DiscoveryBye" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RemoteDiscovery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SystemBackup" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SystemLogging" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FirmwareUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SupportedVersions" type="{http://www.onvif.org/ver10/schema}OnvifVersion" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}SystemCapabilitiesExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemCapabilities", propOrder = {
    "discoveryResolve",
    "discoveryBye",
    "remoteDiscovery",
    "systemBackup",
    "systemLogging",
    "firmwareUpgrade",
    "supportedVersions",
    "extension"
})
public class SystemCapabilities {

    @XmlElement(name = "DiscoveryResolve")
    protected boolean discoveryResolve;
    @XmlElement(name = "DiscoveryBye")
    protected boolean discoveryBye;
    @XmlElement(name = "RemoteDiscovery")
    protected boolean remoteDiscovery;
    @XmlElement(name = "SystemBackup")
    protected boolean systemBackup;
    @XmlElement(name = "SystemLogging")
    protected boolean systemLogging;
    @XmlElement(name = "FirmwareUpgrade")
    protected boolean firmwareUpgrade;
    @XmlElement(name = "SupportedVersions", required = true)
    protected List<OnvifVersion> supportedVersions;
    @XmlElement(name = "Extension")
    protected SystemCapabilitiesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà discoveryResolve.
     * This getter has been renamed from isDiscoveryResolve() to getDiscoveryResolve() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getDiscoveryResolve() {
        return discoveryResolve;
    }

    /**
     * Imposta il valore della proprietà discoveryResolve.
     * 
     */
    public void setDiscoveryResolve(boolean value) {
        this.discoveryResolve = value;
    }

    /**
     * Recupera il valore della proprietà discoveryBye.
     * This getter has been renamed from isDiscoveryBye() to getDiscoveryBye() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getDiscoveryBye() {
        return discoveryBye;
    }

    /**
     * Imposta il valore della proprietà discoveryBye.
     * 
     */
    public void setDiscoveryBye(boolean value) {
        this.discoveryBye = value;
    }

    /**
     * Recupera il valore della proprietà remoteDiscovery.
     * This getter has been renamed from isRemoteDiscovery() to getRemoteDiscovery() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getRemoteDiscovery() {
        return remoteDiscovery;
    }

    /**
     * Imposta il valore della proprietà remoteDiscovery.
     * 
     */
    public void setRemoteDiscovery(boolean value) {
        this.remoteDiscovery = value;
    }

    /**
     * Recupera il valore della proprietà systemBackup.
     * This getter has been renamed from isSystemBackup() to getSystemBackup() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getSystemBackup() {
        return systemBackup;
    }

    /**
     * Imposta il valore della proprietà systemBackup.
     * 
     */
    public void setSystemBackup(boolean value) {
        this.systemBackup = value;
    }

    /**
     * Recupera il valore della proprietà systemLogging.
     * This getter has been renamed from isSystemLogging() to getSystemLogging() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getSystemLogging() {
        return systemLogging;
    }

    /**
     * Imposta il valore della proprietà systemLogging.
     * 
     */
    public void setSystemLogging(boolean value) {
        this.systemLogging = value;
    }

    /**
     * Recupera il valore della proprietà firmwareUpgrade.
     * This getter has been renamed from isFirmwareUpgrade() to getFirmwareUpgrade() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getFirmwareUpgrade() {
        return firmwareUpgrade;
    }

    /**
     * Imposta il valore della proprietà firmwareUpgrade.
     * 
     */
    public void setFirmwareUpgrade(boolean value) {
        this.firmwareUpgrade = value;
    }

    /**
     * Gets the value of the supportedVersions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedVersions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnvifVersion }
     * 
     * 
     */
    public List<OnvifVersion> getSupportedVersions() {
        if (supportedVersions == null) {
            supportedVersions = new ArrayList<OnvifVersion>();
        }
        return this.supportedVersions;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link SystemCapabilitiesExtension }
     *     
     */
    public SystemCapabilitiesExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemCapabilitiesExtension }
     *     
     */
    public void setExtension(SystemCapabilitiesExtension value) {
        this.extension = value;
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
