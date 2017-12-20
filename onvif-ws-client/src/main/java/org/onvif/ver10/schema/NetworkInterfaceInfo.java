
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per NetworkInterfaceInfo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkInterfaceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HwAddress" type="{http://www.onvif.org/ver10/schema}HwAddress"/&gt;
 *         &lt;element name="MTU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterfaceInfo", propOrder = {
    "name",
    "hwAddress",
    "mtu"
})
public class NetworkInterfaceInfo {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "HwAddress", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String hwAddress;
    @XmlElement(name = "MTU")
    protected Integer mtu;

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà hwAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHwAddress() {
        return hwAddress;
    }

    /**
     * Imposta il valore della proprietà hwAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHwAddress(String value) {
        this.hwAddress = value;
    }

    /**
     * Recupera il valore della proprietà mtu.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTU() {
        return mtu;
    }

    /**
     * Imposta il valore della proprietà mtu.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTU(Integer value) {
        this.mtu = value;
    }

}
