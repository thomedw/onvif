
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SystemLogUriList;
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
 *         &lt;element name="SystemLogUris" type="{http://www.onvif.org/ver10/schema}SystemLogUriList" minOccurs="0"/&gt;
 *         &lt;element name="SupportInfoUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="SystemBackupUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="Extension" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "systemLogUris",
    "supportInfoUri",
    "systemBackupUri",
    "extension"
})
@XmlRootElement(name = "GetSystemUrisResponse")
public class GetSystemUrisResponse {

    @XmlElement(name = "SystemLogUris")
    protected SystemLogUriList systemLogUris;
    @XmlElement(name = "SupportInfoUri")
    @XmlSchemaType(name = "anyURI")
    protected String supportInfoUri;
    @XmlElement(name = "SystemBackupUri")
    @XmlSchemaType(name = "anyURI")
    protected String systemBackupUri;
    @XmlElement(name = "Extension")
    protected GetSystemUrisResponse.Extension extension;

    /**
     * Recupera il valore della proprietà systemLogUris.
     * 
     * @return
     *     possible object is
     *     {@link SystemLogUriList }
     *     
     */
    public SystemLogUriList getSystemLogUris() {
        return systemLogUris;
    }

    /**
     * Imposta il valore della proprietà systemLogUris.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemLogUriList }
     *     
     */
    public void setSystemLogUris(SystemLogUriList value) {
        this.systemLogUris = value;
    }

    /**
     * Recupera il valore della proprietà supportInfoUri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportInfoUri() {
        return supportInfoUri;
    }

    /**
     * Imposta il valore della proprietà supportInfoUri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportInfoUri(String value) {
        this.supportInfoUri = value;
    }

    /**
     * Recupera il valore della proprietà systemBackupUri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemBackupUri() {
        return systemBackupUri;
    }

    /**
     * Imposta il valore della proprietà systemBackupUri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemBackupUri(String value) {
        this.systemBackupUri = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link GetSystemUrisResponse.Extension }
     *     
     */
    public GetSystemUrisResponse.Extension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSystemUrisResponse.Extension }
     *     
     */
    public void setExtension(GetSystemUrisResponse.Extension value) {
        this.extension = value;
    }


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
     *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "any"
    })
    public static class Extension {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
