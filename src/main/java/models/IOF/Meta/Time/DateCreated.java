package models.IOF.Meta.Time;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Mindaugas on 6/4/2016.
 */
@XmlRootElement(name = "offer")
@XmlAccessorType(XmlAccessType.FIELD)
public class DateCreated {
    @XmlAttribute(name = "date_created")
    private Date dateCreated;

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
