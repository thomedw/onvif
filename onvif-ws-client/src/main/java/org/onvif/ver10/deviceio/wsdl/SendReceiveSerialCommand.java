
package org.onvif.ver10.deviceio.wsdl;

import java.math.BigInteger;
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
 *         &lt;element name="SerialData" type="{http://www.onvif.org/ver10/deviceIO/wsdl}SerialData" minOccurs="0"/&gt;
 *         &lt;element name="TimeOut" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="DataLength" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Delimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "serialData",
    "timeOut",
    "dataLength",
    "delimiter"
})
@XmlRootElement(name = "SendReceiveSerialCommand")
public class SendReceiveSerialCommand {

    @XmlElement(name = "SerialData")
    protected SerialData serialData;
    @XmlElement(name = "TimeOut")
    protected Duration timeOut;
    @XmlElement(name = "DataLength")
    protected BigInteger dataLength;
    @XmlElement(name = "Delimiter")
    protected String delimiter;

    /**
     * Recupera il valore della proprietà serialData.
     * 
     * @return
     *     possible object is
     *     {@link SerialData }
     *     
     */
    public SerialData getSerialData() {
        return serialData;
    }

    /**
     * Imposta il valore della proprietà serialData.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialData }
     *     
     */
    public void setSerialData(SerialData value) {
        this.serialData = value;
    }

    /**
     * Recupera il valore della proprietà timeOut.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeOut() {
        return timeOut;
    }

    /**
     * Imposta il valore della proprietà timeOut.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeOut(Duration value) {
        this.timeOut = value;
    }

    /**
     * Recupera il valore della proprietà dataLength.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDataLength() {
        return dataLength;
    }

    /**
     * Imposta il valore della proprietà dataLength.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDataLength(BigInteger value) {
        this.dataLength = value;
    }

    /**
     * Recupera il valore della proprietà delimiter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Imposta il valore della proprietà delimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

}
