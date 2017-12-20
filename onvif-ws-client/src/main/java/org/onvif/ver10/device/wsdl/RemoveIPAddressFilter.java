
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.IPAddressFilter;


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
 *         &lt;element name="IPAddressFilter" type="{http://www.onvif.org/ver10/schema}IPAddressFilter"/&gt;
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
    "ipAddressFilter"
})
@XmlRootElement(name = "RemoveIPAddressFilter")
public class RemoveIPAddressFilter {

    @XmlElement(name = "IPAddressFilter", required = true)
    protected IPAddressFilter ipAddressFilter;

    /**
     * Recupera il valore della proprietà ipAddressFilter.
     * 
     * @return
     *     possible object is
     *     {@link IPAddressFilter }
     *     
     */
    public IPAddressFilter getIPAddressFilter() {
        return ipAddressFilter;
    }

    /**
     * Imposta il valore della proprietà ipAddressFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link IPAddressFilter }
     *     
     */
    public void setIPAddressFilter(IPAddressFilter value) {
        this.ipAddressFilter = value;
    }

}
