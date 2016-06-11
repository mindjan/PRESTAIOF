package models.IOF.FullStocks.Images;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.net.URL;

/**
 * Created by Mindaugas on 6/5/2016.
 */
@XmlRootElement(name = "icon")
@XmlAccessorType(XmlAccessType.FIELD)
public class Icon {
    @XmlAttribute(name = "url")
    private URL url;
    @XmlAttribute(name = "date_changed")
    private String dateChanged;
    @XmlAttribute(name = "hash")
    private String hash;

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getDateChanged() {
        return dateChanged;
    }

    public void setDateChanged(String dateChanged) {
        this.dateChanged = dateChanged;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
