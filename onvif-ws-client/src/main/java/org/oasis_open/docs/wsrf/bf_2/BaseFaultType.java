
package org.oasis_open.docs.wsrf.bf_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.wsaddressing.W3CEndpointReference;
import org.oasis_open.docs.wsn.b_2.InvalidFilterFaultType;
import org.oasis_open.docs.wsn.b_2.InvalidMessageContentExpressionFaultType;
import org.oasis_open.docs.wsn.b_2.InvalidProducerPropertiesExpressionFaultType;
import org.oasis_open.docs.wsn.b_2.InvalidTopicExpressionFaultType;
import org.oasis_open.docs.wsn.b_2.MultipleTopicsSpecifiedFaultType;
import org.oasis_open.docs.wsn.b_2.NoCurrentMessageOnTopicFaultType;
import org.oasis_open.docs.wsn.b_2.NotifyMessageNotSupportedFaultType;
import org.oasis_open.docs.wsn.b_2.PauseFailedFaultType;
import org.oasis_open.docs.wsn.b_2.ResumeFailedFaultType;
import org.oasis_open.docs.wsn.b_2.SubscribeCreationFailedFaultType;
import org.oasis_open.docs.wsn.b_2.TopicExpressionDialectUnknownFaultType;
import org.oasis_open.docs.wsn.b_2.TopicNotSupportedFaultType;
import org.oasis_open.docs.wsn.b_2.UnableToCreatePullPointFaultType;
import org.oasis_open.docs.wsn.b_2.UnableToDestroyPullPointFaultType;
import org.oasis_open.docs.wsn.b_2.UnableToDestroySubscriptionFaultType;
import org.oasis_open.docs.wsn.b_2.UnableToGetMessagesFaultType;
import org.oasis_open.docs.wsn.b_2.UnacceptableInitialTerminationTimeFaultType;
import org.oasis_open.docs.wsn.b_2.UnacceptableTerminationTimeFaultType;
import org.oasis_open.docs.wsn.b_2.UnrecognizedPolicyRequestFaultType;
import org.oasis_open.docs.wsn.b_2.UnsupportedPolicyRequestFaultType;
import org.w3c.dom.Element;


/**
 * <p>Classe Java per BaseFaultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseFaultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Originator" type="{http://www.w3.org/2005/08/addressing}EndpointReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCode" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="dialect" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                 &lt;anyAttribute processContents='skip'/&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Description" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FaultCause" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' namespace='##other'/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFaultType", propOrder = {
    "any",
    "timestamp",
    "originator",
    "errorCode",
    "description",
    "faultCause"
})
@XmlSeeAlso({
    SubscribeCreationFailedFaultType.class,
    InvalidFilterFaultType.class,
    TopicExpressionDialectUnknownFaultType.class,
    InvalidTopicExpressionFaultType.class,
    TopicNotSupportedFaultType.class,
    MultipleTopicsSpecifiedFaultType.class,
    InvalidProducerPropertiesExpressionFaultType.class,
    InvalidMessageContentExpressionFaultType.class,
    UnrecognizedPolicyRequestFaultType.class,
    UnsupportedPolicyRequestFaultType.class,
    NotifyMessageNotSupportedFaultType.class,
    UnacceptableInitialTerminationTimeFaultType.class,
    NoCurrentMessageOnTopicFaultType.class,
    UnableToGetMessagesFaultType.class,
    UnableToDestroyPullPointFaultType.class,
    UnableToCreatePullPointFaultType.class,
    UnacceptableTerminationTimeFaultType.class,
    UnableToDestroySubscriptionFaultType.class,
    PauseFailedFaultType.class,
    ResumeFailedFaultType.class
})
public class BaseFaultType {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "Originator")
    protected W3CEndpointReference originator;
    @XmlElement(name = "ErrorCode")
    protected BaseFaultType.ErrorCode errorCode;
    @XmlElement(name = "Description")
    protected List<BaseFaultType.Description> description;
    @XmlElement(name = "FaultCause")
    protected BaseFaultType.FaultCause faultCause;
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
     * Recupera il valore della proprietà timestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Imposta il valore della proprietà timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Recupera il valore della proprietà originator.
     * 
     * @return
     *     possible object is
     *     {@link W3CEndpointReference }
     *     
     */
    public W3CEndpointReference getOriginator() {
        return originator;
    }

    /**
     * Imposta il valore della proprietà originator.
     * 
     * @param value
     *     allowed object is
     *     {@link W3CEndpointReference }
     *     
     */
    public void setOriginator(W3CEndpointReference value) {
        this.originator = value;
    }

    /**
     * Recupera il valore della proprietà errorCode.
     * 
     * @return
     *     possible object is
     *     {@link BaseFaultType.ErrorCode }
     *     
     */
    public BaseFaultType.ErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * Imposta il valore della proprietà errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseFaultType.ErrorCode }
     *     
     */
    public void setErrorCode(BaseFaultType.ErrorCode value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseFaultType.Description }
     * 
     * 
     */
    public List<BaseFaultType.Description> getDescription() {
        if (description == null) {
            description = new ArrayList<BaseFaultType.Description>();
        }
        return this.description;
    }

    /**
     * Recupera il valore della proprietà faultCause.
     * 
     * @return
     *     possible object is
     *     {@link BaseFaultType.FaultCause }
     *     
     */
    public BaseFaultType.FaultCause getFaultCause() {
        return faultCause;
    }

    /**
     * Imposta il valore della proprietà faultCause.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseFaultType.FaultCause }
     *     
     */
    public void setFaultCause(BaseFaultType.FaultCause value) {
        this.faultCause = value;
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Description {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
        protected String lang;

        /**
         * Recupera il valore della proprietà value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Imposta il valore della proprietà value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Recupera il valore della proprietà lang.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLang() {
            return lang;
        }

        /**
         * Imposta il valore della proprietà lang.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLang(String value) {
            this.lang = value;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="dialect" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *       &lt;anyAttribute processContents='skip'/&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class ErrorCode {

        @XmlMixed
        @XmlAnyElement
        protected List<Object> content;
        @XmlAttribute(name = "dialect", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String dialect;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link Element }
         * 
         * 
         */
        public List<Object> getContent() {
            if (content == null) {
                content = new ArrayList<Object>();
            }
            return this.content;
        }

        /**
         * Recupera il valore della proprietà dialect.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDialect() {
            return dialect;
        }

        /**
         * Imposta il valore della proprietà dialect.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDialect(String value) {
            this.dialect = value;
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
     *         &lt;any processContents='lax' namespace='##other'/&gt;
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
    public static class FaultCause {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Recupera il valore della proprietà any.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Imposta il valore della proprietà any.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
