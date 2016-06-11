package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by m.jankus on 2016-06-06.
 */
@XmlRootElement(name = "offer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Offer {
    @XmlElement(name = "products")
    private Products products;

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }
}
