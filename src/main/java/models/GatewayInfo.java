package models;

import models.IOF.GatewayInfo.Meta.Meta;
import models.IOF.GatewayInfo.Urls.*;

import javax.xml.bind.annotation.*;

/**
 * Created by m.jankus on 2016-05-20.
 */
@XmlRootElement(name = "provider_description")
@XmlAccessorType(XmlAccessType.FIELD)
public class GatewayInfo {
    @XmlElement
    private Meta meta;

    @XmlElement(name = "full")
    private FullXmlUrl fullXml;

    @XmlElement(name = "light")
    private LightXmlUrl lightXml;

    @XmlElement(name = "categories")
    private CategoriesXmlUrl categoriesXml;

    @XmlElement(name = "sizes")
    private SizesXmlUrl sizesXml;

    @XmlElement(name = "producers")
    private ProducersXmlUrl producersXml;

    @XmlElement(name = "units")
    private UnitsXmlUrl unitsXml;

    //@XmlElement(name = "parameters")
    @XmlElement(name = "parameters")
    private ParametersXmlUrl parametersXml;

    @XmlElement(name = "stocks")
    private StocksXmlUrl stocksXml;

    @XmlElement(name = "series")
    private SeriesXmlUrl seriesXml;

    @XmlElement(name = "warranties")
    private WarrantiesXmlUrl warrantiesXml;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public FullXmlUrl getFullXml() {
        return fullXml;
    }

    public void setFullXml(FullXmlUrl fullXml) {
        this.fullXml = fullXml;
    }

    public LightXmlUrl getLightXml() {
        return lightXml;
    }

    public void setLightXml(LightXmlUrl lightXml) {
        this.lightXml = lightXml;
    }

    public CategoriesXmlUrl getCategoriesXml() {
        return categoriesXml;
    }

    public void setCategoriesXml(CategoriesXmlUrl categoriesXml) {
        this.categoriesXml = categoriesXml;
    }

    public SizesXmlUrl getSizesXml() {
        return sizesXml;
    }

    public void setSizesXml(SizesXmlUrl sizesXml) {
        this.sizesXml = sizesXml;
    }

    public ProducersXmlUrl getProducersXml() {
        return producersXml;
    }

    public void setProducersXml(ProducersXmlUrl producersXml) {
        this.producersXml = producersXml;
    }

    public UnitsXmlUrl getUnitsXml() {
        return unitsXml;
    }

    public void setUnitsXml(UnitsXmlUrl unitsXml) {
        this.unitsXml = unitsXml;
    }

    public ParametersXmlUrl getParametersXml() {
        return parametersXml;
    }

    public void setParametersXml(ParametersXmlUrl parametersXml) {
        this.parametersXml = parametersXml;
    }

    public StocksXmlUrl getStocksXml() {
        return stocksXml;
    }

    public void setStocksXml(StocksXmlUrl stocksXml) {
        this.stocksXml = stocksXml;
    }

    public SeriesXmlUrl getSeriesXml() {
        return seriesXml;
    }

    public void setSeriesXml(SeriesXmlUrl seriesXml) {
        this.seriesXml = seriesXml;
    }

    public WarrantiesXmlUrl getWarrantiesXml() {
        return warrantiesXml;
    }

    public void setWarrantiesXml(WarrantiesXmlUrl warrantiesXml) {
        this.warrantiesXml = warrantiesXml;
    }
}