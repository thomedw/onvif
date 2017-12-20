
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Scope complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Scope"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScopeDef" type="{http://www.onvif.org/ver10/schema}ScopeDefinition"/&gt;
 *         &lt;element name="ScopeItem" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scope", propOrder = {
    "scopeDef",
    "scopeItem"
})
public class Scope {

    @XmlElement(name = "ScopeDef", required = true)
    @XmlSchemaType(name = "string")
    protected ScopeDefinition scopeDef;
    @XmlElement(name = "ScopeItem", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String scopeItem;

    /**
     * Recupera il valore della proprietà scopeDef.
     * 
     * @return
     *     possible object is
     *     {@link ScopeDefinition }
     *     
     */
    public ScopeDefinition getScopeDef() {
        return scopeDef;
    }

    /**
     * Imposta il valore della proprietà scopeDef.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeDefinition }
     *     
     */
    public void setScopeDef(ScopeDefinition value) {
        this.scopeDef = value;
    }

    /**
     * Recupera il valore della proprietà scopeItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeItem() {
        return scopeItem;
    }

    /**
     * Imposta il valore della proprietà scopeItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeItem(String value) {
        this.scopeItem = value;
    }

}
