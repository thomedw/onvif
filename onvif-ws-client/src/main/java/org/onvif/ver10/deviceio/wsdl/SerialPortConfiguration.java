
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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * The parameters for configuring the serial port.
 * 
 * <p>Classe Java per SerialPortConfiguration complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SerialPortConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaudRate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ParityBit" type="{http://www.onvif.org/ver10/deviceIO/wsdl}ParityBit"/&gt;
 *         &lt;element name="CharacterLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StopBit" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" /&gt;
 *       &lt;attribute name="type" use="required" type="{http://www.onvif.org/ver10/deviceIO/wsdl}SerialPortType" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerialPortConfiguration", propOrder = {
    "baudRate",
    "parityBit",
    "characterLength",
    "stopBit",
    "any"
})
public class SerialPortConfiguration {

    @XmlElement(name = "BaudRate")
    protected int baudRate;
    @XmlElement(name = "ParityBit", required = true)
    @XmlSchemaType(name = "string")
    protected ParityBit parityBit;
    @XmlElement(name = "CharacterLength")
    protected int characterLength;
    @XmlElement(name = "StopBit")
    protected float stopBit;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "token", required = true)
    protected String token;
    @XmlAttribute(name = "type", required = true)
    protected SerialPortType type;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà baudRate.
     * 
     */
    public int getBaudRate() {
        return baudRate;
    }

    /**
     * Imposta il valore della proprietà baudRate.
     * 
     */
    public void setBaudRate(int value) {
        this.baudRate = value;
    }

    /**
     * Recupera il valore della proprietà parityBit.
     * 
     * @return
     *     possible object is
     *     {@link ParityBit }
     *     
     */
    public ParityBit getParityBit() {
        return parityBit;
    }

    /**
     * Imposta il valore della proprietà parityBit.
     * 
     * @param value
     *     allowed object is
     *     {@link ParityBit }
     *     
     */
    public void setParityBit(ParityBit value) {
        this.parityBit = value;
    }

    /**
     * Recupera il valore della proprietà characterLength.
     * 
     */
    public int getCharacterLength() {
        return characterLength;
    }

    /**
     * Imposta il valore della proprietà characterLength.
     * 
     */
    public void setCharacterLength(int value) {
        this.characterLength = value;
    }

    /**
     * Recupera il valore della proprietà stopBit.
     * 
     */
    public float getStopBit() {
        return stopBit;
    }

    /**
     * Imposta il valore della proprietà stopBit.
     * 
     */
    public void setStopBit(float value) {
        this.stopBit = value;
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
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link SerialPortType }
     *     
     */
    public SerialPortType getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialPortType }
     *     
     */
    public void setType(SerialPortType value) {
        this.type = value;
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
