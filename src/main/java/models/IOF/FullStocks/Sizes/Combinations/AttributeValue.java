package models.IOF.FullStocks.Sizes.Combinations;

import javax.xml.bind.annotation.*;

/**
 * Created by Mindaugas on 6/11/2016.
 */
@XmlRootElement(name = "name")
@XmlAccessorType(XmlAccessType.FIELD)
public class AttributeValue{
    @XmlValue
    private String name;
    @XmlAttribute(name = "xml:lang")
    private String lang;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
