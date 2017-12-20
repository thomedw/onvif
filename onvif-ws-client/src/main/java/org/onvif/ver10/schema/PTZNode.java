
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
 * <p>Classe Java per PTZNode complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PTZNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}DeviceEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.onvif.org/ver10/schema}Name" minOccurs="0"/&gt;
 *         &lt;element name="SupportedPTZSpaces" type="{http://www.onvif.org/ver10/schema}PTZSpaces"/&gt;
 *         &lt;element name="MaximumNumberOfPresets" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HomeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AuxiliaryCommands" type="{http://www.onvif.org/ver10/schema}AuxiliaryData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZNodeExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FixedHomePosition" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZNode", propOrder = {
    "name",
    "supportedPTZSpaces",
    "maximumNumberOfPresets",
    "homeSupported",
    "auxiliaryCommands",
    "extension"
})
public class PTZNode
    extends DeviceEntity
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SupportedPTZSpaces", required = true)
    protected PTZSpaces supportedPTZSpaces;
    @XmlElement(name = "MaximumNumberOfPresets")
    protected int maximumNumberOfPresets;
    @XmlElement(name = "HomeSupported")
    protected boolean homeSupported;
    @XmlElement(name = "AuxiliaryCommands")
    protected List<String> auxiliaryCommands;
    @XmlElement(name = "Extension")
    protected PTZNodeExtension extension;
    @XmlAttribute(name = "FixedHomePosition")
    protected Boolean fixedHomePosition;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà supportedPTZSpaces.
     * 
     * @return
     *     possible object is
     *     {@link PTZSpaces }
     *     
     */
    public PTZSpaces getSupportedPTZSpaces() {
        return supportedPTZSpaces;
    }

    /**
     * Imposta il valore della proprietà supportedPTZSpaces.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpaces }
     *     
     */
    public void setSupportedPTZSpaces(PTZSpaces value) {
        this.supportedPTZSpaces = value;
    }

    /**
     * Recupera il valore della proprietà maximumNumberOfPresets.
     * 
     */
    public int getMaximumNumberOfPresets() {
        return maximumNumberOfPresets;
    }

    /**
     * Imposta il valore della proprietà maximumNumberOfPresets.
     * 
     */
    public void setMaximumNumberOfPresets(int value) {
        this.maximumNumberOfPresets = value;
    }

    /**
     * Recupera il valore della proprietà homeSupported.
     * This getter has been renamed from isHomeSupported() to getHomeSupported() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getHomeSupported() {
        return homeSupported;
    }

    /**
     * Imposta il valore della proprietà homeSupported.
     * 
     */
    public void setHomeSupported(boolean value) {
        this.homeSupported = value;
    }

    /**
     * Gets the value of the auxiliaryCommands property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxiliaryCommands property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxiliaryCommands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAuxiliaryCommands() {
        if (auxiliaryCommands == null) {
            auxiliaryCommands = new ArrayList<String>();
        }
        return this.auxiliaryCommands;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link PTZNodeExtension }
     *     
     */
    public PTZNodeExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZNodeExtension }
     *     
     */
    public void setExtension(PTZNodeExtension value) {
        this.extension = value;
    }

    /**
     * Recupera il valore della proprietà fixedHomePosition.
     * This getter has been renamed from isFixedHomePosition() to getFixedHomePosition() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFixedHomePosition() {
        return fixedHomePosition;
    }

    /**
     * Imposta il valore della proprietà fixedHomePosition.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedHomePosition(Boolean value) {
        this.fixedHomePosition = value;
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
