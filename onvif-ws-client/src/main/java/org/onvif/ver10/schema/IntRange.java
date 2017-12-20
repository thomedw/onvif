
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Range of values greater equal Min value and less equal Max value.
 * 
 * <p>Classe Java per IntRange complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IntRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Min" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntRange", propOrder = {
    "min",
    "max"
})
public class IntRange {

    @XmlElement(name = "Min")
    protected int min;
    @XmlElement(name = "Max")
    protected int max;

    /**
     * Recupera il valore della proprietà min.
     * 
     */
    public int getMin() {
        return min;
    }

    /**
     * Imposta il valore della proprietà min.
     * 
     */
    public void setMin(int value) {
        this.min = value;
    }

    /**
     * Recupera il valore della proprietà max.
     * 
     */
    public int getMax() {
        return max;
    }

    /**
     * Imposta il valore della proprietà max.
     * 
     */
    public void setMax(int value) {
        this.max = value;
    }

}
