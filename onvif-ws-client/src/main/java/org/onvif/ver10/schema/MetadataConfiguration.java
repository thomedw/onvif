
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Classe Java per MetadataConfiguration complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MetadataConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PTZStatus" type="{http://www.onvif.org/ver10/schema}PTZFilter" minOccurs="0"/&gt;
 *         &lt;element name="Events" type="{http://www.onvif.org/ver10/schema}EventSubscription" minOccurs="0"/&gt;
 *         &lt;element name="Analytics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Multicast" type="{http://www.onvif.org/ver10/schema}MulticastConfiguration"/&gt;
 *         &lt;element name="SessionTimeout" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AnalyticsEngineConfiguration" type="{http://www.onvif.org/ver10/schema}AnalyticsEngineConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}MetadataConfigurationExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CompressionType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataConfiguration", propOrder = {
    "ptzStatus",
    "events",
    "analytics",
    "multicast",
    "sessionTimeout",
    "any",
    "analyticsEngineConfiguration",
    "extension"
})
public class MetadataConfiguration
    extends ConfigurationEntity
{

    @XmlElement(name = "PTZStatus")
    protected PTZFilter ptzStatus;
    @XmlElement(name = "Events")
    protected EventSubscription events;
    @XmlElement(name = "Analytics")
    protected Boolean analytics;
    @XmlElement(name = "Multicast", required = true)
    protected MulticastConfiguration multicast;
    @XmlElement(name = "SessionTimeout", required = true)
    protected Duration sessionTimeout;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "AnalyticsEngineConfiguration")
    protected AnalyticsEngineConfiguration analyticsEngineConfiguration;
    @XmlElement(name = "Extension")
    protected MetadataConfigurationExtension extension;
    @XmlAttribute(name = "CompressionType")
    protected String compressionType;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà ptzStatus.
     * 
     * @return
     *     possible object is
     *     {@link PTZFilter }
     *     
     */
    public PTZFilter getPTZStatus() {
        return ptzStatus;
    }

    /**
     * Imposta il valore della proprietà ptzStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZFilter }
     *     
     */
    public void setPTZStatus(PTZFilter value) {
        this.ptzStatus = value;
    }

    /**
     * Recupera il valore della proprietà events.
     * 
     * @return
     *     possible object is
     *     {@link EventSubscription }
     *     
     */
    public EventSubscription getEvents() {
        return events;
    }

    /**
     * Imposta il valore della proprietà events.
     * 
     * @param value
     *     allowed object is
     *     {@link EventSubscription }
     *     
     */
    public void setEvents(EventSubscription value) {
        this.events = value;
    }

    /**
     * Recupera il valore della proprietà analytics.
     * This getter has been renamed from isAnalytics() to getAnalytics() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAnalytics() {
        return analytics;
    }

    /**
     * Imposta il valore della proprietà analytics.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnalytics(Boolean value) {
        this.analytics = value;
    }

    /**
     * Recupera il valore della proprietà multicast.
     * 
     * @return
     *     possible object is
     *     {@link MulticastConfiguration }
     *     
     */
    public MulticastConfiguration getMulticast() {
        return multicast;
    }

    /**
     * Imposta il valore della proprietà multicast.
     * 
     * @param value
     *     allowed object is
     *     {@link MulticastConfiguration }
     *     
     */
    public void setMulticast(MulticastConfiguration value) {
        this.multicast = value;
    }

    /**
     * Recupera il valore della proprietà sessionTimeout.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSessionTimeout() {
        return sessionTimeout;
    }

    /**
     * Imposta il valore della proprietà sessionTimeout.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSessionTimeout(Duration value) {
        this.sessionTimeout = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link java.lang.Object }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
    }

    /**
     * Recupera il valore della proprietà analyticsEngineConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link AnalyticsEngineConfiguration }
     *     
     */
    public AnalyticsEngineConfiguration getAnalyticsEngineConfiguration() {
        return analyticsEngineConfiguration;
    }

    /**
     * Imposta il valore della proprietà analyticsEngineConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyticsEngineConfiguration }
     *     
     */
    public void setAnalyticsEngineConfiguration(AnalyticsEngineConfiguration value) {
        this.analyticsEngineConfiguration = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link MetadataConfigurationExtension }
     *     
     */
    public MetadataConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataConfigurationExtension }
     *     
     */
    public void setExtension(MetadataConfigurationExtension value) {
        this.extension = value;
    }

    /**
     * Recupera il valore della proprietà compressionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompressionType() {
        return compressionType;
    }

    /**
     * Imposta il valore della proprietà compressionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompressionType(String value) {
        this.compressionType = value;
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
