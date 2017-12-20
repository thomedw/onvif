
package org.onvif.ver10.accesscontrol.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.onvif.ver10.pacs.DataEntity;


/**
 * 
 * Used as extension base for AccessPointInfo.
 * 
 * 
 * <p>Classe Java per AccessPointInfoBase complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AccessPointInfoBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.onvif.org/ver10/pacs}DataEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.onvif.org/ver10/pacs}Name"/&gt;
 *         &lt;element name="Description" type="{http://www.onvif.org/ver10/pacs}Description" minOccurs="0"/&gt;
 *         &lt;element name="AreaFrom" type="{http://www.onvif.org/ver10/pacs}ReferenceToken" minOccurs="0"/&gt;
 *         &lt;element name="AreaTo" type="{http://www.onvif.org/ver10/pacs}ReferenceToken" minOccurs="0"/&gt;
 *         &lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/&gt;
 *         &lt;element name="Entity" type="{http://www.onvif.org/ver10/pacs}ReferenceToken"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessPointInfoBase", propOrder = {
    "name",
    "description",
    "areaFrom",
    "areaTo",
    "entityType",
    "entity"
})
@XmlSeeAlso({
    AccessPointInfo.class
})
public class AccessPointInfoBase
    extends DataEntity
{

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "AreaFrom")
    protected String areaFrom;
    @XmlElement(name = "AreaTo")
    protected String areaTo;
    @XmlElement(name = "EntityType")
    protected QName entityType;
    @XmlElement(name = "Entity", required = true)
    protected String entity;

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
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà areaFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaFrom() {
        return areaFrom;
    }

    /**
     * Imposta il valore della proprietà areaFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaFrom(String value) {
        this.areaFrom = value;
    }

    /**
     * Recupera il valore della proprietà areaTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaTo() {
        return areaTo;
    }

    /**
     * Imposta il valore della proprietà areaTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaTo(String value) {
        this.areaTo = value;
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

}
