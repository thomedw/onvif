
package org.onvif.ver10.accesscontrol.wsdl;

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
 *         &lt;element name="AccessPointState" type="{http://www.onvif.org/ver10/accesscontrol/wsdl}AccessPointState"/&gt;
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
    "accessPointState"
})
@XmlRootElement(name = "GetAccessPointStateResponse")
public class GetAccessPointStateResponse {

    @XmlElement(name = "AccessPointState", required = true)
    protected AccessPointState accessPointState;

    /**
     * Recupera il valore della proprietà accessPointState.
     * 
     * @return
     *     possible object is
     *     {@link AccessPointState }
     *     
     */
    public AccessPointState getAccessPointState() {
        return accessPointState;
    }

    /**
     * Imposta il valore della proprietà accessPointState.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessPointState }
     *     
     */
    public void setAccessPointState(AccessPointState value) {
        this.accessPointState = value;
    }

}
