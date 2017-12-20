
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ZoomLimits complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ZoomLimits"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Range" type="{http://www.onvif.org/ver10/schema}Space1DDescription"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoomLimits", propOrder = {
    "range"
})
public class ZoomLimits {

    @XmlElement(name = "Range", required = true)
    protected Space1DDescription range;

    /**
     * Recupera il valore della proprietà range.
     * 
     * @return
     *     possible object is
     *     {@link Space1DDescription }
     *     
     */
    public Space1DDescription getRange() {
        return range;
    }

    /**
     * Imposta il valore della proprietà range.
     * 
     * @param value
     *     allowed object is
     *     {@link Space1DDescription }
     *     
     */
    public void setRange(Space1DDescription value) {
        this.range = value;
    }

}
