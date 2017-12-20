
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type describing whether WDR mode is enabled or disabled (on/off).
 * 
 * <p>Classe Java per WideDynamicRange20 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WideDynamicRange20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}WideDynamicMode"/&gt;
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WideDynamicRange20", propOrder = {
    "mode",
    "level"
})
public class WideDynamicRange20 {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected WideDynamicMode mode;
    @XmlElement(name = "Level")
    protected Float level;

    /**
     * Recupera il valore della proprietà mode.
     * 
     * @return
     *     possible object is
     *     {@link WideDynamicMode }
     *     
     */
    public WideDynamicMode getMode() {
        return mode;
    }

    /**
     * Imposta il valore della proprietà mode.
     * 
     * @param value
     *     allowed object is
     *     {@link WideDynamicMode }
     *     
     */
    public void setMode(WideDynamicMode value) {
        this.mode = value;
    }

    /**
     * Recupera il valore della proprietà level.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLevel() {
        return level;
    }

    /**
     * Imposta il valore della proprietà level.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLevel(Float value) {
        this.level = value;
    }

}
