package models.IOF.FullStocks.Description;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by m.jankus on 2016-06-05.
 */
@XmlRootElement(name = "description")
@XmlAccessorType(XmlAccessType.FIELD)
public class Description {

    @XmlElement(name = "long_desc")
    private List<LongDescription> longDescriptions;

    @XmlElement(name = "name")
    private DescName name;

    public List<LongDescription> getLongDescriptions() {
        return longDescriptions;
    }

    public void setLongDescriptions(List<LongDescription> longDescriptions) {
        this.longDescriptions = longDescriptions;
    }

    public DescName getName() {
        return name;
    }

    public void setName(DescName name) {
        this.name = name;
    }
}
