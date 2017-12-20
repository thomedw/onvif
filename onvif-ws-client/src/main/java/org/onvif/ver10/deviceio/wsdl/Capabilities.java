
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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Classe Java per Capabilities complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Capabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="VideoSources" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="VideoOutputs" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="AudioSources" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="AudioOutputs" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="RelayOutputs" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="SerialPorts" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="DigitalInputs" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="DigitalInputOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities", propOrder = {
    "any"
})
public class Capabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "VideoSources")
    protected Integer videoSources;
    @XmlAttribute(name = "VideoOutputs")
    protected Integer videoOutputs;
    @XmlAttribute(name = "AudioSources")
    protected Integer audioSources;
    @XmlAttribute(name = "AudioOutputs")
    protected Integer audioOutputs;
    @XmlAttribute(name = "RelayOutputs")
    protected Integer relayOutputs;
    @XmlAttribute(name = "SerialPorts")
    protected Integer serialPorts;
    @XmlAttribute(name = "DigitalInputs")
    protected Integer digitalInputs;
    @XmlAttribute(name = "DigitalInputOptions")
    protected Boolean digitalInputOptions;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Recupera il valore della proprietà videoSources.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getVideoSources() {
        if (videoSources == null) {
            return  0;
        } else {
            return videoSources;
        }
    }

    /**
     * Imposta il valore della proprietà videoSources.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVideoSources(Integer value) {
        this.videoSources = value;
    }

    /**
     * Recupera il valore della proprietà videoOutputs.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getVideoOutputs() {
        if (videoOutputs == null) {
            return  0;
        } else {
            return videoOutputs;
        }
    }

    /**
     * Imposta il valore della proprietà videoOutputs.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVideoOutputs(Integer value) {
        this.videoOutputs = value;
    }

    /**
     * Recupera il valore della proprietà audioSources.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getAudioSources() {
        if (audioSources == null) {
            return  0;
        } else {
            return audioSources;
        }
    }

    /**
     * Imposta il valore della proprietà audioSources.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAudioSources(Integer value) {
        this.audioSources = value;
    }

    /**
     * Recupera il valore della proprietà audioOutputs.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getAudioOutputs() {
        if (audioOutputs == null) {
            return  0;
        } else {
            return audioOutputs;
        }
    }

    /**
     * Imposta il valore della proprietà audioOutputs.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAudioOutputs(Integer value) {
        this.audioOutputs = value;
    }

    /**
     * Recupera il valore della proprietà relayOutputs.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRelayOutputs() {
        if (relayOutputs == null) {
            return  0;
        } else {
            return relayOutputs;
        }
    }

    /**
     * Imposta il valore della proprietà relayOutputs.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelayOutputs(Integer value) {
        this.relayOutputs = value;
    }

    /**
     * Recupera il valore della proprietà serialPorts.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSerialPorts() {
        if (serialPorts == null) {
            return  0;
        } else {
            return serialPorts;
        }
    }

    /**
     * Imposta il valore della proprietà serialPorts.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSerialPorts(Integer value) {
        this.serialPorts = value;
    }

    /**
     * Recupera il valore della proprietà digitalInputs.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDigitalInputs() {
        if (digitalInputs == null) {
            return  0;
        } else {
            return digitalInputs;
        }
    }

    /**
     * Imposta il valore della proprietà digitalInputs.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDigitalInputs(Integer value) {
        this.digitalInputs = value;
    }

    /**
     * Recupera il valore della proprietà digitalInputOptions.
     * This getter has been renamed from isDigitalInputOptions() to getDigitalInputOptions() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getDigitalInputOptions() {
        if (digitalInputOptions == null) {
            return false;
        } else {
            return digitalInputOptions;
        }
    }

    /**
     * Imposta il valore della proprietà digitalInputOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDigitalInputOptions(Boolean value) {
        this.digitalInputOptions = value;
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
