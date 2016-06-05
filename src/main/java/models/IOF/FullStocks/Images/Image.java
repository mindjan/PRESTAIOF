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
public class Image {
    @XmlAttribute(name = "url")
    private URL url;
    @XmlAttribute(name = "date_changed")
    private String dateChanged;
    @XmlAttribute(name = "hash")
    private String hash;
}
