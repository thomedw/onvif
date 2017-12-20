
package org.onvif.ver10.search.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
    "searchToken"
})
@XmlRootElement(name = "FindRecordingsResponse")
public class FindRecordingsResponse {

    @XmlElement(name = "SearchToken", required = true)
    protected String searchToken;

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

}
