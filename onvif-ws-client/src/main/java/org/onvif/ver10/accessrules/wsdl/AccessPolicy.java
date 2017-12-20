
package org.onvif.ver10.accessrules.wsdl;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * 
 * 						The access policy is an association of an access point and a schedule. It defines when an access
 * 						point can be accessed using an access profile which contains this access policy. If an access
 * 						profile contains several access policies specifying different schedules for the same access
 * 						point will result in a union of the schedules.
 * 					
 * 
 * <p>Classe Java per AccessPolicy complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AccessPolicy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScheduleToken" type="{http://www.onvif.org/ver10/pacs}ReferenceToken"/&gt;
 *         &lt;element name="Entity" type="{http://www.onvif.org/ver10/pacs}ReferenceToken"/&gt;
 *         &lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/accessrules/wsdl}AccessPolicyExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessPolicy", propOrder = {
    "scheduleToken",
    "entity",
    "entityType",
    "extension"
})
public class AccessPolicy {

    @XmlElement(name = "ScheduleToken", required = true)
    protected String scheduleToken;
    @XmlElement(name = "Entity", required = true)
    protected String entity;
    @XmlElement(name = "EntityType")
    protected QName entityType;
    @XmlElement(name = "Extension")
    protected AccessPolicyExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà scheduleToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleToken() {
        return scheduleToken;
    }

    /**
     * Imposta il valore della proprietà scheduleToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleToken(String value) {
        this.scheduleToken = value;
    }

    /**
     * Recupera il valore della proprietà entity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Imposta il valore della proprietà entity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * Recupera il valore della proprietà entityType.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getEntityType() {
        return entityType;
    }

    /**
     * Imposta il valore della proprietà entityType.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setEntityType(QName value) {
        this.entityType = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link AccessPolicyExtension }
     *     
     */
    public AccessPolicyExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessPolicyExtension }
     *     
     */
    public void setExtension(AccessPolicyExtension value) {
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
