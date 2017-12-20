
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SecurityCapabilitiesExtension complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SecurityCapabilitiesExtension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TLS1.0" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}SecurityCapabilitiesExtension2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCapabilitiesExtension", propOrder = {
    "tls10",
    "extension"
})
public class SecurityCapabilitiesExtension {

    @XmlElement(name = "TLS1.0")
    protected boolean tls10;
    @XmlElement(name = "Extension")
    protected SecurityCapabilitiesExtension2 extension;

    /**
     * Recupera il valore della proprietà tls10.
     * This getter has been renamed from isTLS10() to getTLS10() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getTLS10() {
        return tls10;
    }

    /**
     * Imposta il valore della proprietà tls10.
     * 
     */
    public void setTLS10(boolean value) {
        this.tls10 = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCapabilitiesExtension2 }
     *     
     */
    public SecurityCapabilitiesExtension2 getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCapabilitiesExtension2 }
     *     
     */
    public void setExtension(SecurityCapabilitiesExtension2 value) {
        this.extension = value;
    }

}
