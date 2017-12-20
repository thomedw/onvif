
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per Capabilities complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Capabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Analytics" type="{http://www.onvif.org/ver10/schema}AnalyticsCapabilities" minOccurs="0"/&gt;
 *         &lt;element name="Device" type="{http://www.onvif.org/ver10/schema}DeviceCapabilities" minOccurs="0"/&gt;
 *         &lt;element name="Events" type="{http://www.onvif.org/ver10/schema}EventCapabilities" minOccurs="0"/&gt;
 *         &lt;element name="Imaging" type="{http://www.onvif.org/ver10/schema}ImagingCapabilities" minOccurs="0"/&gt;
 *         &lt;element name="Media" type="{http://www.onvif.org/ver10/schema}MediaCapabilities" minOccurs="0"/&gt;
 *         &lt;element name="PTZ" type="{http://www.onvif.org/ver10/schema}PTZCapabilities" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}CapabilitiesExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities", propOrder = {
    "analytics",
    "device",
    "events",
    "imaging",
    "media",
    "ptz",
    "extension"
})
public class Capabilities {

    @XmlElement(name = "Analytics")
    protected AnalyticsCapabilities analytics;
    @XmlElement(name = "Device")
    protected DeviceCapabilities device;
    @XmlElement(name = "Events")
    protected EventCapabilities events;
    @XmlElement(name = "Imaging")
    protected ImagingCapabilities imaging;
    @XmlElement(name = "Media")
    protected MediaCapabilities media;
    @XmlElement(name = "PTZ")
    protected PTZCapabilities ptz;
    @XmlElement(name = "Extension")
    protected CapabilitiesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà analytics.
     * 
     * @return
     *     possible object is
     *     {@link AnalyticsCapabilities }
     *     
     */
    public AnalyticsCapabilities getAnalytics() {
        return analytics;
    }

    /**
     * Imposta il valore della proprietà analytics.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyticsCapabilities }
     *     
     */
    public void setAnalytics(AnalyticsCapabilities value) {
        this.analytics = value;
    }

    /**
     * Recupera il valore della proprietà device.
     * 
     * @return
     *     possible object is
     *     {@link DeviceCapabilities }
     *     
     */
    public DeviceCapabilities getDevice() {
        return device;
    }

    /**
     * Imposta il valore della proprietà device.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCapabilities }
     *     
     */
    public void setDevice(DeviceCapabilities value) {
        this.device = value;
    }

    /**
     * Recupera il valore della proprietà events.
     * 
     * @return
     *     possible object is
     *     {@link EventCapabilities }
     *     
     */
    public EventCapabilities getEvents() {
        return events;
    }

    /**
     * Imposta il valore della proprietà events.
     * 
     * @param value
     *     allowed object is
     *     {@link EventCapabilities }
     *     
     */
    public void setEvents(EventCapabilities value) {
        this.events = value;
    }

    /**
     * Recupera il valore della proprietà imaging.
     * 
     * @return
     *     possible object is
     *     {@link ImagingCapabilities }
     *     
     */
    public ImagingCapabilities getImaging() {
        return imaging;
    }

    /**
     * Imposta il valore della proprietà imaging.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingCapabilities }
     *     
     */
    public void setImaging(ImagingCapabilities value) {
        this.imaging = value;
    }

    /**
     * Recupera il valore della proprietà media.
     * 
     * @return
     *     possible object is
     *     {@link MediaCapabilities }
     *     
     */
    public MediaCapabilities getMedia() {
        return media;
    }

    /**
     * Imposta il valore della proprietà media.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaCapabilities }
     *     
     */
    public void setMedia(MediaCapabilities value) {
        this.media = value;
    }

    /**
     * Recupera il valore della proprietà ptz.
     * 
     * @return
     *     possible object is
     *     {@link PTZCapabilities }
     *     
     */
    public PTZCapabilities getPTZ() {
        return ptz;
    }

    /**
     * Imposta il valore della proprietà ptz.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZCapabilities }
     *     
     */
    public void setPTZ(PTZCapabilities value) {
        this.ptz = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesExtension }
     *     
     */
    public CapabilitiesExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesExtension }
     *     
     */
    public void setExtension(CapabilitiesExtension value) {
        this.extension = value;
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
