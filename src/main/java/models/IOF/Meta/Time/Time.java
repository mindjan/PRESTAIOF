package models.IOF.Meta.Time;

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

    @XmlAttribute(name="offer")
    private DateCreated offerDateCreate;

    @XmlAttribute(name="offer")
    private DateEexpires offerDateExpires;

    public DateCreated getOfferDateCreate() {
        return offerDateCreate;
    }

    public void setOfferDateCreate(DateCreated offerDateCreate) {
        this.offerDateCreate = offerDateCreate;
    }

    public DateEexpires getOfferDateExpires() {
        return offerDateExpires;
    }

    public void setOfferDateExpires(DateEexpires offerDateExpires) {
        this.offerDateExpires = offerDateExpires;
    }
}
