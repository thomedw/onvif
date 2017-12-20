
package org.onvif.ver10.recording.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.ArrayOfFileProgress;
import org.w3c.dom.Element;


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
 *         &lt;element name="Progress" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="FileProgressStatus" type="{http://www.onvif.org/ver10/schema}ArrayOfFileProgress"/&gt;
 *         &lt;any processContents='lax'/&gt;
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
    "progress",
    "fileProgressStatus",
    "any"
})
@XmlRootElement(name = "GetExportRecordedDataStateResponse")
public class GetExportRecordedDataStateResponse {

    @XmlElement(name = "Progress")
    protected float progress;
    @XmlElement(name = "FileProgressStatus", required = true)
    protected ArrayOfFileProgress fileProgressStatus;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Recupera il valore della proprietà progress.
     * 
     */
    public float getProgress() {
        return progress;
    }

    /**
     * Imposta il valore della proprietà progress.
     * 
     */
    public void setProgress(float value) {
        this.progress = value;
    }

    /**
     * Recupera il valore della proprietà fileProgressStatus.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFileProgress }
     *     
     */
    public ArrayOfFileProgress getFileProgressStatus() {
        return fileProgressStatus;
    }

    /**
     * Imposta il valore della proprietà fileProgressStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFileProgress }
     *     
     */
    public void setFileProgressStatus(ArrayOfFileProgress value) {
        this.fileProgressStatus = value;
    }

    /**
     * Recupera il valore della proprietà any.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Imposta il valore della proprietà any.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
