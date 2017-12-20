
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RelayMode.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RelayMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Monostable"/&gt;
 *     &lt;enumeration value="Bistable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelayMode")
@XmlEnum
public enum RelayMode {

    @XmlEnumValue("Monostable")
    MONOSTABLE("Monostable"),
    @XmlEnumValue("Bistable")
    BISTABLE("Bistable");
    private final String value;

    RelayMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelayMode fromValue(String v) {
        for (RelayMode c: RelayMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
