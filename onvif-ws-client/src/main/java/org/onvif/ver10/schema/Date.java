
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Date complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Date"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Date", propOrder = {
    "year",
    "month",
    "day"
})
public class Date {

    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "Month")
    protected int month;
    @XmlElement(name = "Day")
    protected int day;

    /**
     * Recupera il valore della proprietà year.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Imposta il valore della proprietà year.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Recupera il valore della proprietà month.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Imposta il valore della proprietà month.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Recupera il valore della proprietà day.
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * Imposta il valore della proprietà day.
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

}
