
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per SecurityCapabilities complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SecurityCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TLS1.0" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TLS1.1" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TLS1.2" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OnboardKeyGeneration" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AccessPolicyConfig" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DefaultAccessPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Dot1X" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RemoteUserHandling" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="X.509Token" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SAMLToken" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="KerberosToken" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UsernameToken" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HttpDigest" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RELToken" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SupportedEAPMethods" type="{http://www.onvif.org/ver10/device/wsdl}EAPMethodTypes" /&gt;
 *       &lt;attribute name="MaxUsers" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="MaxUserNameLength" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="MaxPasswordLength" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCapabilities")
public class SecurityCapabilities {

    @XmlAttribute(name = "TLS1.0")
    protected Boolean tls10;
    @XmlAttribute(name = "TLS1.1")
    protected Boolean tls11;
    @XmlAttribute(name = "TLS1.2")
    protected Boolean tls12;
    @XmlAttribute(name = "OnboardKeyGeneration")
    protected Boolean onboardKeyGeneration;
    @XmlAttribute(name = "AccessPolicyConfig")
    protected Boolean accessPolicyConfig;
    @XmlAttribute(name = "DefaultAccessPolicy")
    protected Boolean defaultAccessPolicy;
    @XmlAttribute(name = "Dot1X")
    protected Boolean dot1X;
    @XmlAttribute(name = "RemoteUserHandling")
    protected Boolean remoteUserHandling;
    @XmlAttribute(name = "X.509Token")
    protected Boolean x509Token;
    @XmlAttribute(name = "SAMLToken")
    protected Boolean samlToken;
    @XmlAttribute(name = "KerberosToken")
    protected Boolean kerberosToken;
    @XmlAttribute(name = "UsernameToken")
    protected Boolean usernameToken;
    @XmlAttribute(name = "HttpDigest")
    protected Boolean httpDigest;
    @XmlAttribute(name = "RELToken")
    protected Boolean relToken;
    @XmlAttribute(name = "SupportedEAPMethods")
    protected List<Integer> supportedEAPMethods;
    @XmlAttribute(name = "MaxUsers")
    protected Integer maxUsers;
    @XmlAttribute(name = "MaxUserNameLength")
    protected Integer maxUserNameLength;
    @XmlAttribute(name = "MaxPasswordLength")
    protected Integer maxPasswordLength;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà tls10.
     * This getter has been renamed from isTLS10() to getTLS10() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTLS10() {
        return tls10;
    }

