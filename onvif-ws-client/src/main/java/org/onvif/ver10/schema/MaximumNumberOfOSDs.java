
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per MaximumNumberOfOSDs complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MaximumNumberOfOSDs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Image" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="PlainText" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="DateAndTime" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaximumNumberOfOSDs")
public class MaximumNumberOfOSDs {

    @XmlAttribute(name = "Total", required = true)
    protected int total;
    @XmlAttribute(name = "Image")
    protected Integer image;
    @XmlAttribute(name = "PlainText")
    protected Integer plainText;
    @XmlAttribute(name = "Date")
    protected Integer date;
    @XmlAttribute(name = "Time")
    protected Integer time;
    @XmlAttribute(name = "DateAndTime")
    protected Integer dateAndTime;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà total.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Imposta il valore della proprietà total.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Recupera il valore della proprietà image.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImage() {
        return image;
    }

    /**
     * Imposta il valore della proprietà image.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImage(Integer value) {
        this.image = value;
    }

    /**
     * Recupera il valore della proprietà plainText.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlainText() {
        return plainText;
    }

    /**
     * Imposta il valore della proprietà plainText.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlainText(Integer value) {
        this.plainText = value;
    }

    /**
     * Recupera il valore della proprietà date.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDate() {
        return date;
    }

    /**
     * Imposta il valore della proprietà date.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDate(Integer value) {
        this.date = value;
    }

    /**
     * Recupera il valore della proprietà time.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTime() {
        return time;
    }

    /**
     * Imposta il valore della proprietà time.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTime(Integer value) {
        this.time = value;
    }

    /**
     * Recupera il valore della proprietà dateAndTime.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDateAndTime() {
        return dateAndTime;
    }

    /**
     * Imposta il valore della proprietà dateAndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDateAndTime(Integer value) {
        this.dateAndTime = value;
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
