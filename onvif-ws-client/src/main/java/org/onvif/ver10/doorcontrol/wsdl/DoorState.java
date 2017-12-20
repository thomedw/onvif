
package org.onvif.ver10.doorcontrol.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * 
 * The DoorState structure contains current aggregate runtime status of Door.
 * 
 * 
 * <p>Classe Java per DoorState complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DoorState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DoorPhysicalState" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}DoorPhysicalState" minOccurs="0"/&gt;
 *         &lt;element name="LockPhysicalState" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}LockPhysicalState" minOccurs="0"/&gt;
 *         &lt;element name="DoubleLockPhysicalState" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}LockPhysicalState" minOccurs="0"/&gt;
 *         &lt;element name="Alarm" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}DoorAlarmState" minOccurs="0"/&gt;
 *         &lt;element name="Tamper" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}DoorTamper" minOccurs="0"/&gt;
 *         &lt;element name="Fault" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}DoorFault" minOccurs="0"/&gt;
 *         &lt;element name="DoorMode" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}DoorMode"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DoorState", propOrder = {
    "doorPhysicalState",
    "lockPhysicalState",
    "doubleLockPhysicalState",
    "alarm",
    "tamper",
    "fault",
    "doorMode",
    "any"
})
public class DoorState {

    @XmlElement(name = "DoorPhysicalState")
    @XmlSchemaType(name = "string")
    protected DoorPhysicalState doorPhysicalState;
    @XmlElement(name = "LockPhysicalState")
    @XmlSchemaType(name = "string")
    protected LockPhysicalState lockPhysicalState;
    @XmlElement(name = "DoubleLockPhysicalState")
    @XmlSchemaType(name = "string")
    protected LockPhysicalState doubleLockPhysicalState;
    @XmlElement(name = "Alarm")
    @XmlSchemaType(name = "string")
    protected DoorAlarmState alarm;
    @XmlElement(name = "Tamper")
    protected DoorTamper tamper;
    @XmlElement(name = "Fault")
    protected DoorFault fault;
    @XmlElement(name = "DoorMode", required = true)
    @XmlSchemaType(name = "string")
    protected DoorMode doorMode;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà doorPhysicalState.
     * 
     * @return
     *     possible object is
     *     {@link DoorPhysicalState }
     *     
     */
    public DoorPhysicalState getDoorPhysicalState() {
        return doorPhysicalState;
    }

    /**
     * Imposta il valore della proprietà doorPhysicalState.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorPhysicalState }
     *     
     */
    public void setDoorPhysicalState(DoorPhysicalState value) {
        this.doorPhysicalState = value;
    }

    /**
     * Recupera il valore della proprietà lockPhysicalState.
     * 
     * @return
     *     possible object is
     *     {@link LockPhysicalState }
     *     
     */
    public LockPhysicalState getLockPhysicalState() {
        return lockPhysicalState;
    }

    /**
     * Imposta il valore della proprietà lockPhysicalState.
     * 
     * @param value
     *     allowed object is
     *     {@link LockPhysicalState }
     *     
     */
    public void setLockPhysicalState(LockPhysicalState value) {
        this.lockPhysicalState = value;
    }

    /**
     * Recupera il valore della proprietà doubleLockPhysicalState.
     * 
     * @return
     *     possible object is
     *     {@link LockPhysicalState }
     *     
     */
    public LockPhysicalState getDoubleLockPhysicalState() {
        return doubleLockPhysicalState;
    }

    /**
     * Imposta il valore della proprietà doubleLockPhysicalState.
     * 
     * @param value
     *     allowed object is
     *     {@link LockPhysicalState }
     *     
     */
    public void setDoubleLockPhysicalState(LockPhysicalState value) {
        this.doubleLockPhysicalState = value;
    }

    /**
     * Recupera il valore della proprietà alarm.
     * 
     * @return
     *     possible object is
     *     {@link DoorAlarmState }
     *     
     */
    public DoorAlarmState getAlarm() {
        return alarm;
    }

    /**
     * Imposta il valore della proprietà alarm.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorAlarmState }
     *     
     */
    public void setAlarm(DoorAlarmState value) {
        this.alarm = value;
    }

    /**
     * Recupera il valore della proprietà tamper.
     * 
     * @return
     *     possible object is
     *     {@link DoorTamper }
     *     
     */
    public DoorTamper getTamper() {
        return tamper;
    }

    /**
     * Imposta il valore della proprietà tamper.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorTamper }
     *     
     */
    public void setTamper(DoorTamper value) {
        this.tamper = value;
    }

    /**
     * Recupera il valore della proprietà fault.
     * 
     * @return
     *     possible object is
     *     {@link DoorFault }
     *     
     */
    public DoorFault getFault() {
        return fault;
    }

    /**
     * Imposta il valore della proprietà fault.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorFault }
     *     
     */
    public void setFault(DoorFault value) {
        this.fault = value;
    }

    /**
     * Recupera il valore della proprietà doorMode.
     * 
     * @return
     *     possible object is
     *     {@link DoorMode }
     *     
     */
    public DoorMode getDoorMode() {
        return doorMode;
    }

    /**
     * Imposta il valore della proprietà doorMode.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorMode }
     *     
     */
    public void setDoorMode(DoorMode value) {
        this.doorMode = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
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
