package models.IOF.FullStocks.Sizes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by m.jankus on 2016-06-05.
 */
@XmlRootElement(name = "sizes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Sizes {
    @XmlElement(name = "size")
    private List<Size> sizes;

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }
}
