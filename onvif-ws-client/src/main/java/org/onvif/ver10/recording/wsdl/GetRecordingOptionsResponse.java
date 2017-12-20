
package org.onvif.ver10.recording.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Options" type="{http://www.onvif.org/ver10/recording/wsdl}RecordingOptions"/&gt;
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
    "options"
})
@XmlRootElement(name = "GetRecordingOptionsResponse")
public class GetRecordingOptionsResponse {

    @XmlElement(name = "Options", required = true)
    protected RecordingOptions options;

    /**
     * Recupera il valore della proprietà options.
     * 
     * @return
     *     possible object is
     *     {@link RecordingOptions }
     *     
     */
    public RecordingOptions getOptions() {
        return options;
    }

    /**
     * Imposta il valore della proprietà options.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingOptions }
     *     
     */
    public void setOptions(RecordingOptions value) {
        this.options = value;
    }

}
