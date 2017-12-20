
package org.onvif.ver10.recording.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


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
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DynamicRecordings" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DynamicTracks" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Encoding" type="{http://www.onvif.org/ver10/recording/wsdl}EncodingTypes" /&gt;
 *       &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="MaxTotalRate" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="MaxRecordings" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="MaxRecordingJobs" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Options" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MetadataRecording" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SupportedExportFileFormats" type="{http://www.onvif.org/ver10/schema}StringAttrList" /&gt;
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
    "any"
})
public class Capabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "DynamicRecordings")
    protected Boolean dynamicRecordings;
    @XmlAttribute(name = "DynamicTracks")
    protected Boolean dynamicTracks;
    @XmlAttribute(name = "Encoding")
    protected List<String> encoding;
    @XmlAttribute(name = "MaxRate")
    protected Float maxRate;
    @XmlAttribute(name = "MaxTotalRate")
    protected Float maxTotalRate;
    @XmlAttribute(name = "MaxRecordings")
    protected Float maxRecordings;
    @XmlAttribute(name = "MaxRecordingJobs")
    protected Integer maxRecordingJobs;
    @XmlAttribute(name = "Options")
    protected Boolean options;
    @XmlAttribute(name = "MetadataRecording")
    protected Boolean metadataRecording;
    @XmlAttribute(name = "SupportedExportFileFormats")
    protected List<String> supportedExportFileFormats;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Recupera il valore della proprietà dynamicRecordings.
     * This getter has been renamed from isDynamicRecordings() to getDynamicRecordings() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDynamicRecordings() {
        return dynamicRecordings;
    }

    /**
     * Imposta il valore della proprietà dynamicRecordings.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamicRecordings(Boolean value) {
        this.dynamicRecordings = value;
    }

    /**
     * Recupera il valore della proprietà dynamicTracks.
     * This getter has been renamed from isDynamicTracks() to getDynamicTracks() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDynamicTracks() {
        return dynamicTracks;
    }

    /**
     * Imposta il valore della proprietà dynamicTracks.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamicTracks(Boolean value) {
        this.dynamicTracks = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encoding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncoding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEncoding() {
        if (encoding == null) {
            encoding = new ArrayList<String>();
        }
        return this.encoding;
    }

    /**
     * Recupera il valore della proprietà maxRate.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxRate() {
        return maxRate;
    }

    /**
     * Imposta il valore della proprietà maxRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxRate(Float value) {
        this.maxRate = value;
    }

    /**
     * Recupera il valore della proprietà maxTotalRate.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxTotalRate() {
        return maxTotalRate;
    }

    /**
     * Imposta il valore della proprietà maxTotalRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxTotalRate(Float value) {
        this.maxTotalRate = value;
    }

    /**
     * Recupera il valore della proprietà maxRecordings.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxRecordings() {
        return maxRecordings;
    }

    /**
     * Imposta il valore della proprietà maxRecordings.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxRecordings(Float value) {
        this.maxRecordings = value;
    }

    /**
     * Recupera il valore della proprietà maxRecordingJobs.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRecordingJobs() {
        return maxRecordingJobs;
    }

    /**
     * Imposta il valore della proprietà maxRecordingJobs.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRecordingJobs(Integer value) {
        this.maxRecordingJobs = value;
    }

    /**
     * Recupera il valore della proprietà options.
     * This getter has been renamed from isOptions() to getOptions() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOptions() {
        return options;
    }

    /**
     * Imposta il valore della proprietà options.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptions(Boolean value) {
        this.options = value;
    }

    /**
     * Recupera il valore della proprietà metadataRecording.
     * This getter has been renamed from isMetadataRecording() to getMetadataRecording() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMetadataRecording() {
        return metadataRecording;
    }

    /**
     * Imposta il valore della proprietà metadataRecording.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMetadataRecording(Boolean value) {
        this.metadataRecording = value;
    }

    /**
     * Gets the value of the supportedExportFileFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedExportFileFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedExportFileFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedExportFileFormats() {
        if (supportedExportFileFormats == null) {
            supportedExportFileFormats = new ArrayList<String>();
        }
        return this.supportedExportFileFormats;
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
