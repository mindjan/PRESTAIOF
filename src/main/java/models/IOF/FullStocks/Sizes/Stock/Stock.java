package models.IOF.FullStocks.Sizes.Stock;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by m.jankus on 2016-06-05.
 */
@XmlRootElement(name = "stock")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stock {
    @XmlAttribute(name = "id")
    private Long id;
    @XmlAttribute(name = "quantity")
    private int quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
