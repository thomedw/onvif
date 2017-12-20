
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
 * <p>Classe Java per IrCutFilterAutoAdjustmentOptions complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IrCutFilterAutoAdjustmentOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BoundaryType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="BoundaryOffset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResponseTimeRange" type="{http://www.onvif.org/ver10/schema}DurationRange" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}IrCutFilterAutoAdjustmentOptionsExtension" minOccurs="0"/&gt;
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
@XmlType(name = "IrCutFilterAutoAdjustmentOptions", propOrder = {
    "boundaryType",
    "boundaryOffset",
    "responseTimeRange",
    "extension"
})
public class IrCutFilterAutoAdjustmentOptions {

    @XmlElement(name = "BoundaryType", required = true)
    protected List<String> boundaryType;
    @XmlElement(name = "BoundaryOffset")
    protected Boolean boundaryOffset;
    @XmlElement(name = "ResponseTimeRange")
    protected DurationRange responseTimeRange;
    @XmlElement(name = "Extension")
    protected IrCutFilterAutoAdjustmentOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the boundaryType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundaryType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundaryType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBoundaryType() {
        if (boundaryType == null) {
            boundaryType = new ArrayList<String>();
        }
        return this.boundaryType;
    }

    /**
     * Recupera il valore della proprietà boundaryOffset.
     * This getter has been renamed from isBoundaryOffset() to getBoundaryOffset() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBoundaryOffset() {
        return boundaryOffset;
    }

    /**
     * Imposta il valore della proprietà boundaryOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoundaryOffset(Boolean value) {
        this.boundaryOffset = value;
    }

    /**
     * Recupera il valore della proprietà responseTimeRange.
     * 
     * @return
     *     possible object is
     *     {@link DurationRange }
     *     
     */
    public DurationRange getResponseTimeRange() {
        return responseTimeRange;
    }

    /**
     * Imposta il valore della proprietà responseTimeRange.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationRange }
     *     
     */
    public void setResponseTimeRange(DurationRange value) {
        this.responseTimeRange = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link IrCutFilterAutoAdjustmentOptionsExtension }
     *     
     */
    public IrCutFilterAutoAdjustmentOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link IrCutFilterAutoAdjustmentOptionsExtension }
     *     
     */
    public void setExtension(IrCutFilterAutoAdjustmentOptionsExtension value) {
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
