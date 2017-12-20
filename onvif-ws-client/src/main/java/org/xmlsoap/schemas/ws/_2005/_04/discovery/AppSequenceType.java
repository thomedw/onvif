
package org.xmlsoap.schemas.ws._2005._04.discovery;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per AppSequenceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AppSequenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="InstanceId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;attribute name="SequenceId" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="MessageNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppSequenceType")
public class AppSequenceType {

    @XmlAttribute(name = "InstanceId", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long instanceId;
    @XmlAttribute(name = "SequenceId")
    @XmlSchemaType(name = "anyURI")
    protected String sequenceId;
    @XmlAttribute(name = "MessageNumber", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long messageNumber;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà instanceId.
     * 
     */
    public long getInstanceId() {
        return instanceId;
    }

    /**
     * Imposta il valore della proprietà instanceId.
     * 
     */
    public void setInstanceId(long value) {
        this.instanceId = value;
    }

    /**
     * Recupera il valore della proprietà sequenceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceId() {
        return sequenceId;
    }

    /**
     * Imposta il valore della proprietà sequenceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceId(String value) {
        this.sequenceId = value;
    }

    /**
     * Recupera il valore della proprietà messageNumber.
     * 
     */
    public long getMessageNumber() {
        return messageNumber;
    }

    /**
     * Imposta il valore della proprietà messageNumber.
     * 
     */
    public void setMessageNumber(long value) {
        this.messageNumber = value;
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
