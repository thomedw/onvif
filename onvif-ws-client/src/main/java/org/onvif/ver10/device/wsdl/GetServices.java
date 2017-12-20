
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
 *         &lt;element name="IncludeCapability" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "includeCapability"
})
@XmlRootElement(name = "GetServices")
public class GetServices {

    @XmlElement(name = "IncludeCapability")
    protected boolean includeCapability;

    /**
     * Recupera il valore della proprietà includeCapability.
     * This getter has been renamed from isIncludeCapability() to getIncludeCapability() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getIncludeCapability() {
        return includeCapability;
    }

    /**
     * Imposta il valore della proprietà includeCapability.
     * 
     */
    public void setIncludeCapability(boolean value) {
        this.includeCapability = value;
    }

}
