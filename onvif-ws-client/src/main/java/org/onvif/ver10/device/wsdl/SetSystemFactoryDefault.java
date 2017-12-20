
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.FactoryDefaultType;


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
 *         &lt;element name="FactoryDefault" type="{http://www.onvif.org/ver10/schema}FactoryDefaultType"/&gt;
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
    "factoryDefault"
})
@XmlRootElement(name = "SetSystemFactoryDefault")
public class SetSystemFactoryDefault {

    @XmlElement(name = "FactoryDefault", required = true)
    @XmlSchemaType(name = "string")
    protected FactoryDefaultType factoryDefault;

    /**
     * Recupera il valore della proprietà factoryDefault.
     * 
     * @return
     *     possible object is
     *     {@link FactoryDefaultType }
     *     
     */
    public FactoryDefaultType getFactoryDefault() {
        return factoryDefault;
    }

    /**
     * Imposta il valore della proprietà factoryDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link FactoryDefaultType }
     *     
     */
    public void setFactoryDefault(FactoryDefaultType value) {
        this.factoryDefault = value;
    }

}
