
package org.onvif.ver10.media.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.MediaUri;


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
 *         &lt;element name="MediaUri" type="{http://www.onvif.org/ver10/schema}MediaUri"/&gt;
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
    "mediaUri"
})
@XmlRootElement(name = "GetStreamUriResponse")
public class GetStreamUriResponse {

    @XmlElement(name = "MediaUri", required = true)
    protected MediaUri mediaUri;

    /**
     * Recupera il valore della proprietà mediaUri.
     * 
     * @return
     *     possible object is
     *     {@link MediaUri }
     *     
     */
    public MediaUri getMediaUri() {
        return mediaUri;
    }

    /**
     * Imposta il valore della proprietà mediaUri.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaUri }
     *     
     */
    public void setMediaUri(MediaUri value) {
        this.mediaUri = value;
    }

}
