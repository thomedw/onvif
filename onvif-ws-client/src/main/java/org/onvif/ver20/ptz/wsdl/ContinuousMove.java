
package org.onvif.ver20.ptz.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.onvif.ver10.schema.PTZSpeed;


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
 *         &lt;element name="ProfileToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="Velocity" type="{http://www.onvif.org/ver10/schema}PTZSpeed"/&gt;
 *         &lt;element name="Timeout" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
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
    "profileToken",
    "velocity",
    "timeout"
})
@XmlRootElement(name = "ContinuousMove")
public class ContinuousMove {

    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;
    @XmlElement(name = "Velocity", required = true)
    protected PTZSpeed velocity;
    @XmlElement(name = "Timeout")
    protected Duration timeout;

    /**
     * Recupera il valore della proprietà profileToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileToken() {
        return profileToken;
    }

    /**
     * Imposta il valore della proprietà profileToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileToken(String value) {
        this.profileToken = value;
    }

    /**
     * Recupera il valore della proprietà velocity.
     * 
     * @return
     *     possible object is
     *     {@link PTZSpeed }
     *     
     */
    public PTZSpeed getVelocity() {
        return velocity;
    }

    /**
     * Imposta il valore della proprietà velocity.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpeed }
     *     
     */
    public void setVelocity(PTZSpeed value) {
        this.velocity = value;
    }

    /**
     * Recupera il valore della proprietà timeout.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeout() {
        return timeout;
    }

    /**
     * Imposta il valore della proprietà timeout.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeout(Duration value) {
        this.timeout = value;
    }

}
