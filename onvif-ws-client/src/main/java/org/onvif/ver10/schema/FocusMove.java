
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FocusMove complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FocusMove"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Absolute" type="{http://www.onvif.org/ver10/schema}AbsoluteFocus" minOccurs="0"/&gt;
 *         &lt;element name="Relative" type="{http://www.onvif.org/ver10/schema}RelativeFocus" minOccurs="0"/&gt;
 *         &lt;element name="Continuous" type="{http://www.onvif.org/ver10/schema}ContinuousFocus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FocusMove", propOrder = {
    "absolute",
    "relative",
    "continuous"
})
public class FocusMove {

    @XmlElement(name = "Absolute")
    protected AbsoluteFocus absolute;
    @XmlElement(name = "Relative")
    protected RelativeFocus relative;
    @XmlElement(name = "Continuous")
    protected ContinuousFocus continuous;

    /**
     * Recupera il valore della proprietà absolute.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteFocus }
     *     
     */
    public AbsoluteFocus getAbsolute() {
        return absolute;
    }

    /**
     * Imposta il valore della proprietà absolute.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteFocus }
     *     
     */
    public void setAbsolute(AbsoluteFocus value) {
        this.absolute = value;
    }

    /**
     * Recupera il valore della proprietà relative.
     * 
     * @return
     *     possible object is
     *     {@link RelativeFocus }
     *     
     */
    public RelativeFocus getRelative() {
        return relative;
    }

    /**
     * Imposta il valore della proprietà relative.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeFocus }
     *     
     */
    public void setRelative(RelativeFocus value) {
        this.relative = value;
    }

    /**
     * Recupera il valore della proprietà continuous.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousFocus }
     *     
     */
    public ContinuousFocus getContinuous() {
        return continuous;
    }

    /**
     * Imposta il valore della proprietà continuous.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousFocus }
     *     
     */
    public void setContinuous(ContinuousFocus value) {
        this.continuous = value;
    }

}
