
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per VideoResolution complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VideoResolution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoResolution", propOrder = {
    "width",
    "height"
})
public class VideoResolution {

    @XmlElement(name = "Width")
    protected int width;
    @XmlElement(name = "Height")
    protected int height;

    /**
     * Recupera il valore della proprietà width.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Imposta il valore della proprietà width.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Recupera il valore della proprietà height.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Imposta il valore della proprietà height.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

}
