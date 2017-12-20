
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DefoggingMode.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DefoggingMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OFF"/&gt;
 *     &lt;enumeration value="ON"/&gt;
 *     &lt;enumeration value="AUTO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DefoggingMode")
@XmlEnum
public enum DefoggingMode {

    OFF,
    ON,
    AUTO;

    public String value() {
        return name();
    }

    public static DefoggingMode fromValue(String v) {
        return valueOf(v);
    }

}
