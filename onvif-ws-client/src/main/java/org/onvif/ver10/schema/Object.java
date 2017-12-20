
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
 * <p>Classe Java per Object complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Object"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}ObjectId"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Appearance" type="{http://www.onvif.org/ver10/schema}Appearance" minOccurs="0"/&gt;
 *         &lt;element name="Behaviour" type="{http://www.onvif.org/ver10/schema}Behaviour" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ObjectExtension" minOccurs="0"/&gt;
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
@XmlType(name = "Object", propOrder = {
    "appearance",
    "behaviour",
    "extension"
})
public class Object
    extends ObjectId
{

    @XmlElement(name = "Appearance")
    protected Appearance appearance;
    @XmlElement(name = "Behaviour")
    protected Behaviour behaviour;
    @XmlElement(name = "Extension")
    protected ObjectExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà appearance.
     * 
     * @return
     *     possible object is
     *     {@link Appearance }
     *     
     */
    public Appearance getAppearance() {
        return appearance;
    }

    /**
     * Imposta il valore della proprietà appearance.
     * 
     * @param value
     *     allowed object is
     *     {@link Appearance }
     *     
     */
    public void setAppearance(Appearance value) {
        this.appearance = value;
    }

    /**
     * Recupera il valore della proprietà behaviour.
     * 
     * @return
     *     possible object is
     *     {@link Behaviour }
     *     
     */
    public Behaviour getBehaviour() {
        return behaviour;
    }

    /**
     * Imposta il valore della proprietà behaviour.
     * 
     * @param value
     *     allowed object is
     *     {@link Behaviour }
     *     
     */
    public void setBehaviour(Behaviour value) {
        this.behaviour = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link ObjectExtension }
     *     
     */
    public ObjectExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectExtension }
     *     
     */
    public void setExtension(ObjectExtension value) {
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
