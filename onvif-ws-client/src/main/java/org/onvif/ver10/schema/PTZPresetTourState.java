
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PTZPresetTourState.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PTZPresetTourState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Idle"/&gt;
 *     &lt;enumeration value="Touring"/&gt;
 *     &lt;enumeration value="Paused"/&gt;
 *     &lt;enumeration value="Extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PTZPresetTourState")
@XmlEnum
public enum PTZPresetTourState {

    @XmlEnumValue("Idle")
    IDLE("Idle"),
    @XmlEnumValue("Touring")
    TOURING("Touring"),
    @XmlEnumValue("Paused")
    PAUSED("Paused"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    PTZPresetTourState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PTZPresetTourState fromValue(String v) {
        for (PTZPresetTourState c: PTZPresetTourState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
