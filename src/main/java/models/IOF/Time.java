package models.IOF;

import javax.management.Attribute;
import javax.xml.bind.annotation.*;
import javax.xml.soap.Name;
import java.util.Date;

/**
 * Created by m.jankus on 2016-05-20.
 */
@XmlRootElement(name = "time")
@XmlAccessorType(XmlAccessType.FIELD)
public class Time {

    @XmlAttribute(name="date_created")
    private Date offerDateCreate;

    @XmlAttribute(name="date_expires")
    private Date offerDateExpires;

    public Date getOfferDateCreate() {
        return offerDateCreate;
    }

    public void setOfferDateCreate(Date offerDateCreate) {
        this.offerDateCreate = offerDateCreate;
    }

    public Date getOfferDateExpires() {
        return offerDateExpires;
    }

    public void setOfferDateExpires(Date offerDateExpires) {
        this.offerDateExpires = offerDateExpires;
    }
}
