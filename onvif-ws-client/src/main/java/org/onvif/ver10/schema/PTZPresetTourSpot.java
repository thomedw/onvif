
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per PTZPresetTourSpot complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PTZPresetTourSpot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PresetDetail" type="{http://www.onvif.org/ver10/schema}PTZPresetTourPresetDetail"/&gt;
 *         &lt;element name="Speed" type="{http://www.onvif.org/ver10/schema}PTZSpeed" minOccurs="0"/&gt;
 *         &lt;element name="StayTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourSpotExtension" minOccurs="0"/&gt;
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
@XmlType(name = "PTZPresetTourSpot", propOrder = {
    "presetDetail",
    "speed",
    "stayTime",
    "extension"
})
public class PTZPresetTourSpot {

    @XmlElement(name = "PresetDetail", required = true)
    protected PTZPresetTourPresetDetail presetDetail;
    @XmlElement(name = "Speed")
    protected PTZSpeed speed;
    @XmlElement(name = "StayTime")
    protected Duration stayTime;
    @XmlElement(name = "Extension")
    protected PTZPresetTourSpotExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà presetDetail.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourPresetDetail }
     *     
     */
    public PTZPresetTourPresetDetail getPresetDetail() {
        return presetDetail;
    }

    /**
     * Imposta il valore della proprietà presetDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourPresetDetail }
     *     
     */
    public void setPresetDetail(PTZPresetTourPresetDetail value) {
        this.presetDetail = value;
    }

    /**
     * Recupera il valore della proprietà speed.
     * 
     * @return
     *     possible object is
     *     {@link PTZSpeed }
     *     
     */
    public PTZSpeed getSpeed() {
        return speed;
    }

    /**
     * Imposta il valore della proprietà speed.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpeed }
     *     
     */
    public void setSpeed(PTZSpeed value) {
        this.speed = value;
    }

    /**
     * Recupera il valore della proprietà stayTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStayTime() {
        return stayTime;
    }

    /**
     * Imposta il valore della proprietà stayTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStayTime(Duration value) {
        this.stayTime = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourSpotExtension }
     *     
     */
    public PTZPresetTourSpotExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourSpotExtension }
     *     
     */
    public void setExtension(PTZPresetTourSpotExtension value) {
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
