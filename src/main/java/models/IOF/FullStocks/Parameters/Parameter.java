package models.IOF.FullStocks.Parameters;

import javax.xml.bind.annotation.*;

/**
 * Created by Mindaugas on 6/5/2016.
 */
@XmlRootElement(name = "parameter")
@XmlAccessorType(XmlAccessType.FIELD)
public class Parameter {
    @XmlAttribute(name = "id")
    private Long id;

    @XmlAttribute(name = "name")
    private String name;

    @XmlAttribute(name ="xml:lang")
    private String language;

    @XmlElement(name = "value")
    private ParameterValue value;

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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ParameterValue getValue() {
        return value;
    }

    public void setValue(ParameterValue value) {
        this.value = value;
    }
}
