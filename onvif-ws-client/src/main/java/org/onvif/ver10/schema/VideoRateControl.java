
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per VideoRateControl complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VideoRateControl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FrameRateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EncodingInterval" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BitrateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRateControl", propOrder = {
    "frameRateLimit",
    "encodingInterval",
    "bitrateLimit"
})
public class VideoRateControl {

    @XmlElement(name = "FrameRateLimit")
    protected int frameRateLimit;
    @XmlElement(name = "EncodingInterval")
    protected int encodingInterval;
    @XmlElement(name = "BitrateLimit")
    protected int bitrateLimit;

    /**
     * Recupera il valore della proprietà frameRateLimit.
     * 
     */
    public int getFrameRateLimit() {
        return frameRateLimit;
    }

    /**
     * Imposta il valore della proprietà frameRateLimit.
     * 
     */
    public void setFrameRateLimit(int value) {
        this.frameRateLimit = value;
    }

    /**
     * Recupera il valore della proprietà encodingInterval.
     * 
     */
    public int getEncodingInterval() {
        return encodingInterval;
    }

    /**
     * Imposta il valore della proprietà encodingInterval.
     * 
     */
    public void setEncodingInterval(int value) {
        this.encodingInterval = value;
    }

    /**
     * Recupera il valore della proprietà bitrateLimit.
     * 
     */
    public int getBitrateLimit() {
        return bitrateLimit;
    }

    /**
     * Imposta il valore della proprietà bitrateLimit.
     * 
     */
    public void setBitrateLimit(int value) {
        this.bitrateLimit = value;
    }

}
