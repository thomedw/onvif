
package org.onvif.ver10.deviceio.wsdl;

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
import org.onvif.ver10.schema.FloatList;
import org.onvif.ver10.schema.IntList;
import org.w3c.dom.Element;


/**
 * The configuration options that relates to serial port.
 * 
 * <p>Classe Java per SerialPortConfigurationOptions complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SerialPortConfigurationOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaudRateList" type="{http://www.onvif.org/ver10/schema}IntList"/&gt;
 *         &lt;element name="ParityBitList" type="{http://www.onvif.org/ver10/deviceIO/wsdl}ParityBitList"/&gt;
 *         &lt;element name="CharacterLengthList" type="{http://www.onvif.org/ver10/schema}IntList"/&gt;
 *         &lt;element name="StopBitList" type="{http://www.onvif.org/ver10/schema}FloatList"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerialPortConfigurationOptions", propOrder = {
    "baudRateList",
    "parityBitList",
    "characterLengthList",
    "stopBitList",
    "any"
})
public class SerialPortConfigurationOptions {

    @XmlElement(name = "BaudRateList", required = true)
    protected IntList baudRateList;
    @XmlElement(name = "ParityBitList", required = true)
    protected ParityBitList parityBitList;
    @XmlElement(name = "CharacterLengthList", required = true)
    protected IntList characterLengthList;
    @XmlElement(name = "StopBitList", required = true)
    protected FloatList stopBitList;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "token", required = true)
    protected String token;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà baudRateList.
     * 
     * @return
     *     possible object is
     *     {@link IntList }
     *     
     */
    public IntList getBaudRateList() {
        return baudRateList;
    }

    /**
     * Imposta il valore della proprietà baudRateList.
     * 
     * @param value
     *     allowed object is
     *     {@link IntList }
     *     
     */
    public void setBaudRateList(IntList value) {
        this.baudRateList = value;
    }

    /**
     * Recupera il valore della proprietà parityBitList.
     * 
     * @return
     *     possible object is
     *     {@link ParityBitList }
     *     
     */
    public ParityBitList getParityBitList() {
        return parityBitList;
    }

    /**
     * Imposta il valore della proprietà parityBitList.
     * 
     * @param value
     *     allowed object is
     *     {@link ParityBitList }
     *     
     */
    public void setParityBitList(ParityBitList value) {
        this.parityBitList = value;
    }

    /**
     * Recupera il valore della proprietà characterLengthList.
     * 
     * @return
     *     possible object is
     *     {@link IntList }
     *     
     */
    public IntList getCharacterLengthList() {
        return characterLengthList;
    }

    /**
     * Imposta il valore della proprietà characterLengthList.
     * 
     * @param value
     *     allowed object is
     *     {@link IntList }
     *     
     */
    public void setCharacterLengthList(IntList value) {
        this.characterLengthList = value;
    }

    /**
     * Recupera il valore della proprietà stopBitList.
     * 
     * @return
     *     possible object is
     *     {@link FloatList }
     *     
     */
    public FloatList getStopBitList() {
        return stopBitList;
    }

    /**
     * Imposta il valore della proprietà stopBitList.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatList }
     *     
     */
    public void setStopBitList(FloatList value) {
        this.stopBitList = value;
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
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Recupera il valore della proprietà token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Imposta il valore della proprietà token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
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
