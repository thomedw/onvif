
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
 * <p>Classe Java per PTZPresetTourOptions complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PTZPresetTourOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoStart" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StartingCondition" type="{http://www.onvif.org/ver10/schema}PTZPresetTourStartingConditionOptions"/&gt;
 *         &lt;element name="TourSpot" type="{http://www.onvif.org/ver10/schema}PTZPresetTourSpotOptions"/&gt;
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
@XmlType(name = "PTZPresetTourOptions", propOrder = {
    "autoStart",
    "startingCondition",
    "tourSpot",
    "any"
})
public class PTZPresetTourOptions {

    @XmlElement(name = "AutoStart")
    protected boolean autoStart;
    @XmlElement(name = "StartingCondition", required = true)
    protected PTZPresetTourStartingConditionOptions startingCondition;
    @XmlElement(name = "TourSpot", required = true)
    protected PTZPresetTourSpotOptions tourSpot;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     *     {@link PTZPresetTourStartingConditionOptions }
     *     
     */
    public PTZPresetTourStartingConditionOptions getStartingCondition() {
        return startingCondition;
    }

    /**
     * Imposta il valore della proprietà startingCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourStartingConditionOptions }
     *     
     */
    public void setStartingCondition(PTZPresetTourStartingConditionOptions value) {
        this.startingCondition = value;
    }

    /**
     * Recupera il valore della proprietà tourSpot.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourSpotOptions }
     *     
     */
    public PTZPresetTourSpotOptions getTourSpot() {
        return tourSpot;
    }

    /**
     * Imposta il valore della proprietà tourSpot.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourSpotOptions }
     *     
     */
    public void setTourSpot(PTZPresetTourSpotOptions value) {
        this.tourSpot = value;
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
