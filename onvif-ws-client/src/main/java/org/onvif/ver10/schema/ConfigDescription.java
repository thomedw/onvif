
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per ConfigDescription complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConfigDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parameters" type="{http://www.onvif.org/ver10/schema}ItemListDescription"/&gt;
 *         &lt;element name="Messages" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.onvif.org/ver10/schema}MessageDescription"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ParentTopic" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;anyAttribute processContents='lax'/&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ConfigDescriptionExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigDescription", propOrder = {
    "parameters",
    "messages",
    "extension"
})
public class ConfigDescription {

    @XmlElement(name = "Parameters", required = true)
    protected ItemListDescription parameters;
    @XmlElement(name = "Messages")
    protected List<ConfigDescription.Messages> messages;
    @XmlElement(name = "Extension")
    protected ConfigDescriptionExtension extension;
    @XmlAttribute(name = "Name", required = true)
    protected QName name;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà parameters.
     * 
     * @return
     *     possible object is
     *     {@link ItemListDescription }
     *     
     */
    public ItemListDescription getParameters() {
        return parameters;
    }

    /**
     * Imposta il valore della proprietà parameters.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListDescription }
     *     
     */
    public void setParameters(ItemListDescription value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigDescription.Messages }
     * 
     * 
     */
    public List<ConfigDescription.Messages> getMessages() {
        if (messages == null) {
            messages = new ArrayList<ConfigDescription.Messages>();
        }
        return this.messages;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link ConfigDescriptionExtension }
     *     
     */
    public ConfigDescriptionExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigDescriptionExtension }
     *     
     */
    public void setExtension(ConfigDescriptionExtension value) {
        this.extension = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setName(QName value) {
        this.name = value;
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


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.onvif.org/ver10/schema}MessageDescription"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ParentTopic" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;anyAttribute processContents='lax'/&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "parentTopic"
    })
    public static class Messages
        extends MessageDescription
    {

        @XmlElement(name = "ParentTopic", required = true)
        protected String parentTopic;

        /**
         * Recupera il valore della proprietà parentTopic.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentTopic() {
            return parentTopic;
        }

        /**
         * Imposta il valore della proprietà parentTopic.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentTopic(String value) {
            this.parentTopic = value;
        }

    }

}
