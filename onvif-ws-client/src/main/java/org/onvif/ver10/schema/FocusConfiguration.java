
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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Classe Java per FocusConfiguration complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FocusConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoFocusMode" type="{http://www.onvif.org/ver10/schema}AutoFocusMode"/&gt;
 *         &lt;element name="DefaultSpeed" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="NearLimit" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="FarLimit" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
@XmlType(name = "FocusConfiguration", propOrder = {
    "autoFocusMode",
    "defaultSpeed",
    "nearLimit",
    "farLimit",
    "any"
})
public class FocusConfiguration {

    @XmlElement(name = "AutoFocusMode", required = true)
    @XmlSchemaType(name = "string")
    protected AutoFocusMode autoFocusMode;
    @XmlElement(name = "DefaultSpeed")
    protected float defaultSpeed;
    @XmlElement(name = "NearLimit")
    protected float nearLimit;
    @XmlElement(name = "FarLimit")
    protected float farLimit;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà autoFocusMode.
     * 
     * @return
     *     possible object is
     *     {@link AutoFocusMode }
     *     
     */
    public AutoFocusMode getAutoFocusMode() {
        return autoFocusMode;
    }

    /**
     * Imposta il valore della proprietà autoFocusMode.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoFocusMode }
     *     
     */
    public void setAutoFocusMode(AutoFocusMode value) {
        this.autoFocusMode = value;
    }

    /**
     * Recupera il valore della proprietà defaultSpeed.
     * 
     */
    public float getDefaultSpeed() {
        return defaultSpeed;
    }

    /**
     * Imposta il valore della proprietà defaultSpeed.
     * 
     */
    public void setDefaultSpeed(float value) {
        this.defaultSpeed = value;
    }

    /**
     * Recupera il valore della proprietà nearLimit.
     * 
     */
    public float getNearLimit() {
        return nearLimit;
    }

    /**
     * Imposta il valore della proprietà nearLimit.
     * 
     */
    public void setNearLimit(float value) {
        this.nearLimit = value;
    }

    /**
     * Recupera il valore della proprietà farLimit.
     * 
     */
    public float getFarLimit() {
        return farLimit;
    }

    /**
     * Imposta il valore della proprietà farLimit.
     * 
     */
    public void setFarLimit(float value) {
        this.farLimit = value;
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
