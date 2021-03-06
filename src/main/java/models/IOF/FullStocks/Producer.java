package models.IOF.FullStocks;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by m.jankus on 2016-06-05.
 */
@XmlRootElement(name = "producer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Producer {
    @XmlAttribute(name = "id")
    private Long id;
    @XmlAttribute(name = "name")
    private String name;

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
}
