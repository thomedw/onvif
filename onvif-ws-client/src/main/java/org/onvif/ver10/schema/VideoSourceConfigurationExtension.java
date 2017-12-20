
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per VideoSourceConfigurationExtension complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VideoSourceConfigurationExtension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rotate" type="{http://www.onvif.org/ver10/schema}Rotate" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoSourceConfigurationExtension2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSourceConfigurationExtension", propOrder = {
    "rotate",
    "extension"
})
public class VideoSourceConfigurationExtension {

    @XmlElement(name = "Rotate")
    protected Rotate rotate;
    @XmlElement(name = "Extension")
    protected VideoSourceConfigurationExtension2 extension;

    /**
     * Recupera il valore della proprietà rotate.
     * 
     * @return
     *     possible object is
     *     {@link Rotate }
     *     
     */
    public Rotate getRotate() {
        return rotate;
    }

    /**
     * Imposta il valore della proprietà rotate.
     * 
     * @param value
     *     allowed object is
     *     {@link Rotate }
     *     
     */
    public void setRotate(Rotate value) {
        this.rotate = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link VideoSourceConfigurationExtension2 }
     *     
     */
    public VideoSourceConfigurationExtension2 getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSourceConfigurationExtension2 }
     *     
     */
    public void setExtension(VideoSourceConfigurationExtension2 value) {
        this.extension = value;
    }

}
