package models.IOF.FullStocks.Sizes.Combinations;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by Mindaugas on 6/11/2016.
 */
@XmlRootElement(name = "group")
@XmlAccessorType(XmlAccessType.FIELD)
public class Group {
    @XmlAttribute(name = "id")
    private Long id;
    @XmlAttribute(name = "name")
    private String name;
    @XmlElement(name = "size")
    private List<SizesAttributes> sizes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SizesAttributes> getSizes() {
        return sizes;
    }

    public void setSizes(List<SizesAttributes> sizes) {
        this.sizes = sizes;
    }
}
