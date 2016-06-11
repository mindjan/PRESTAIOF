package models.IOF.FullStocks.Sizes.Combinations;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by Mindaugas on 6/11/2016.
 */
@XmlRootElement(name = "size")
@XmlAccessorType(XmlAccessType.FIELD)
public class SizesAttributes {
    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "name")
    private String name;
    @XmlElement(name = "name")
    private List<AttributeValue> attributeValues;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AttributeValue> getAttributeValues() {
        return attributeValues;
    }

    public void setAttributeValues(List<AttributeValue> attributeValues) {
        this.attributeValues = attributeValues;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}


