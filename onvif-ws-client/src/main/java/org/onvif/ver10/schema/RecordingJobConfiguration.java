
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per RecordingJobConfiguration complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RecordingJobConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordingToken" type="{http://www.onvif.org/ver10/schema}RecordingReference"/&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}RecordingJobMode"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Source" type="{http://www.onvif.org/ver10/schema}RecordingJobSource" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}RecordingJobConfigurationExtension" minOccurs="0"/&gt;
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
@XmlType(name = "RecordingJobConfiguration", propOrder = {
    "recordingToken",
    "mode",
    "priority",
    "source",
    "extension"
})
public class RecordingJobConfiguration {

    @XmlElement(name = "RecordingToken", required = true)
    protected String recordingToken;
    @XmlElement(name = "Mode", required = true)
    protected String mode;
    @XmlElement(name = "Priority")
    protected int priority;
    @XmlElement(name = "Source")
    protected List<RecordingJobSource> source;
    @XmlElement(name = "Extension")
    protected RecordingJobConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Recupera il valore della proprietà mode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Imposta il valore della proprietà mode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Recupera il valore della proprietà priority.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Imposta il valore della proprietà priority.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordingJobSource }
     * 
     * 
     */
    public List<RecordingJobSource> getSource() {
        if (source == null) {
            source = new ArrayList<RecordingJobSource>();
        }
        return this.source;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link RecordingJobConfigurationExtension }
     *     
     */
    public RecordingJobConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingJobConfigurationExtension }
     *     
     */
    public void setExtension(RecordingJobConfigurationExtension value) {
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
