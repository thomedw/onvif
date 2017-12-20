
package org.onvif.ver10.device.wsdl;

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
 *         &lt;element name="RebootNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "rebootNeeded"
})
@XmlRootElement(name = "SetNetworkInterfacesResponse")
public class SetNetworkInterfacesResponse {

    @XmlElement(name = "RebootNeeded")
    protected boolean rebootNeeded;

    /**
     * Recupera il valore della proprietà rebootNeeded.
     * This getter has been renamed from isRebootNeeded() to getRebootNeeded() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getRebootNeeded() {
        return rebootNeeded;
    }

    /**
     * Imposta il valore della proprietà rebootNeeded.
     * 
     */
    public void setRebootNeeded(boolean value) {
        this.rebootNeeded = value;
    }

}
