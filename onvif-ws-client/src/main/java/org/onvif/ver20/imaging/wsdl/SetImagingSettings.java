
package org.onvif.ver20.imaging.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.ImagingSettings20;


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
 *         &lt;element name="VideoSourceToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="ImagingSettings" type="{http://www.onvif.org/ver10/schema}ImagingSettings20"/&gt;
 *         &lt;element name="ForcePersistence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "videoSourceToken",
    "imagingSettings",
    "forcePersistence"
})
@XmlRootElement(name = "SetImagingSettings")
public class SetImagingSettings {

    @XmlElement(name = "VideoSourceToken", required = true)
    protected String videoSourceToken;
    @XmlElement(name = "ImagingSettings", required = true)
    protected ImagingSettings20 imagingSettings;
    @XmlElement(name = "ForcePersistence")
    protected Boolean forcePersistence;

    /**
     * Recupera il valore della proprietà videoSourceToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoSourceToken() {
        return videoSourceToken;
    }

    /**
     * Imposta il valore della proprietà videoSourceToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoSourceToken(String value) {
        this.videoSourceToken = value;
    }

    /**
     * Recupera il valore della proprietà imagingSettings.
     * 
     * @return
     *     possible object is
     *     {@link ImagingSettings20 }
     *     
     */
    public ImagingSettings20 getImagingSettings() {
        return imagingSettings;
    }

    /**
     * Imposta il valore della proprietà imagingSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingSettings20 }
     *     
     */
    public void setImagingSettings(ImagingSettings20 value) {
        this.imagingSettings = value;
    }

    /**
     * Recupera il valore della proprietà forcePersistence.
     * This getter has been renamed from isForcePersistence() to getForcePersistence() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getForcePersistence() {
        return forcePersistence;
    }

    /**
     * Imposta il valore della proprietà forcePersistence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcePersistence(Boolean value) {
        this.forcePersistence = value;
    }

}
