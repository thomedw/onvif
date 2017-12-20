
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per PresetTour complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PresetTour"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.onvif.org/ver10/schema}Name" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.onvif.org/ver10/schema}PTZPresetTourStatus"/&gt;
 *         &lt;element name="AutoStart" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StartingCondition" type="{http://www.onvif.org/ver10/schema}PTZPresetTourStartingCondition"/&gt;
 *         &lt;element name="TourSpot" type="{http://www.onvif.org/ver10/schema}PTZPresetTourSpot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="token" type="{http://www.onvif.org/ver10/schema}ReferenceToken" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresetTour", propOrder = {
    "name",
    "status",
    "autoStart",
    "startingCondition",
    "tourSpot",
    "extension"
})
public class PresetTour {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Status", required = true)
    protected PTZPresetTourStatus status;
    @XmlElement(name = "AutoStart")
    protected boolean autoStart;
    @XmlElement(name = "StartingCondition", required = true)
    protected PTZPresetTourStartingCondition startingCondition;
    @XmlElement(name = "TourSpot")
    protected List<PTZPresetTourSpot> tourSpot;
    @XmlElement(name = "Extension")
    protected PTZPresetTourExtension extension;
    @XmlAttribute(name = "token")
    protected String token;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourStatus }
     *     
     */
    public PTZPresetTourStatus getStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourStatus }
     *     
     */
    public void setStatus(PTZPresetTourStatus value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà autoStart.
     * This getter has been renamed from isAutoStart() to getAutoStart() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getAutoStart() {
        return autoStart;
    }

    /**
     * Imposta il valore della proprietà autoStart.
     * 
     */
    public void setAutoStart(boolean value) {
        this.autoStart = value;
    }

    /**
     * Recupera il valore della proprietà startingCondition.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourStartingCondition }
     *     
     */
    public PTZPresetTourStartingCondition getStartingCondition() {
        return startingCondition;
    }

    /**
     * Imposta il valore della proprietà startingCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourStartingCondition }
     *     
     */
    public void setStartingCondition(PTZPresetTourStartingCondition value) {
        this.startingCondition = value;
    }

    /**
     * Gets the value of the tourSpot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourSpot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourSpot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTZPresetTourSpot }
     * 
     * 
     */
    public List<PTZPresetTourSpot> getTourSpot() {
        if (tourSpot == null) {
            tourSpot = new ArrayList<PTZPresetTourSpot>();
        }
        return this.tourSpot;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourExtension }
     *     
     */
    public PTZPresetTourExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourExtension }
     *     
     */
    public void setExtension(PTZPresetTourExtension value) {
        this.extension = value;
    }

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
