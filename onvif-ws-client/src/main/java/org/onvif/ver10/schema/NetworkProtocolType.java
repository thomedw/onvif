
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per NetworkProtocolType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkProtocolType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HTTP"/&gt;
 *     &lt;enumeration value="HTTPS"/&gt;
 *     &lt;enumeration value="RTSP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetworkProtocolType")
@XmlEnum
public enum NetworkProtocolType {

    HTTP,
    HTTPS,
    RTSP;

    public String value() {
        return name();
    }

    public static NetworkProtocolType fromValue(String v) {
        return valueOf(v);
    }

}
