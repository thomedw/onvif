
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Rectangle complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Rectangle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="bottom" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="top" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="right" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="left" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rectangle")
public class Rectangle {

    @XmlAttribute(name = "bottom")
    protected Float bottom;
    @XmlAttribute(name = "top")
    protected Float top;
    @XmlAttribute(name = "right")
    protected Float right;
    @XmlAttribute(name = "left")
    protected Float left;

    /**
     * Recupera il valore della proprietà bottom.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBottom() {
        return bottom;
    }

    /**
     * Imposta il valore della proprietà bottom.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBottom(Float value) {
        this.bottom = value;
    }

    /**
     * Recupera il valore della proprietà top.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTop() {
        return top;
    }

    /**
     * Imposta il valore della proprietà top.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTop(Float value) {
        this.top = value;
    }

    /**
     * Recupera il valore della proprietà right.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRight() {
        return right;
    }

    /**
     * Imposta il valore della proprietà right.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRight(Float value) {
        this.right = value;
    }

    /**
     * Recupera il valore della proprietà left.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLeft() {
        return left;
    }

    /**
     * Imposta il valore della proprietà left.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLeft(Float value) {
        this.left = value;
    }

}
