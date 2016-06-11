package models.IOF.FullStocks.Description;

import javax.xml.bind.annotation.*;

/**
 * Created by Mindaugas on 6/5/2016.
 */
@XmlRootElement(name = "long_desc")
@XmlAccessorType(XmlAccessType.FIELD)
public class LongDescription {
    @XmlAttribute(name = "xml:lang")
    private String language;
    @XmlElement(name = "long_desc")
    private String description;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
