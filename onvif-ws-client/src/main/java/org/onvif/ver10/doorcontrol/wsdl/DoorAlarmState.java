
package org.onvif.ver10.doorcontrol.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DoorAlarmState.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DoorAlarmState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="DoorForcedOpen"/&gt;
 *     &lt;enumeration value="DoorOpenTooLong"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DoorAlarmState")
@XmlEnum
public enum DoorAlarmState {


    /**
     * No alarm.
     * 
     */
    @XmlEnumValue("Normal")
    NORMAL("Normal"),

    /**
     * Door is forced open.
     * 
     */
    @XmlEnumValue("DoorForcedOpen")
    DOOR_FORCED_OPEN("DoorForcedOpen"),

    /**
     * Door is held open too long.
     * 
     */
    @XmlEnumValue("DoorOpenTooLong")
    DOOR_OPEN_TOO_LONG("DoorOpenTooLong");
    private final String value;

    DoorAlarmState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DoorAlarmState fromValue(String v) {
        for (DoorAlarmState c: DoorAlarmState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
