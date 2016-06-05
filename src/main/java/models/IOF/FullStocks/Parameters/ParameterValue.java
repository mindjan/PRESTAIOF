package models.IOF.FullStocks.Parameters;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Mindaugas on 6/5/2016.
 */
@XmlRootElement(name = "value")
@XmlAccessorType(XmlAccessType.FIELD)
public class ParameterValue {
    @XmlAttribute(name = "id")
    private Long id;
    @XmlAttribute(name = "name")
    private String name;
    @XmlAttribute(name = "xml:lang")
    private String language;

}
