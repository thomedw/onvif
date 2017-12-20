
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SystemLogType;


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
 *         &lt;element name="LogType" type="{http://www.onvif.org/ver10/schema}SystemLogType"/&gt;
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
    "logType"
})
@XmlRootElement(name = "GetSystemLog")
public class GetSystemLog {

    @XmlElement(name = "LogType", required = true)
    @XmlSchemaType(name = "string")
    protected SystemLogType logType;

    /**
     * Recupera il valore della proprietà logType.
     * 
     * @return
     *     possible object is
     *     {@link SystemLogType }
     *     
     */
    public SystemLogType getLogType() {
        return logType;
    }

    /**
     * Imposta il valore della proprietà logType.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemLogType }
     *     
     */
    public void setLogType(SystemLogType value) {
        this.logType = value;
    }

}
