package models.IOF.GatewayInfoModels.Meta.Time;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by m.jankus on 2016-05-20.
 */
@XmlRootElement(name = "time")
@XmlAccessorType(XmlAccessType.FIELD)
public class Time {

    @XmlElement(name="offer")
    private List<OfferDate> offerDateCreate;

    public List<OfferDate> getOfferDateCreate() {
        return offerDateCreate;
    }

    public void setOfferDateCreate(List<OfferDate> offerDateCreate) {
        this.offerDateCreate = offerDateCreate;
    }
}
