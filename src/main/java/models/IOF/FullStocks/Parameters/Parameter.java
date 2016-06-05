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
}
