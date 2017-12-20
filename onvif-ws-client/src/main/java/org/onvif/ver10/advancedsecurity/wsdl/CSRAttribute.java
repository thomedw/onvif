
package org.onvif.ver10.advancedsecurity.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * A CSR attribute as specified in PKCS#10.
 * 
 * <p>Classe Java per CSRAttribute complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CSRAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="X509v3Extension" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}X509v3Extension"/&gt;
 *         &lt;element name="BasicRequestAttribute" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}BasicRequestAttribute"/&gt;
 *         &lt;element name="anyAttribute" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSRAttribute", propOrder = {
    "x509V3Extension",
    "basicRequestAttribute",
    "anyAttribute"
})
public class CSRAttribute {

    @XmlElement(name = "X509v3Extension")
    protected X509V3Extension x509V3Extension;
    @XmlElement(name = "BasicRequestAttribute")
    protected BasicRequestAttribute basicRequestAttribute;
    protected CSRAttribute.AnyAttribute anyAttribute;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà x509V3Extension.
     * 
     * @return
     *     possible object is
     *     {@link X509V3Extension }
     *     
     */
    public X509V3Extension getX509V3Extension() {
        return x509V3Extension;
    }

    /**
     * Imposta il valore della proprietà x509V3Extension.
     * 
     * @param value
     *     allowed object is
     *     {@link X509V3Extension }
     *     
     */
    public void setX509V3Extension(X509V3Extension value) {
        this.x509V3Extension = value;
    }

    /**
     * Recupera il valore della proprietà basicRequestAttribute.
     * 
     * @return
     *     possible object is
     *     {@link BasicRequestAttribute }
     *     
     */
    public BasicRequestAttribute getBasicRequestAttribute() {
        return basicRequestAttribute;
    }

    /**
     * Imposta il valore della proprietà basicRequestAttribute.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicRequestAttribute }
     *     
     */
    public void setBasicRequestAttribute(BasicRequestAttribute value) {
        this.basicRequestAttribute = value;
    }

    /**
     * Recupera il valore della proprietà anyAttribute.
     * 
     * @return
     *     possible object is
     *     {@link CSRAttribute.AnyAttribute }
     *     
     */
    public CSRAttribute.AnyAttribute getAnyAttribute() {
        return anyAttribute;
    }

    /**
     * Imposta il valore della proprietà anyAttribute.
     * 
     * @param value
     *     allowed object is
     *     {@link CSRAttribute.AnyAttribute }
     *     
     */
    public void setAnyAttribute(CSRAttribute.AnyAttribute value) {
        this.anyAttribute = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class AnyAttribute {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

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

    }

}
