
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
 *         &lt;element name="FromDHCP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "fromDHCP"
})
@XmlRootElement(name = "SetHostnameFromDHCP")
public class SetHostnameFromDHCP {

    @XmlElement(name = "FromDHCP")
    protected boolean fromDHCP;

    /**
     * Recupera il valore della proprietà fromDHCP.
     * This getter has been renamed from isFromDHCP() to getFromDHCP() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getFromDHCP() {
        return fromDHCP;
    }

    /**
     * Imposta il valore della proprietà fromDHCP.
     * 
     */
    public void setFromDHCP(boolean value) {
        this.fromDHCP = value;
    }

}
