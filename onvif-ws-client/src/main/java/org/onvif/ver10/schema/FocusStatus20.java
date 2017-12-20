
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per FocusStatus20 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FocusStatus20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MoveStatus" type="{http://www.onvif.org/ver10/schema}MoveStatus"/&gt;
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}FocusStatus20Extension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FocusStatus20", propOrder = {
    "position",
    "moveStatus",
    "error",
    "extension"
})
public class FocusStatus20 {

    @XmlElement(name = "Position")
    protected float position;
    @XmlElement(name = "MoveStatus", required = true)
    @XmlSchemaType(name = "string")
    protected MoveStatus moveStatus;
    @XmlElement(name = "Error")
    protected String error;
    @XmlElement(name = "Extension")
    protected FocusStatus20Extension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà position.
     * 
     */
    public float getPosition() {
        return position;
    }

    /**
     * Imposta il valore della proprietà position.
     * 
     */
    public void setPosition(float value) {
        this.position = value;
    }

    /**
     * Recupera il valore della proprietà moveStatus.
     * 
     * @return
     *     possible object is
     *     {@link MoveStatus }
     *     
     */
    public MoveStatus getMoveStatus() {
        return moveStatus;
    }

    /**
     * Imposta il valore della proprietà moveStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link MoveStatus }
     *     
     */
    public void setMoveStatus(MoveStatus value) {
        this.moveStatus = value;
    }

    /**
     * Recupera il valore della proprietà error.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Imposta il valore della proprietà error.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link FocusStatus20Extension }
     *     
     */
    public FocusStatus20Extension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link FocusStatus20Extension }
     *     
     */
    public void setExtension(FocusStatus20Extension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
