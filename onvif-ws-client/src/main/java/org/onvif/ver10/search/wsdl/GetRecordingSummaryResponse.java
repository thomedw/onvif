
package org.onvif.ver10.search.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.RecordingSummary;


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
 *         &lt;element name="Summary" type="{http://www.onvif.org/ver10/schema}RecordingSummary"/&gt;
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
    "summary"
})
@XmlRootElement(name = "GetRecordingSummaryResponse")
public class GetRecordingSummaryResponse {

    @XmlElement(name = "Summary", required = true)
    protected RecordingSummary summary;

    /**
     * Recupera il valore della proprietà summary.
     * 
     * @return
     *     possible object is
     *     {@link RecordingSummary }
     *     
     */
    public RecordingSummary getSummary() {
        return summary;
    }

    /**
     * Imposta il valore della proprietà summary.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingSummary }
     *     
     */
    public void setSummary(RecordingSummary value) {
        this.summary = value;
    }

}
