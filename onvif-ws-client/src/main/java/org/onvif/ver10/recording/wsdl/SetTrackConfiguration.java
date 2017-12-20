
package org.onvif.ver10.recording.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.TrackConfiguration;


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
 *         &lt;element name="TrackToken" type="{http://www.onvif.org/ver10/schema}TrackReference"/&gt;
 *         &lt;element name="TrackConfiguration" type="{http://www.onvif.org/ver10/schema}TrackConfiguration"/&gt;
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
    "trackToken",
    "trackConfiguration"
})
@XmlRootElement(name = "SetTrackConfiguration")
public class SetTrackConfiguration {

    @XmlElement(name = "RecordingToken", required = true)
    protected String recordingToken;
    @XmlElement(name = "TrackToken", required = true)
    protected String trackToken;
    @XmlElement(name = "TrackConfiguration", required = true)
    protected TrackConfiguration trackConfiguration;

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
     * Recupera il valore della proprietà trackToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackToken() {
        return trackToken;
    }

    /**
     * Imposta il valore della proprietà trackToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackToken(String value) {
        this.trackToken = value;
    }

    /**
     * Recupera il valore della proprietà trackConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link TrackConfiguration }
     *     
     */
    public TrackConfiguration getTrackConfiguration() {
        return trackConfiguration;
    }

    /**
     * Imposta il valore della proprietà trackConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackConfiguration }
     *     
     */
    public void setTrackConfiguration(TrackConfiguration value) {
        this.trackConfiguration = value;
    }

}
