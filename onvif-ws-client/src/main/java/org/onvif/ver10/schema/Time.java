
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Time complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Time"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hour" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Second" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Time", propOrder = {
    "hour",
    "minute",
    "second"
})
public class Time {

    @XmlElement(name = "Hour")
    protected int hour;
    @XmlElement(name = "Minute")
    protected int minute;
    @XmlElement(name = "Second")
    protected int second;

    /**
     * Recupera il valore della proprietà hour.
     * 
     */
    public int getHour() {
        return hour;
    }

    /**
     * Imposta il valore della proprietà hour.
     * 
     */
    public void setHour(int value) {
        this.hour = value;
    }

    /**
     * Recupera il valore della proprietà minute.
     * 
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Imposta il valore della proprietà minute.
     * 
     */
    public void setMinute(int value) {
        this.minute = value;
    }

    /**
     * Recupera il valore della proprietà second.
     * 
     */
    public int getSecond() {
        return second;
    }

    /**
     * Imposta il valore della proprietà second.
     * 
     */
    public void setSecond(int value) {
        this.second = value;
    }

}
