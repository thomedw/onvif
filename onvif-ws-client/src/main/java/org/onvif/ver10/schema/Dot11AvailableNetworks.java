
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per Dot11AvailableNetworks complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Dot11AvailableNetworks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SSID" type="{http://www.onvif.org/ver10/schema}Dot11SSIDType"/&gt;
 *         &lt;element name="BSSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthAndMangementSuite" type="{http://www.onvif.org/ver10/schema}Dot11AuthAndMangementSuite" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PairCipher" type="{http://www.onvif.org/ver10/schema}Dot11Cipher" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GroupCipher" type="{http://www.onvif.org/ver10/schema}Dot11Cipher" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SignalStrength" type="{http://www.onvif.org/ver10/schema}Dot11SignalStrength" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}Dot11AvailableNetworksExtension" minOccurs="0"/&gt;
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
@XmlType(name = "Dot11AvailableNetworks", propOrder = {
    "ssid",
    "bssid",
    "authAndMangementSuite",
    "pairCipher",
    "groupCipher",
    "signalStrength",
    "extension"
})
public class Dot11AvailableNetworks {

    @XmlElement(name = "SSID", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] ssid;
    @XmlElement(name = "BSSID")
    protected String bssid;
    @XmlElement(name = "AuthAndMangementSuite")
    @XmlSchemaType(name = "string")
    protected List<Dot11AuthAndMangementSuite> authAndMangementSuite;
    @XmlElement(name = "PairCipher")
    @XmlSchemaType(name = "string")
    protected List<Dot11Cipher> pairCipher;
    @XmlElement(name = "GroupCipher")
    @XmlSchemaType(name = "string")
    protected List<Dot11Cipher> groupCipher;
    @XmlElement(name = "SignalStrength")
    @XmlSchemaType(name = "string")
    protected Dot11SignalStrength signalStrength;
    @XmlElement(name = "Extension")
    protected Dot11AvailableNetworksExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà ssid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSSID() {
        return ssid;
    }

    /**
     * Imposta il valore della proprietà ssid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSID(byte[] value) {
        this.ssid = value;
    }

    /**
     * Recupera il valore della proprietà bssid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSSID() {
        return bssid;
    }

    /**
     * Imposta il valore della proprietà bssid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSSID(String value) {
        this.bssid = value;
    }

    /**
     * Gets the value of the authAndMangementSuite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authAndMangementSuite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthAndMangementSuite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dot11AuthAndMangementSuite }
     * 
     * 
     */
    public List<Dot11AuthAndMangementSuite> getAuthAndMangementSuite() {
        if (authAndMangementSuite == null) {
            authAndMangementSuite = new ArrayList<Dot11AuthAndMangementSuite>();
        }
        return this.authAndMangementSuite;
    }

    /**
     * Gets the value of the pairCipher property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pairCipher property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPairCipher().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dot11Cipher }
     * 
     * 
     */
    public List<Dot11Cipher> getPairCipher() {
        if (pairCipher == null) {
            pairCipher = new ArrayList<Dot11Cipher>();
        }
        return this.pairCipher;
    }

    /**
     * Gets the value of the groupCipher property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupCipher property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupCipher().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dot11Cipher }
     * 
     * 
     */
    public List<Dot11Cipher> getGroupCipher() {
        if (groupCipher == null) {
            groupCipher = new ArrayList<Dot11Cipher>();
        }
        return this.groupCipher;
    }

    /**
     * Recupera il valore della proprietà signalStrength.
     * 
     * @return
     *     possible object is
     *     {@link Dot11SignalStrength }
     *     
     */
    public Dot11SignalStrength getSignalStrength() {
        return signalStrength;
    }

    /**
     * Imposta il valore della proprietà signalStrength.
     * 
     * @param value
     *     allowed object is
     *     {@link Dot11SignalStrength }
     *     
     */
    public void setSignalStrength(Dot11SignalStrength value) {
        this.signalStrength = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link Dot11AvailableNetworksExtension }
     *     
     */
    public Dot11AvailableNetworksExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link Dot11AvailableNetworksExtension }
     *     
     */
    public void setExtension(Dot11AvailableNetworksExtension value) {
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
