package models.IOF.FullStocks.Images;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.net.URL;
import java.util.List;

/**
 * Created by Mindaugas on 6/5/2016.
 */
@XmlRootElement(name = "icons")
public class Icons {
    @XmlElement(name = "icon")
    private List<URL> iconIUrl;

    public List<URL> getIconIUrl() {
        return iconIUrl;
    }

    public void setIconIUrl(List<URL> iconIUrl) {
        this.iconIUrl = iconIUrl;
    }
}
