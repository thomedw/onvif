
package org.onvif.ver10.recording.wsdl;

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
 *         &lt;element name="OperationToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
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
    "operationToken"
})
@XmlRootElement(name = "StopExportRecordedData")
public class StopExportRecordedData {

    @XmlElement(name = "OperationToken", required = true)
    protected String operationToken;

    /**
     * Recupera il valore della proprietà operationToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationToken() {
        return operationToken;
    }

    /**
     * Imposta il valore della proprietà operationToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationToken(String value) {
        this.operationToken = value;
    }

}
