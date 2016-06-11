package models.IOF.FullStocks.Images;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.net.URL;
import java.util.List;

/**
 * Created by Mindaugas on 6/5/2016.
 */
@XmlRootElement(name = "icons")
@XmlAccessorType(XmlAccessType.FIELD)
public class Icons {
    @XmlElement(name = "icon")
    private List<Icon> icons;

    public List<Icon> getIcons() {
        return icons;
    }

    public void setIcons(List<Icon> icons) {
        this.icons = icons;
    }
}
