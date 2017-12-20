
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Classe Java per LensDescription complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LensDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Offset" type="{http://www.onvif.org/ver10/schema}LensOffset"/&gt;
 *         &lt;element name="Projection" type="{http://www.onvif.org/ver10/schema}LensProjection" maxOccurs="unbounded"/&gt;
 *         &lt;element name="XFactor" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FocalLength" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LensDescription", propOrder = {
    "offset",
    "projection",
    "xFactor",
    "any"
})
public class LensDescription {

    @XmlElement(name = "Offset", required = true)
    protected LensOffset offset;
    @XmlElement(name = "Projection", required = true)
    protected List<LensProjection> projection;
    @XmlElement(name = "XFactor")
    protected float xFactor;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "FocalLength")
    protected Float focalLength;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà offset.
     * 
     * @return
     *     possible object is
     *     {@link LensOffset }
     *     
     */
    public LensOffset getOffset() {
        return offset;
    }

    /**
     * Imposta il valore della proprietà offset.
     * 
     * @param value
     *     allowed object is
     *     {@link LensOffset }
     *     
     */
    public void setOffset(LensOffset value) {
        this.offset = value;
    }

    /**
     * Gets the value of the projection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LensProjection }
     * 
     * 
     */
    public List<LensProjection> getProjection() {
        if (projection == null) {
            projection = new ArrayList<LensProjection>();
        }
        return this.projection;
    }

    /**
     * Recupera il valore della proprietà xFactor.
     * 
     */
    public float getXFactor() {
        return xFactor;
    }

    /**
     * Imposta il valore della proprietà xFactor.
     * 
     */
    public void setXFactor(float value) {
        this.xFactor = value;
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
     * Recupera il valore della proprietà focalLength.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFocalLength() {
        return focalLength;
    }

    /**
     * Imposta il valore della proprietà focalLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFocalLength(Float value) {
        this.focalLength = value;
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
