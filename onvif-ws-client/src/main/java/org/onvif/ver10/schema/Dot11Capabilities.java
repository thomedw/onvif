
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Classe Java per Dot11Capabilities complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Dot11Capabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TKIP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ScanAvailableNetworks" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MultipleConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AdHocStationMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WEP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "Dot11Capabilities", propOrder = {
    "tkip",
    "scanAvailableNetworks",
    "multipleConfiguration",
    "adHocStationMode",
    "wep",
    "any"
})
public class Dot11Capabilities {

    @XmlElement(name = "TKIP")
    protected boolean tkip;
    @XmlElement(name = "ScanAvailableNetworks")
    protected boolean scanAvailableNetworks;
    @XmlElement(name = "MultipleConfiguration")
    protected boolean multipleConfiguration;
    @XmlElement(name = "AdHocStationMode")
    protected boolean adHocStationMode;
    @XmlElement(name = "WEP")
    protected boolean wep;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà tkip.
     * This getter has been renamed from isTKIP() to getTKIP() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getTKIP() {
        return tkip;
    }

    /**
     * Imposta il valore della proprietà tkip.
     * 
     */
    public void setTKIP(boolean value) {
        this.tkip = value;
    }

    /**
     * Recupera il valore della proprietà scanAvailableNetworks.
     * This getter has been renamed from isScanAvailableNetworks() to getScanAvailableNetworks() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getScanAvailableNetworks() {
        return scanAvailableNetworks;
    }

    /**
     * Imposta il valore della proprietà scanAvailableNetworks.
     * 
     */
    public void setScanAvailableNetworks(boolean value) {
        this.scanAvailableNetworks = value;
    }

    /**
     * Recupera il valore della proprietà multipleConfiguration.
     * This getter has been renamed from isMultipleConfiguration() to getMultipleConfiguration() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getMultipleConfiguration() {
        return multipleConfiguration;
    }

    /**
     * Imposta il valore della proprietà multipleConfiguration.
     * 
     */
    public void setMultipleConfiguration(boolean value) {
        this.multipleConfiguration = value;
    }

    /**
     * Recupera il valore della proprietà adHocStationMode.
     * This getter has been renamed from isAdHocStationMode() to getAdHocStationMode() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getAdHocStationMode() {
        return adHocStationMode;
    }

    /**
     * Imposta il valore della proprietà adHocStationMode.
     * 
     */
    public void setAdHocStationMode(boolean value) {
        this.adHocStationMode = value;
    }

    /**
     * Recupera il valore della proprietà wep.
     * This getter has been renamed from isWEP() to getWEP() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getWEP() {
        return wep;
    }

    /**
     * Imposta il valore della proprietà wep.
     * 
     */
    public void setWEP(boolean value) {
        this.wep = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link java.lang.Object }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
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
