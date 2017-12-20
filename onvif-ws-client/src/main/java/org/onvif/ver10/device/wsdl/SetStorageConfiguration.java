
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="StorageConfiguration" type="{http://www.onvif.org/ver10/device/wsdl}StorageConfiguration"/&gt;
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
    "storageConfiguration"
})
@XmlRootElement(name = "SetStorageConfiguration")
public class SetStorageConfiguration {

    @XmlElement(name = "StorageConfiguration", required = true)
    protected StorageConfiguration storageConfiguration;

    /**
     * Recupera il valore della proprietà storageConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link StorageConfiguration }
     *     
     */
    public StorageConfiguration getStorageConfiguration() {
        return storageConfiguration;
    }

    /**
     * Imposta il valore della proprietà storageConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageConfiguration }
     *     
     */
    public void setStorageConfiguration(StorageConfiguration value) {
        this.storageConfiguration = value;
    }

}
