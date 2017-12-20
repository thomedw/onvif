
package org.onvif.ver10.accessrules.wsdl;

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
 *         &lt;element name="AccessProfile" type="{http://www.onvif.org/ver10/accessrules/wsdl}AccessProfile"/&gt;
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
    "accessProfile"
})
@XmlRootElement(name = "ModifyAccessProfile")
public class ModifyAccessProfile {

    @XmlElement(name = "AccessProfile", required = true)
    protected AccessProfile accessProfile;

    /**
     * Recupera il valore della proprietà accessProfile.
     * 
     * @return
     *     possible object is
     *     {@link AccessProfile }
     *     
     */
    public AccessProfile getAccessProfile() {
        return accessProfile;
    }

    /**
     * Imposta il valore della proprietà accessProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessProfile }
     *     
     */
    public void setAccessProfile(AccessProfile value) {
        this.accessProfile = value;
    }

}
