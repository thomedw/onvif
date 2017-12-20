
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RelativeFocus complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RelativeFocus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeFocus", propOrder = {
    "distance",
    "speed"
})
public class RelativeFocus {

    @XmlElement(name = "Distance")
    protected float distance;
    @XmlElement(name = "Speed")
    protected Float speed;

    /**
     * Recupera il valore della proprietà distance.
     * 
     */
    public float getDistance() {
        return distance;
    }

    /**
     * Imposta il valore della proprietà distance.
     * 
     */
    public void setDistance(float value) {
        this.distance = value;
    }

    /**
     * Recupera il valore della proprietà speed.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpeed() {
        return speed;
    }

    /**
     * Imposta il valore della proprietà speed.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpeed(Float value) {
        this.speed = value;
    }

}
