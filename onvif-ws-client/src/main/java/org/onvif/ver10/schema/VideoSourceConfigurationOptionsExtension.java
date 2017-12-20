
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Classe Java per VideoSourceConfigurationOptionsExtension complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VideoSourceConfigurationOptionsExtension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Rotate" type="{http://www.onvif.org/ver10/schema}RotateOptions" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoSourceConfigurationOptionsExtension2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSourceConfigurationOptionsExtension", propOrder = {
    "any",
    "rotate",
    "extension"
})
public class VideoSourceConfigurationOptionsExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "Rotate")
    protected RotateOptions rotate;
    @XmlElement(name = "Extension")
    protected VideoSourceConfigurationOptionsExtension2 extension;

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
     * {@link java.lang.Object }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
    }

    /**
     * Recupera il valore della proprietà rotate.
     * 
     * @return
     *     possible object is
     *     {@link RotateOptions }
     *     
     */
    public RotateOptions getRotate() {
        return rotate;
    }

    /**
     * Imposta il valore della proprietà rotate.
     * 
     * @param value
     *     allowed object is
     *     {@link RotateOptions }
     *     
     */
    public void setRotate(RotateOptions value) {
        this.rotate = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link VideoSourceConfigurationOptionsExtension2 }
     *     
     */
    public VideoSourceConfigurationOptionsExtension2 getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSourceConfigurationOptionsExtension2 }
     *     
     */
    public void setExtension(VideoSourceConfigurationOptionsExtension2 value) {
        this.extension = value;
    }

}
