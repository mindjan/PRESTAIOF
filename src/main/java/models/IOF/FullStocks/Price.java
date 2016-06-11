package models.IOF.FullStocks;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Mindaugas on 6/5/2016.
 */
@XmlRootElement(name = "price")
@XmlAccessorType(XmlAccessType.FIELD)
public class Price {
    @XmlAttribute(name = "gross")
    private Double gross;
    @XmlAttribute(name = "net")
    private Double net;
    @XmlAttribute(name = "vat")
    private Double vat;

    public Double getGross() {
        return gross;
    }

    public void setGross(Double gross) {
        this.gross = gross;
    }

    public Double getNet() {
        return net;
    }

    public void setNet(Double net) {
        this.net = net;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }
}
