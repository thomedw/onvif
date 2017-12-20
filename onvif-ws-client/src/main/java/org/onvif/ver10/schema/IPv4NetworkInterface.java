
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IPv4NetworkInterface complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IPv4NetworkInterface"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Config" type="{http://www.onvif.org/ver10/schema}IPv4Configuration"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPv4NetworkInterface", propOrder = {
    "enabled",
    "config"
})
public class IPv4NetworkInterface {

    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlElement(name = "Config", required = true)
    protected IPv4Configuration config;

    /**
     * Recupera il valore della proprietà enabled.
     * This getter has been renamed from isEnabled() to getEnabled() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getEnabled() {
        return enabled;
    }

    /**
     * Imposta il valore della proprietà enabled.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Recupera il valore della proprietà config.
     * 
     * @return
     *     possible object is
     *     {@link IPv4Configuration }
     *     
     */
    public IPv4Configuration getConfig() {
        return config;
    }

    /**
     * Imposta il valore della proprietà config.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv4Configuration }
     *     
     */
    public void setConfig(IPv4Configuration value) {
        this.config = value;
    }

}
