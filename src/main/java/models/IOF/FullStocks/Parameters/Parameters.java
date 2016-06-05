package models.IOF.FullStocks.Parameters;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Mindaugas on 6/5/2016.
 */
@XmlRootElement(name = "parameter")
@XmlAccessorType(XmlAccessType.FIELD)
public class Parameters {
    @XmlElement(name = "parameter")
    private List<Parameter> parameters;
}
