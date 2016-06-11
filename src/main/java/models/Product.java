package models;

import models.IOF.FullStocks.Category;
import models.IOF.FullStocks.Description.Description;
import models.IOF.FullStocks.Images.Images;
import models.IOF.FullStocks.Parameters.Parameters;
import models.IOF.FullStocks.Price;
import models.IOF.FullStocks.Sizes.Stock.Sizes;
import models.IOF.FullStocks.Unit;

import javax.xml.bind.annotation.*;

/**
 * Created by Mindaugas on 6/5/2016.
 */
@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
    @XmlAttribute(name = "id")
    private Long id;
    @XmlAttribute(name = "currency")
    private String currency;
    @XmlAttribute(name = "code_producer")
    private String coreProducer;
    @XmlElement(name = "category")
    private Category category;
    @XmlElement(name = "unit")
    private Unit unit;
    @XmlElement(name = "description")
    private Description description;
    @XmlElement(name = "price")
    private Price price;
    @XmlElement(name = "images")
    private Images images;
    @XmlElement(name = "parameters")
    private Parameters parameters;
    @XmlElement(name = "sizes")
    private Sizes sizes;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCoreProducer() {
        return coreProducer;
    }

    public void setCoreProducer(String coreProducer) {
        this.coreProducer = coreProducer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public Sizes getSizes() {
        return sizes;
    }

    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }
}
