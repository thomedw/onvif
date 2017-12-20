
package org.onvif.ver10.recording.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.RecordingConfiguration;


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
 *         &lt;element name="RecordingToken" type="{http://www.onvif.org/ver10/schema}RecordingReference"/&gt;
 *         &lt;element name="RecordingConfiguration" type="{http://www.onvif.org/ver10/schema}RecordingConfiguration"/&gt;
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
    "recordingToken",
    "recordingConfiguration"
})
@XmlRootElement(name = "SetRecordingConfiguration")
public class SetRecordingConfiguration {

    @XmlElement(name = "RecordingToken", required = true)
    protected String recordingToken;
    @XmlElement(name = "RecordingConfiguration", required = true)
    protected RecordingConfiguration recordingConfiguration;

    /**
     * Recupera il valore della proprietà recordingToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordingToken() {
        return recordingToken;
    }

    /**
     * Imposta il valore della proprietà recordingToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordingToken(String value) {
        this.recordingToken = value;
    }

    /**
     * Recupera il valore della proprietà recordingConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link RecordingConfiguration }
     *     
     */
    public RecordingConfiguration getRecordingConfiguration() {
        return recordingConfiguration;
    }

    /**
     * Imposta il valore della proprietà recordingConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingConfiguration }
     *     
     */
    public void setRecordingConfiguration(RecordingConfiguration value) {
        this.recordingConfiguration = value;
    }

}
