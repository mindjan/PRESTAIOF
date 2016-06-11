package models.IOF.FullStocks.Images;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Mindaugas on 6/5/2016.
 */
@XmlRootElement(name = "images")
@XmlAccessorType(XmlAccessType.FIELD)
public class Images {
    @XmlElement(name = "large")
    private Large large;
    @XmlElement(name = "icons")
    private Icons icons;

    public Large getLarge() {
        return large;
    }

    public void setLarge(Large large) {
        this.large = large;
    }

    public Icons getIcons() {
        return icons;
    }

    public void setIcons(Icons icons) {
        this.icons = icons;
    }
}