    /**
     * Imposta il valore della proprietà tls10.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTLS10(Boolean value) {
        this.tls10 = value;
    }

    /**
     * Recupera il valore della proprietà tls11.
     * This getter has been renamed from isTLS11() to getTLS11() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTLS11() {
        return tls11;
    }

    /**
     * Imposta il valore della proprietà tls11.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTLS11(Boolean value) {
        this.tls11 = value;
    }

    /**
     * Recupera il valore della proprietà tls12.
     * This getter has been renamed from isTLS12() to getTLS12() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTLS12() {
        return tls12;
    }

    /**
     * Imposta il valore della proprietà tls12.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTLS12(Boolean value) {
        this.tls12 = value;
    }

    /**
     * Recupera il valore della proprietà onboardKeyGeneration.
     * This getter has been renamed from isOnboardKeyGeneration() to getOnboardKeyGeneration() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOnboardKeyGeneration() {
        return onboardKeyGeneration;
    }

    /**
     * Imposta il valore della proprietà onboardKeyGeneration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnboardKeyGeneration(Boolean value) {
        this.onboardKeyGeneration = value;
    }

    /**
     * Recupera il valore della proprietà accessPolicyConfig.
     * This getter has been renamed from isAccessPolicyConfig() to getAccessPolicyConfig() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAccessPolicyConfig() {
        return accessPolicyConfig;
    }

    /**
     * Imposta il valore della proprietà accessPolicyConfig.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessPolicyConfig(Boolean value) {
        this.accessPolicyConfig = value;
    }

    /**
     * Recupera il valore della proprietà defaultAccessPolicy.
     * This getter has been renamed from isDefaultAccessPolicy() to getDefaultAccessPolicy() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDefaultAccessPolicy() {
        return defaultAccessPolicy;
    }

    /**
     * Imposta il valore della proprietà defaultAccessPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultAccessPolicy(Boolean value) {
        this.defaultAccessPolicy = value;
    }

    /**
     * Recupera il valore della proprietà dot1X.
     * This getter has been renamed from isDot1X() to getDot1X() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDot1X() {
        return dot1X;
    }

    /**
     * Imposta il valore della proprietà dot1X.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDot1X(Boolean value) {
        this.dot1X = value;
    }

    /**
     * Recupera il valore della proprietà remoteUserHandling.
     * This getter has been renamed from isRemoteUserHandling() to getRemoteUserHandling() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRemoteUserHandling() {
        return remoteUserHandling;
    }

    /**
     * Imposta il valore della proprietà remoteUserHandling.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteUserHandling(Boolean value) {
        this.remoteUserHandling = value;
    }

    /**
     * Recupera il valore della proprietà x509Token.
     * This getter has been renamed from isX509Token() to getX509Token() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getX509Token() {
        return x509Token;
    }

    /**
     * Imposta il valore della proprietà x509Token.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setX509Token(Boolean value) {
        this.x509Token = value;
    }

    /**
     * Recupera il valore della proprietà samlToken.
     * This getter has been renamed from isSAMLToken() to getSAMLToken() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSAMLToken() {
        return samlToken;
    }

    /**
     * Imposta il valore della proprietà samlToken.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSAMLToken(Boolean value) {
        this.samlToken = value;
    }

    /**
     * Recupera il valore della proprietà kerberosToken.
     * This getter has been renamed from isKerberosToken() to getKerberosToken() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getKerberosToken() {
        return kerberosToken;
    }

    /**
     * Imposta il valore della proprietà kerberosToken.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKerberosToken(Boolean value) {
        this.kerberosToken = value;
    }

    /**
     * Recupera il valore della proprietà usernameToken.
     * This getter has been renamed from isUsernameToken() to getUsernameToken() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUsernameToken() {
        return usernameToken;
    }

    /**
     * Imposta il valore della proprietà usernameToken.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsernameToken(Boolean value) {
        this.usernameToken = value;
    }

    /**
     * Recupera il valore della proprietà httpDigest.
     * This getter has been renamed from isHttpDigest() to getHttpDigest() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHttpDigest() {
        return httpDigest;
    }

    /**
     * Imposta il valore della proprietà httpDigest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHttpDigest(Boolean value) {
        this.httpDigest = value;
    }

    /**
     * Recupera il valore della proprietà relToken.
     * This getter has been renamed from isRELToken() to getRELToken() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRELToken() {
        return relToken;
    }

    /**
     * Imposta il valore della proprietà relToken.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRELToken(Boolean value) {
        this.relToken = value;
    }

    /**
     * Gets the value of the supportedEAPMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedEAPMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedEAPMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSupportedEAPMethods() {
        if (supportedEAPMethods == null) {
            supportedEAPMethods = new ArrayList<Integer>();
        }
        return this.supportedEAPMethods;
    }

    /**
     * Recupera il valore della proprietà maxUsers.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxUsers() {
        return maxUsers;
    }

    /**
     * Imposta il valore della proprietà maxUsers.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxUsers(Integer value) {
        this.maxUsers = value;
    }

    /**
     * Recupera il valore della proprietà maxUserNameLength.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxUserNameLength() {
        return maxUserNameLength;
    }

    /**
     * Imposta il valore della proprietà maxUserNameLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxUserNameLength(Integer value) {
        this.maxUserNameLength = value;
    }

    /**
     * Recupera il valore della proprietà maxPasswordLength.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPasswordLength() {
        return maxPasswordLength;
    }

    /**
     * Imposta il valore della proprietà maxPasswordLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPasswordLength(Integer value) {
        this.maxPasswordLength = value;
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
