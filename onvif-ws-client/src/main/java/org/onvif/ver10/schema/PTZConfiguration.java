
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per PTZConfiguration complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PTZConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="DefaultAbsolutePantTiltPositionSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="DefaultAbsoluteZoomPositionSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="DefaultRelativePanTiltTranslationSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="DefaultRelativeZoomTranslationSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="DefaultContinuousPanTiltVelocitySpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="DefaultContinuousZoomVelocitySpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="DefaultPTZSpeed" type="{http://www.onvif.org/ver10/schema}PTZSpeed" minOccurs="0"/&gt;
 *         &lt;element name="DefaultPTZTimeout" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="PanTiltLimits" type="{http://www.onvif.org/ver10/schema}PanTiltLimits" minOccurs="0"/&gt;
 *         &lt;element name="ZoomLimits" type="{http://www.onvif.org/ver10/schema}ZoomLimits" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZConfigurationExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MoveRamp" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="PresetRamp" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="PresetTourRamp" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZConfiguration", propOrder = {
    "nodeToken",
    "defaultAbsolutePantTiltPositionSpace",
    "defaultAbsoluteZoomPositionSpace",
    "defaultRelativePanTiltTranslationSpace",
    "defaultRelativeZoomTranslationSpace",
    "defaultContinuousPanTiltVelocitySpace",
    "defaultContinuousZoomVelocitySpace",
    "defaultPTZSpeed",
    "defaultPTZTimeout",
    "panTiltLimits",
    "zoomLimits",
    "extension"
})
public class PTZConfiguration
    extends ConfigurationEntity
{

    @XmlElement(name = "NodeToken", required = true)
    protected String nodeToken;
    @XmlElement(name = "DefaultAbsolutePantTiltPositionSpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultAbsolutePantTiltPositionSpace;
    @XmlElement(name = "DefaultAbsoluteZoomPositionSpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultAbsoluteZoomPositionSpace;
    @XmlElement(name = "DefaultRelativePanTiltTranslationSpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultRelativePanTiltTranslationSpace;
    @XmlElement(name = "DefaultRelativeZoomTranslationSpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultRelativeZoomTranslationSpace;
    @XmlElement(name = "DefaultContinuousPanTiltVelocitySpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultContinuousPanTiltVelocitySpace;
    @XmlElement(name = "DefaultContinuousZoomVelocitySpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultContinuousZoomVelocitySpace;
    @XmlElement(name = "DefaultPTZSpeed")
    protected PTZSpeed defaultPTZSpeed;
    @XmlElement(name = "DefaultPTZTimeout")
    protected Duration defaultPTZTimeout;
    @XmlElement(name = "PanTiltLimits")
    protected PanTiltLimits panTiltLimits;
    @XmlElement(name = "ZoomLimits")
    protected ZoomLimits zoomLimits;
    @XmlElement(name = "Extension")
    protected PTZConfigurationExtension extension;
    @XmlAttribute(name = "MoveRamp")
    protected Integer moveRamp;
    @XmlAttribute(name = "PresetRamp")
    protected Integer presetRamp;
    @XmlAttribute(name = "PresetTourRamp")
    protected Integer presetTourRamp;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà nodeToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeToken() {
        return nodeToken;
    }

    /**
     * Imposta il valore della proprietà nodeToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeToken(String value) {
        this.nodeToken = value;
    }

    /**
     * Recupera il valore della proprietà defaultAbsolutePantTiltPositionSpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAbsolutePantTiltPositionSpace() {
        return defaultAbsolutePantTiltPositionSpace;
    }

    /**
     * Imposta il valore della proprietà defaultAbsolutePantTiltPositionSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAbsolutePantTiltPositionSpace(String value) {
        this.defaultAbsolutePantTiltPositionSpace = value;
    }

    /**
     * Recupera il valore della proprietà defaultAbsoluteZoomPositionSpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAbsoluteZoomPositionSpace() {
        return defaultAbsoluteZoomPositionSpace;
    }

    /**
     * Imposta il valore della proprietà defaultAbsoluteZoomPositionSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAbsoluteZoomPositionSpace(String value) {
        this.defaultAbsoluteZoomPositionSpace = value;
    }

    /**
     * Recupera il valore della proprietà defaultRelativePanTiltTranslationSpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRelativePanTiltTranslationSpace() {
        return defaultRelativePanTiltTranslationSpace;
    }

    /**
     * Imposta il valore della proprietà defaultRelativePanTiltTranslationSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultRelativePanTiltTranslationSpace(String value) {
        this.defaultRelativePanTiltTranslationSpace = value;
    }

    /**
     * Recupera il valore della proprietà defaultRelativeZoomTranslationSpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRelativeZoomTranslationSpace() {
        return defaultRelativeZoomTranslationSpace;
    }

    /**
     * Imposta il valore della proprietà defaultRelativeZoomTranslationSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultRelativeZoomTranslationSpace(String value) {
        this.defaultRelativeZoomTranslationSpace = value;
    }

    /**
     * Recupera il valore della proprietà defaultContinuousPanTiltVelocitySpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultContinuousPanTiltVelocitySpace() {
        return defaultContinuousPanTiltVelocitySpace;
    }

    /**
     * Imposta il valore della proprietà defaultContinuousPanTiltVelocitySpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultContinuousPanTiltVelocitySpace(String value) {
        this.defaultContinuousPanTiltVelocitySpace = value;
    }

    /**
     * Recupera il valore della proprietà defaultContinuousZoomVelocitySpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultContinuousZoomVelocitySpace() {
        return defaultContinuousZoomVelocitySpace;
    }

    /**
     * Imposta il valore della proprietà defaultContinuousZoomVelocitySpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultContinuousZoomVelocitySpace(String value) {
        this.defaultContinuousZoomVelocitySpace = value;
    }

    /**
     * Recupera il valore della proprietà defaultPTZSpeed.
     * 
     * @return
     *     possible object is
     *     {@link PTZSpeed }
     *     
     */
    public PTZSpeed getDefaultPTZSpeed() {
        return defaultPTZSpeed;
    }

    /**
     * Imposta il valore della proprietà defaultPTZSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpeed }
     *     
     */
    public void setDefaultPTZSpeed(PTZSpeed value) {
        this.defaultPTZSpeed = value;
    }

    /**
     * Recupera il valore della proprietà defaultPTZTimeout.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDefaultPTZTimeout() {
        return defaultPTZTimeout;
    }

    /**
     * Imposta il valore della proprietà defaultPTZTimeout.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDefaultPTZTimeout(Duration value) {
        this.defaultPTZTimeout = value;
    }

    /**
     * Recupera il valore della proprietà panTiltLimits.
     * 
     * @return
     *     possible object is
     *     {@link PanTiltLimits }
     *     
     */
    public PanTiltLimits getPanTiltLimits() {
        return panTiltLimits;
    }

    /**
     * Imposta il valore della proprietà panTiltLimits.
     * 
     * @param value
     *     allowed object is
     *     {@link PanTiltLimits }
     *     
     */
    public void setPanTiltLimits(PanTiltLimits value) {
        this.panTiltLimits = value;
    }

    /**
     * Recupera il valore della proprietà zoomLimits.
     * 
     * @return
     *     possible object is
     *     {@link ZoomLimits }
     *     
     */
    public ZoomLimits getZoomLimits() {
        return zoomLimits;
    }

    /**
     * Imposta il valore della proprietà zoomLimits.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoomLimits }
     *     
     */
    public void setZoomLimits(ZoomLimits value) {
        this.zoomLimits = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link PTZConfigurationExtension }
     *     
     */
    public PTZConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZConfigurationExtension }
     *     
     */
    public void setExtension(PTZConfigurationExtension value) {
        this.extension = value;
    }

    /**
     * Recupera il valore della proprietà moveRamp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMoveRamp() {
        return moveRamp;
    }

    /**
     * Imposta il valore della proprietà moveRamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMoveRamp(Integer value) {
        this.moveRamp = value;
    }

    /**
     * Recupera il valore della proprietà presetRamp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPresetRamp() {
        return presetRamp;
    }

    /**
     * Imposta il valore della proprietà presetRamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPresetRamp(Integer value) {
        this.presetRamp = value;
    }

    /**
     * Recupera il valore della proprietà presetTourRamp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPresetTourRamp() {
        return presetTourRamp;
    }

    /**
     * Imposta il valore della proprietà presetTourRamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPresetTourRamp(Integer value) {
        this.presetTourRamp = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
