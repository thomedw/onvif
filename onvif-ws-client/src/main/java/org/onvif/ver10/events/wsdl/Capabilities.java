
package org.onvif.ver10.events.wsdl;

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
 *       &lt;attribute name="WSSubscriptionPolicySupport" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WSPullPointSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WSPausableSubscriptionManagerInterfaceSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MaxNotificationProducers" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="MaxPullPoints" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="PersistentNotificationStorage" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
    @XmlAttribute(name = "WSSubscriptionPolicySupport")
    protected Boolean wsSubscriptionPolicySupport;
    @XmlAttribute(name = "WSPullPointSupport")
    protected Boolean wsPullPointSupport;
    @XmlAttribute(name = "WSPausableSubscriptionManagerInterfaceSupport")
    protected Boolean wsPausableSubscriptionManagerInterfaceSupport;
    @XmlAttribute(name = "MaxNotificationProducers")
    protected Integer maxNotificationProducers;
    @XmlAttribute(name = "MaxPullPoints")
    protected Integer maxPullPoints;
    @XmlAttribute(name = "PersistentNotificationStorage")
    protected Boolean persistentNotificationStorage;
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
     * Recupera il valore della proprietà wsSubscriptionPolicySupport.
     * This getter has been renamed from isWSSubscriptionPolicySupport() to getWSSubscriptionPolicySupport() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getWSSubscriptionPolicySupport() {
        return wsSubscriptionPolicySupport;
    }

    /**
     * Imposta il valore della proprietà wsSubscriptionPolicySupport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWSSubscriptionPolicySupport(Boolean value) {
        this.wsSubscriptionPolicySupport = value;
    }

    /**
     * Recupera il valore della proprietà wsPullPointSupport.
     * This getter has been renamed from isWSPullPointSupport() to getWSPullPointSupport() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getWSPullPointSupport() {
        return wsPullPointSupport;
    }

    /**
     * Imposta il valore della proprietà wsPullPointSupport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWSPullPointSupport(Boolean value) {
        this.wsPullPointSupport = value;
    }

    /**
     * Recupera il valore della proprietà wsPausableSubscriptionManagerInterfaceSupport.
     * This getter has been renamed from isWSPausableSubscriptionManagerInterfaceSupport() to getWSPausableSubscriptionManagerInterfaceSupport() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getWSPausableSubscriptionManagerInterfaceSupport() {
        return wsPausableSubscriptionManagerInterfaceSupport;
    }

    /**
     * Imposta il valore della proprietà wsPausableSubscriptionManagerInterfaceSupport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWSPausableSubscriptionManagerInterfaceSupport(Boolean value) {
        this.wsPausableSubscriptionManagerInterfaceSupport = value;
    }

    /**
     * Recupera il valore della proprietà maxNotificationProducers.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNotificationProducers() {
        return maxNotificationProducers;
    }

    /**
     * Imposta il valore della proprietà maxNotificationProducers.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNotificationProducers(Integer value) {
        this.maxNotificationProducers = value;
    }

    /**
     * Recupera il valore della proprietà maxPullPoints.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPullPoints() {
        return maxPullPoints;
    }

    /**
     * Imposta il valore della proprietà maxPullPoints.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPullPoints(Integer value) {
        this.maxPullPoints = value;
    }

    /**
     * Recupera il valore della proprietà persistentNotificationStorage.
     * This getter has been renamed from isPersistentNotificationStorage() to getPersistentNotificationStorage() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPersistentNotificationStorage() {
        return persistentNotificationStorage;
    }

    /**
     * Imposta il valore della proprietà persistentNotificationStorage.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersistentNotificationStorage(Boolean value) {
        this.persistentNotificationStorage = value;
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
