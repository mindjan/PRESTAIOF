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
@XmlRootElement(name = "large")
@XmlAccessorType(XmlAccessType.FIELD)
public class Large {

    @XmlElement(name = "image")
    private List<Image> images;

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
