package models.IOF.FullStocks.Sizes.Stock;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by Mindaugas on 6/5/2016.
 */
@XmlRootElement(name = "size")
@XmlAccessorType(XmlAccessType.FIELD)
public class Size {
    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "code_producer")
    private String codeProducer;
    @XmlAttribute(name = "code")
    private String code;
    @XmlAttribute(name = "weight")
    private Integer weight;
    @XmlElement(name = "stock")
    private List<Stock> stock;

    public String getCodeProducer() {
        return codeProducer;
    }

    public void setCodeProducer(String codeProducer) {
        this.codeProducer = codeProducer;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Stock> getStock() {
        return stock;
    }

    public void setStock(List<Stock> stock) {
        this.stock = stock;
    }
}
