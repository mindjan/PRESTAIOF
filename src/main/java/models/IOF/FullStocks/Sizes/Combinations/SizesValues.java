package models.IOF.FullStocks.Sizes.Combinations;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by Mindaugas on 6/11/2016.
 */

@XmlRootElement(name = "sizes")
@XmlAccessorType(XmlAccessType.FIELD)
public class SizesValues {
    @XmlElement(name = "group")
    private List<Group> groups;

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
