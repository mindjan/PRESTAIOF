package models.IOF.GatewayInfoModels.Meta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.net.URL;

/**
 * Created by Mindaugas on 6/4/2016.
 */
@XmlRootElement(name = "showcase_image")
@XmlAccessorType(XmlAccessType.FIELD)
public class ShowcaseImage {
    @XmlAttribute(name = "url")
    private URL url;

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }
}
