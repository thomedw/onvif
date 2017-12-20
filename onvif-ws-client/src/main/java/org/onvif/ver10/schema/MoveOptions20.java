
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MoveOptions20 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MoveOptions20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Absolute" type="{http://www.onvif.org/ver10/schema}AbsoluteFocusOptions" minOccurs="0"/&gt;
 *         &lt;element name="Relative" type="{http://www.onvif.org/ver10/schema}RelativeFocusOptions20" minOccurs="0"/&gt;
 *         &lt;element name="Continuous" type="{http://www.onvif.org/ver10/schema}ContinuousFocusOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveOptions20", propOrder = {
    "absolute",
    "relative",
    "continuous"
})
public class MoveOptions20 {

    @XmlElement(name = "Absolute")
    protected AbsoluteFocusOptions absolute;
    @XmlElement(name = "Relative")
    protected RelativeFocusOptions20 relative;
    @XmlElement(name = "Continuous")
    protected ContinuousFocusOptions continuous;

    /**
     * Recupera il valore della proprietà absolute.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteFocusOptions }
     *     
     */
    public AbsoluteFocusOptions getAbsolute() {
        return absolute;
    }

    /**
     * Imposta il valore della proprietà absolute.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteFocusOptions }
     *     
     */
    public void setAbsolute(AbsoluteFocusOptions value) {
        this.absolute = value;
    }

    /**
     * Recupera il valore della proprietà relative.
     * 
     * @return
     *     possible object is
     *     {@link RelativeFocusOptions20 }
     *     
     */
    public RelativeFocusOptions20 getRelative() {
        return relative;
    }

    /**
     * Imposta il valore della proprietà relative.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeFocusOptions20 }
     *     
     */
    public void setRelative(RelativeFocusOptions20 value) {
        this.relative = value;
    }

    /**
     * Recupera il valore della proprietà continuous.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousFocusOptions }
     *     
     */
    public ContinuousFocusOptions getContinuous() {
        return continuous;
    }

    /**
     * Imposta il valore della proprietà continuous.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousFocusOptions }
     *     
     */
    public void setContinuous(ContinuousFocusOptions value) {
        this.continuous = value;
    }

}
