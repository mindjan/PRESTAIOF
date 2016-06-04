package models.IOF.Urls;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.net.URL;

/**
 * Created by Mindaugas on 6/4/2016.
 */
@XmlRootElement(name = "full")
@XmlAccessorType(XmlAccessType.FIELD)
public class FullXmlUrl {
    @XmlAttribute
    private URL url;

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }
}
