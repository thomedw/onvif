
package org.onvif.ver10.search.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.RecordingInformation;


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
 *         &lt;element name="RecordingInformation" type="{http://www.onvif.org/ver10/schema}RecordingInformation"/&gt;
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
    "recordingInformation"
})
@XmlRootElement(name = "GetRecordingInformationResponse")
public class GetRecordingInformationResponse {

    @XmlElement(name = "RecordingInformation", required = true)
    protected RecordingInformation recordingInformation;

    /**
     * Recupera il valore della proprietà recordingInformation.
     * 
     * @return
     *     possible object is
     *     {@link RecordingInformation }
     *     
     */
    public RecordingInformation getRecordingInformation() {
        return recordingInformation;
    }

    /**
     * Imposta il valore della proprietà recordingInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingInformation }
     *     
     */
    public void setRecordingInformation(RecordingInformation value) {
        this.recordingInformation = value;
    }

}
