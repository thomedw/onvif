
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
 * <p>Classe Java per RealTimeStreamingCapabilities complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RealTimeStreamingCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RTPMulticast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RTP_TCP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RTP_RTSP_TCP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}RealTimeStreamingCapabilitiesExtension" minOccurs="0"/&gt;
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
@XmlType(name = "RealTimeStreamingCapabilities", propOrder = {
    "rtpMulticast",
    "rtptcp",
    "rtprtsptcp",
    "extension"
})
public class RealTimeStreamingCapabilities {

    @XmlElement(name = "RTPMulticast")
    protected Boolean rtpMulticast;
    @XmlElement(name = "RTP_TCP")
    protected Boolean rtptcp;
    @XmlElement(name = "RTP_RTSP_TCP")
    protected Boolean rtprtsptcp;
    @XmlElement(name = "Extension")
    protected RealTimeStreamingCapabilitiesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà rtpMulticast.
     * This getter has been renamed from isRTPMulticast() to getRTPMulticast() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRTPMulticast() {
        return rtpMulticast;
    }

    /**
     * Imposta il valore della proprietà rtpMulticast.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRTPMulticast(Boolean value) {
        this.rtpMulticast = value;
    }

    /**
     * Recupera il valore della proprietà rtptcp.
     * This getter has been renamed from isRTPTCP() to getRTPTCP() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRTPTCP() {
        return rtptcp;
    }

    /**
     * Imposta il valore della proprietà rtptcp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRTPTCP(Boolean value) {
        this.rtptcp = value;
    }

    /**
     * Recupera il valore della proprietà rtprtsptcp.
     * This getter has been renamed from isRTPRTSPTCP() to getRTPRTSPTCP() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRTPRTSPTCP() {
        return rtprtsptcp;
    }

    /**
     * Imposta il valore della proprietà rtprtsptcp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRTPRTSPTCP(Boolean value) {
        this.rtprtsptcp = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link RealTimeStreamingCapabilitiesExtension }
     *     
     */
    public RealTimeStreamingCapabilitiesExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link RealTimeStreamingCapabilitiesExtension }
     *     
     */
    public void setExtension(RealTimeStreamingCapabilitiesExtension value) {
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
