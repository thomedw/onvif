
package org.onvif.ver10.advancedsecurity.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Classe Java per CertPathValidationParameters complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CertPathValidationParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequireTLSWWWClientAuthExtendedKeyUsage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseDeltaCRLs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="anyParameters" minOccurs="0"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertPathValidationParameters", propOrder = {
    "requireTLSWWWClientAuthExtendedKeyUsage",
    "useDeltaCRLs",
    "anyParameters"
})
public class CertPathValidationParameters {

    @XmlElement(name = "RequireTLSWWWClientAuthExtendedKeyUsage", defaultValue = "false")
    protected Boolean requireTLSWWWClientAuthExtendedKeyUsage;
    @XmlElement(name = "UseDeltaCRLs", defaultValue = "false")
    protected Boolean useDeltaCRLs;
    protected CertPathValidationParameters.AnyParameters anyParameters;

    /**
     * Recupera il valore della proprietà requireTLSWWWClientAuthExtendedKeyUsage.
     * This getter has been renamed from isRequireTLSWWWClientAuthExtendedKeyUsage() to getRequireTLSWWWClientAuthExtendedKeyUsage() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRequireTLSWWWClientAuthExtendedKeyUsage() {
        return requireTLSWWWClientAuthExtendedKeyUsage;
    }

    /**
     * Imposta il valore della proprietà requireTLSWWWClientAuthExtendedKeyUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireTLSWWWClientAuthExtendedKeyUsage(Boolean value) {
        this.requireTLSWWWClientAuthExtendedKeyUsage = value;
    }

    /**
     * Recupera il valore della proprietà useDeltaCRLs.
     * This getter has been renamed from isUseDeltaCRLs() to getUseDeltaCRLs() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseDeltaCRLs() {
        return useDeltaCRLs;
    }

    /**
     * Imposta il valore della proprietà useDeltaCRLs.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDeltaCRLs(Boolean value) {
        this.useDeltaCRLs = value;
    }

    /**
     * Recupera il valore della proprietà anyParameters.
     * 
     * @return
     *     possible object is
     *     {@link CertPathValidationParameters.AnyParameters }
     *     
     */
    public CertPathValidationParameters.AnyParameters getAnyParameters() {
        return anyParameters;
    }

    /**
     * Imposta il valore della proprietà anyParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link CertPathValidationParameters.AnyParameters }
     *     
     */
    public void setAnyParameters(CertPathValidationParameters.AnyParameters value) {
        this.anyParameters = value;
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
    public static class AnyParameters {

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
