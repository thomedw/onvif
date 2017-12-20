
package org.onvif.ver10.search.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.onvif.ver10.schema.MetadataFilter;
import org.onvif.ver10.schema.SearchScope;


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
 *         &lt;element name="StartPoint" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndPoint" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Scope" type="{http://www.onvif.org/ver10/schema}SearchScope"/&gt;
 *         &lt;element name="MetadataFilter" type="{http://www.onvif.org/ver10/schema}MetadataFilter"/&gt;
 *         &lt;element name="MaxMatches" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="KeepAliveTime" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
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
    "startPoint",
    "endPoint",
    "scope",
    "metadataFilter",
    "maxMatches",
    "keepAliveTime"
})
@XmlRootElement(name = "FindMetadata")
public class FindMetadata {

    @XmlElement(name = "StartPoint", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startPoint;
    @XmlElement(name = "EndPoint")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endPoint;
    @XmlElement(name = "Scope", required = true)
    protected SearchScope scope;
    @XmlElement(name = "MetadataFilter", required = true)
    protected MetadataFilter metadataFilter;
    @XmlElement(name = "MaxMatches")
    protected Integer maxMatches;
    @XmlElement(name = "KeepAliveTime", required = true)
    protected Duration keepAliveTime;

    /**
     * Recupera il valore della proprietà startPoint.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartPoint() {
        return startPoint;
    }

    /**
     * Imposta il valore della proprietà startPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartPoint(XMLGregorianCalendar value) {
        this.startPoint = value;
    }

    /**
     * Recupera il valore della proprietà endPoint.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndPoint() {
        return endPoint;
    }

    /**
     * Imposta il valore della proprietà endPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndPoint(XMLGregorianCalendar value) {
        this.endPoint = value;
    }

    /**
     * Recupera il valore della proprietà scope.
     * 
     * @return
     *     possible object is
     *     {@link SearchScope }
     *     
     */
    public SearchScope getScope() {
        return scope;
    }

    /**
     * Imposta il valore della proprietà scope.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchScope }
     *     
     */
    public void setScope(SearchScope value) {
        this.scope = value;
    }

    /**
     * Recupera il valore della proprietà metadataFilter.
     * 
     * @return
     *     possible object is
     *     {@link MetadataFilter }
     *     
     */
    public MetadataFilter getMetadataFilter() {
        return metadataFilter;
    }

    /**
     * Imposta il valore della proprietà metadataFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataFilter }
     *     
     */
    public void setMetadataFilter(MetadataFilter value) {
        this.metadataFilter = value;
    }

    /**
     * Recupera il valore della proprietà maxMatches.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxMatches() {
        return maxMatches;
    }

    /**
     * Imposta il valore della proprietà maxMatches.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxMatches(Integer value) {
        this.maxMatches = value;
    }

    /**
     * Recupera il valore della proprietà keepAliveTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getKeepAliveTime() {
        return keepAliveTime;
    }

    /**
     * Imposta il valore della proprietà keepAliveTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setKeepAliveTime(Duration value) {
        this.keepAliveTime = value;
    }

}
