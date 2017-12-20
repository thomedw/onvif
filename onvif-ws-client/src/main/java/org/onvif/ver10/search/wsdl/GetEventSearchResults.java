
package org.onvif.ver10.search.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


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
 *         &lt;element name="SearchToken" type="{http://www.onvif.org/ver10/schema}JobToken"/&gt;
 *         &lt;element name="MinResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WaitTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
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
    "searchToken",
    "minResults",
    "maxResults",
    "waitTime"
})
@XmlRootElement(name = "GetEventSearchResults")
public class GetEventSearchResults {

    @XmlElement(name = "SearchToken", required = true)
    protected String searchToken;
    @XmlElement(name = "MinResults")
    protected Integer minResults;
    @XmlElement(name = "MaxResults")
    protected Integer maxResults;
    @XmlElement(name = "WaitTime")
    protected Duration waitTime;

    /**
     * Recupera il valore della proprietà searchToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchToken() {
        return searchToken;
    }

    /**
     * Imposta il valore della proprietà searchToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchToken(String value) {
        this.searchToken = value;
    }

    /**
     * Recupera il valore della proprietà minResults.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinResults() {
        return minResults;
    }

    /**
     * Imposta il valore della proprietà minResults.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinResults(Integer value) {
        this.minResults = value;
    }

    /**
     * Recupera il valore della proprietà maxResults.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Imposta il valore della proprietà maxResults.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * Recupera il valore della proprietà waitTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getWaitTime() {
        return waitTime;
    }

    /**
     * Imposta il valore della proprietà waitTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setWaitTime(Duration value) {
        this.waitTime = value;
    }

}
