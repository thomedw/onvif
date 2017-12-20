
package org.onvif.ver10.accesscontrol.wsdl;

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
 * 
 * The AccessPoint capabilities reflect optional functionality of a particular physical entity.
 * Different AccessPoint instances may have different set of capabilities. This information may
 * change during device operation, e.g. if hardware settings are changed.
 * The following capabilities are available:
 * 
 * <p>Classe Java per AccessPointCapabilities complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AccessPointCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DisableAccessPoint" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Duress" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AnonymousAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AccessTaken" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ExternalAuthorization" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessPointCapabilities", propOrder = {
    "any"
})
public class AccessPointCapabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "DisableAccessPoint", required = true)
    protected boolean disableAccessPoint;
    @XmlAttribute(name = "Duress")
    protected Boolean duress;
    @XmlAttribute(name = "AnonymousAccess")
    protected Boolean anonymousAccess;
    @XmlAttribute(name = "AccessTaken")
    protected Boolean accessTaken;
    @XmlAttribute(name = "ExternalAuthorization")
    protected Boolean externalAuthorization;
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
     * Recupera il valore della proprietà disableAccessPoint.
     * This getter has been renamed from isDisableAccessPoint() to getDisableAccessPoint() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getDisableAccessPoint() {
        return disableAccessPoint;
    }

    /**
     * Imposta il valore della proprietà disableAccessPoint.
     * 
     */
    public void setDisableAccessPoint(boolean value) {
        this.disableAccessPoint = value;
    }

    /**
     * Recupera il valore della proprietà duress.
     * This getter has been renamed from isDuress() to getDuress() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDuress() {
        return duress;
    }

    /**
     * Imposta il valore della proprietà duress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuress(Boolean value) {
        this.duress = value;
    }

    /**
     * Recupera il valore della proprietà anonymousAccess.
     * This getter has been renamed from isAnonymousAccess() to getAnonymousAccess() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAnonymousAccess() {
        return anonymousAccess;
    }

    /**
     * Imposta il valore della proprietà anonymousAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnonymousAccess(Boolean value) {
        this.anonymousAccess = value;
    }

    /**
     * Recupera il valore della proprietà accessTaken.
     * This getter has been renamed from isAccessTaken() to getAccessTaken() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAccessTaken() {
        return accessTaken;
    }

    /**
     * Imposta il valore della proprietà accessTaken.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessTaken(Boolean value) {
        this.accessTaken = value;
    }

    /**
     * Recupera il valore della proprietà externalAuthorization.
     * This getter has been renamed from isExternalAuthorization() to getExternalAuthorization() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExternalAuthorization() {
        return externalAuthorization;
    }

    /**
     * Imposta il valore della proprietà externalAuthorization.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalAuthorization(Boolean value) {
        this.externalAuthorization = value;
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
