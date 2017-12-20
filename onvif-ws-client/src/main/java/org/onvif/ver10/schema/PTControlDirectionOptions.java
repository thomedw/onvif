
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per PTControlDirectionOptions complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PTControlDirectionOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFlip" type="{http://www.onvif.org/ver10/schema}EFlipOptions" minOccurs="0"/&gt;
 *         &lt;element name="Reverse" type="{http://www.onvif.org/ver10/schema}ReverseOptions" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTControlDirectionOptionsExtension" minOccurs="0"/&gt;
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
@XmlType(name = "PTControlDirectionOptions", propOrder = {
    "eFlip",
    "reverse",
    "extension"
})
public class PTControlDirectionOptions {

    @XmlElement(name = "EFlip")
    protected EFlipOptions eFlip;
    @XmlElement(name = "Reverse")
    protected ReverseOptions reverse;
    @XmlElement(name = "Extension")
    protected PTControlDirectionOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà eFlip.
     * 
     * @return
     *     possible object is
     *     {@link EFlipOptions }
     *     
     */
    public EFlipOptions getEFlip() {
        return eFlip;
    }

    /**
     * Imposta il valore della proprietà eFlip.
     * 
     * @param value
     *     allowed object is
     *     {@link EFlipOptions }
     *     
     */
    public void setEFlip(EFlipOptions value) {
        this.eFlip = value;
    }

    /**
     * Recupera il valore della proprietà reverse.
     * 
     * @return
     *     possible object is
     *     {@link ReverseOptions }
     *     
     */
    public ReverseOptions getReverse() {
        return reverse;
    }

    /**
     * Imposta il valore della proprietà reverse.
     * 
     * @param value
     *     allowed object is
     *     {@link ReverseOptions }
     *     
     */
    public void setReverse(ReverseOptions value) {
        this.reverse = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link PTControlDirectionOptionsExtension }
     *     
     */
    public PTControlDirectionOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link PTControlDirectionOptionsExtension }
     *     
     */
    public void setExtension(PTControlDirectionOptionsExtension value) {
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
