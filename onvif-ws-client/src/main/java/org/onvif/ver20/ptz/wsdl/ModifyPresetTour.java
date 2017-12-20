
package org.onvif.ver20.ptz.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PresetTour;


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
 *         &lt;element name="ProfileToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="PresetTour" type="{http://www.onvif.org/ver10/schema}PresetTour"/&gt;
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
    "profileToken",
    "presetTour"
})
@XmlRootElement(name = "ModifyPresetTour")
public class ModifyPresetTour {

    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;
    @XmlElement(name = "PresetTour", required = true)
    protected PresetTour presetTour;

    /**
     * Recupera il valore della proprietà profileToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileToken() {
        return profileToken;
    }

    /**
     * Imposta il valore della proprietà profileToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileToken(String value) {
        this.profileToken = value;
    }

    /**
     * Recupera il valore della proprietà presetTour.
     * 
     * @return
     *     possible object is
     *     {@link PresetTour }
     *     
     */
    public PresetTour getPresetTour() {
        return presetTour;
    }

    /**
     * Imposta il valore della proprietà presetTour.
     * 
     * @param value
     *     allowed object is
     *     {@link PresetTour }
     *     
     */
    public void setPresetTour(PresetTour value) {
        this.presetTour = value;
    }

}
