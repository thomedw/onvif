
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per NetworkInterfaceConnectionSetting complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkInterfaceConnectionSetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoNegotiation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Duplex" type="{http://www.onvif.org/ver10/schema}Duplex"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterfaceConnectionSetting", propOrder = {
    "autoNegotiation",
    "speed",
    "duplex"
})
public class NetworkInterfaceConnectionSetting {

    @XmlElement(name = "AutoNegotiation")
    protected boolean autoNegotiation;
    @XmlElement(name = "Speed")
    protected int speed;
    @XmlElement(name = "Duplex", required = true)
    @XmlSchemaType(name = "string")
    protected Duplex duplex;

    /**
     * Recupera il valore della proprietà autoNegotiation.
     * This getter has been renamed from isAutoNegotiation() to getAutoNegotiation() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getAutoNegotiation() {
        return autoNegotiation;
    }

    /**
     * Imposta il valore della proprietà autoNegotiation.
     * 
     */
    public void setAutoNegotiation(boolean value) {
        this.autoNegotiation = value;
    }

    /**
     * Recupera il valore della proprietà speed.
     * 
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Imposta il valore della proprietà speed.
     * 
     */
    public void setSpeed(int value) {
        this.speed = value;
    }

    /**
     * Recupera il valore della proprietà duplex.
     * 
     * @return
     *     possible object is
     *     {@link Duplex }
     *     
     */
    public Duplex getDuplex() {
        return duplex;
    }

    /**
     * Imposta il valore della proprietà duplex.
     * 
     * @param value
     *     allowed object is
     *     {@link Duplex }
     *     
     */
    public void setDuplex(Duplex value) {
        this.duplex = value;
    }

}
