
package org.onvif.ver20.imaging.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.ImagingOptions20;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImagingOptions" type="{http://www.onvif.org/ver10/schema}ImagingOptions20"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "imagingOptions"
})
@XmlRootElement(name = "GetOptionsResponse")
public class GetOptionsResponse {

    @XmlElement(name = "ImagingOptions", required = true)
    protected ImagingOptions20 imagingOptions;

    /**
     * Recupera il valore della proprietà imagingOptions.
     * 
     * @return
     *     possible object is
     *     {@link ImagingOptions20 }
     *     
     */
    public ImagingOptions20 getImagingOptions() {
        return imagingOptions;
    }

    /**
     * Imposta il valore della proprietà imagingOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingOptions20 }
     *     
     */
    public void setImagingOptions(ImagingOptions20 value) {
        this.imagingOptions = value;
    }

}
