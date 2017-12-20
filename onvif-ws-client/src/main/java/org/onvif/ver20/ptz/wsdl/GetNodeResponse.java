
package org.onvif.ver20.ptz.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PTZNode;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PTZNode" type="{http://www.onvif.org/ver10/schema}PTZNode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ptzNode"
})
@XmlRootElement(name = "GetNodeResponse")
public class GetNodeResponse {

    @XmlElement(name = "PTZNode", required = true)
    protected PTZNode ptzNode;

    /**
     * Recupera il valore della proprietà ptzNode.
     * 
     * @return
     *     possible object is
     *     {@link PTZNode }
     *     
     */
    public PTZNode getPTZNode() {
        return ptzNode;
    }

    /**
     * Imposta il valore della proprietà ptzNode.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZNode }
     *     
     */
    public void setPTZNode(PTZNode value) {
        this.ptzNode = value;
    }

}
