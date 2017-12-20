
package org.onvif.ver10.doorcontrol.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DoorTamperState.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DoorTamperState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="NotInTamper"/&gt;
 *     &lt;enumeration value="TamperDetected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DoorTamperState")
@XmlEnum
public enum DoorTamperState {


    /**
     * Value is currently not known.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * No tampering is detected.
     * 
     */
    @XmlEnumValue("NotInTamper")
    NOT_IN_TAMPER("NotInTamper"),

    /**
     * Tampering is detected.
     * 
     */
    @XmlEnumValue("TamperDetected")
    TAMPER_DETECTED("TamperDetected");
    private final String value;

    DoorTamperState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DoorTamperState fromValue(String v) {
        for (DoorTamperState c: DoorTamperState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
