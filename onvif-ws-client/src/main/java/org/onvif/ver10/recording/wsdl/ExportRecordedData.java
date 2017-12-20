
package org.onvif.ver10.recording.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SearchScope;
import org.onvif.ver10.schema.StorageReferencePath;


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
 *         &lt;element name="SearchScope" type="{http://www.onvif.org/ver10/schema}SearchScope"/&gt;
 *         &lt;element name="FileFormat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StorageDestination" type="{http://www.onvif.org/ver10/schema}StorageReferencePath"/&gt;
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
    "searchScope",
    "fileFormat",
    "storageDestination"
})
@XmlRootElement(name = "ExportRecordedData")
public class ExportRecordedData {

    @XmlElement(name = "SearchScope", required = true)
    protected SearchScope searchScope;
    @XmlElement(name = "FileFormat", required = true)
    protected String fileFormat;
    @XmlElement(name = "StorageDestination", required = true)
    protected StorageReferencePath storageDestination;

    /**
     * Recupera il valore della proprietà searchScope.
     * 
     * @return
     *     possible object is
     *     {@link SearchScope }
     *     
     */
    public SearchScope getSearchScope() {
        return searchScope;
    }

    /**
     * Imposta il valore della proprietà searchScope.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchScope }
     *     
     */
    public void setSearchScope(SearchScope value) {
        this.searchScope = value;
    }

    /**
     * Recupera il valore della proprietà fileFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileFormat() {
        return fileFormat;
    }

    /**
     * Imposta il valore della proprietà fileFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileFormat(String value) {
        this.fileFormat = value;
    }

    /**
     * Recupera il valore della proprietà storageDestination.
     * 
     * @return
     *     possible object is
     *     {@link StorageReferencePath }
     *     
     */
    public StorageReferencePath getStorageDestination() {
        return storageDestination;
    }

    /**
     * Imposta il valore della proprietà storageDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageReferencePath }
     *     
     */
    public void setStorageDestination(StorageReferencePath value) {
        this.storageDestination = value;
    }

}
