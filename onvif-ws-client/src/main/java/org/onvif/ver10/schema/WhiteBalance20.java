
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per WhiteBalance20 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WhiteBalance20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}WhiteBalanceMode"/&gt;
 *         &lt;element name="CrGain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="CbGain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}WhiteBalance20Extension" minOccurs="0"/&gt;
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
@XmlType(name = "WhiteBalance20", propOrder = {
    "mode",
    "crGain",
    "cbGain",
    "extension"
})
public class WhiteBalance20 {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected WhiteBalanceMode mode;
    @XmlElement(name = "CrGain")
    protected Float crGain;
    @XmlElement(name = "CbGain")
    protected Float cbGain;
    @XmlElement(name = "Extension")
    protected WhiteBalance20Extension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà mode.
     * 
     * @return
     *     possible object is
     *     {@link WhiteBalanceMode }
     *     
     */
    public WhiteBalanceMode getMode() {
        return mode;
    }

    /**
     * Imposta il valore della proprietà mode.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteBalanceMode }
     *     
     */
    public void setMode(WhiteBalanceMode value) {
        this.mode = value;
    }

    /**
     * Recupera il valore della proprietà crGain.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCrGain() {
        return crGain;
    }

    /**
     * Imposta il valore della proprietà crGain.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCrGain(Float value) {
        this.crGain = value;
    }

    /**
     * Recupera il valore della proprietà cbGain.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCbGain() {
        return cbGain;
    }

    /**
     * Imposta il valore della proprietà cbGain.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCbGain(Float value) {
        this.cbGain = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link WhiteBalance20Extension }
     *     
     */
    public WhiteBalance20Extension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteBalance20Extension }
     *     
     */
    public void setExtension(WhiteBalance20Extension value) {
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
