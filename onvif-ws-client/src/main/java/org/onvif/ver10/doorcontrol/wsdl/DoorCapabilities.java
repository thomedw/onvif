
package org.onvif.ver10.doorcontrol.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * 
 * DoorCapabilities reflect optional functionality of a particular physical entity.
 * Different door instances may have different set of capabilities.
 * This information may change during device operation, e.g. if hardware settings are changed.
 * The following capabilities are available:
 * 
 * 
 * <p>Classe Java per DoorCapabilities complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DoorCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Access" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AccessTimingOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Lock" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Unlock" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Block" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DoubleLock" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LockDown" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LockOpen" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DoorMonitor" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LockMonitor" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DoubleLockMonitor" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Alarm" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Tamper" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Fault" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoorCapabilities", propOrder = {
    "any"
})
public class DoorCapabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Access")
    protected Boolean access;
    @XmlAttribute(name = "AccessTimingOverride")
    protected Boolean accessTimingOverride;
    @XmlAttribute(name = "Lock")
    protected Boolean lock;
    @XmlAttribute(name = "Unlock")
    protected Boolean unlock;
    @XmlAttribute(name = "Block")
    protected Boolean block;
    @XmlAttribute(name = "DoubleLock")
    protected Boolean doubleLock;
    @XmlAttribute(name = "LockDown")
    protected Boolean lockDown;
    @XmlAttribute(name = "LockOpen")
    protected Boolean lockOpen;
    @XmlAttribute(name = "DoorMonitor")
    protected Boolean doorMonitor;
    @XmlAttribute(name = "LockMonitor")
    protected Boolean lockMonitor;
    @XmlAttribute(name = "DoubleLockMonitor")
    protected Boolean doubleLockMonitor;
    @XmlAttribute(name = "Alarm")
    protected Boolean alarm;
    @XmlAttribute(name = "Tamper")
    protected Boolean tamper;
    @XmlAttribute(name = "Fault")
    protected Boolean fault;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Recupera il valore della proprietà access.
     * This getter has been renamed from isAccess() to getAccess() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAccess() {
        return access;
    }

    /**
     * Imposta il valore della proprietà access.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccess(Boolean value) {
        this.access = value;
    }

    /**
     * Recupera il valore della proprietà accessTimingOverride.
     * This getter has been renamed from isAccessTimingOverride() to getAccessTimingOverride() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAccessTimingOverride() {
        return accessTimingOverride;
    }

    /**
     * Imposta il valore della proprietà accessTimingOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessTimingOverride(Boolean value) {
        this.accessTimingOverride = value;
    }

    /**
     * Recupera il valore della proprietà lock.
     * This getter has been renamed from isLock() to getLock() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLock() {
        return lock;
    }

    /**
     * Imposta il valore della proprietà lock.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLock(Boolean value) {
        this.lock = value;
    }

    /**
     * Recupera il valore della proprietà unlock.
     * This getter has been renamed from isUnlock() to getUnlock() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUnlock() {
        return unlock;
    }

    /**
     * Imposta il valore della proprietà unlock.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnlock(Boolean value) {
        this.unlock = value;
    }

    /**
     * Recupera il valore della proprietà block.
     * This getter has been renamed from isBlock() to getBlock() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBlock() {
        return block;
    }

    /**
     * Imposta il valore della proprietà block.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlock(Boolean value) {
        this.block = value;
    }

    /**
     * Recupera il valore della proprietà doubleLock.
     * This getter has been renamed from isDoubleLock() to getDoubleLock() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDoubleLock() {
        return doubleLock;
    }

    /**
     * Imposta il valore della proprietà doubleLock.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoubleLock(Boolean value) {
        this.doubleLock = value;
    }

    /**
     * Recupera il valore della proprietà lockDown.
     * This getter has been renamed from isLockDown() to getLockDown() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLockDown() {
        return lockDown;
    }

    /**
     * Imposta il valore della proprietà lockDown.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockDown(Boolean value) {
        this.lockDown = value;
    }

    /**
     * Recupera il valore della proprietà lockOpen.
     * This getter has been renamed from isLockOpen() to getLockOpen() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLockOpen() {
        return lockOpen;
    }

    /**
     * Imposta il valore della proprietà lockOpen.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockOpen(Boolean value) {
        this.lockOpen = value;
    }

    /**
     * Recupera il valore della proprietà doorMonitor.
     * This getter has been renamed from isDoorMonitor() to getDoorMonitor() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDoorMonitor() {
        return doorMonitor;
    }

    /**
     * Imposta il valore della proprietà doorMonitor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoorMonitor(Boolean value) {
        this.doorMonitor = value;
    }

    /**
     * Recupera il valore della proprietà lockMonitor.
     * This getter has been renamed from isLockMonitor() to getLockMonitor() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLockMonitor() {
        return lockMonitor;
    }

    /**
     * Imposta il valore della proprietà lockMonitor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockMonitor(Boolean value) {
        this.lockMonitor = value;
    }

    /**
     * Recupera il valore della proprietà doubleLockMonitor.
     * This getter has been renamed from isDoubleLockMonitor() to getDoubleLockMonitor() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDoubleLockMonitor() {
        return doubleLockMonitor;
    }

    /**
     * Imposta il valore della proprietà doubleLockMonitor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoubleLockMonitor(Boolean value) {
        this.doubleLockMonitor = value;
    }

    /**
     * Recupera il valore della proprietà alarm.
     * This getter has been renamed from isAlarm() to getAlarm() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAlarm() {
        return alarm;
    }

    /**
     * Imposta il valore della proprietà alarm.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlarm(Boolean value) {
        this.alarm = value;
    }

    /**
     * Recupera il valore della proprietà tamper.
     * This getter has been renamed from isTamper() to getTamper() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTamper() {
        return tamper;
    }

    /**
     * Imposta il valore della proprietà tamper.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTamper(Boolean value) {
        this.tamper = value;
    }

    /**
     * Recupera il valore della proprietà fault.
     * This getter has been renamed from isFault() to getFault() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFault() {
        return fault;
    }

    /**
     * Imposta il valore della proprietà fault.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFault(Boolean value) {
        this.fault = value;
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
