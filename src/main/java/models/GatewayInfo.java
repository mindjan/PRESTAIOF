package models;

import models.IOF.Address;
import models.IOF.Meta;
import models.IOF.Time;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.net.URL;

/**
 * Created by m.jankus on 2016-05-20.
 */
@XmlRootElement(name = "provider_description")
@XmlAccessorType(XmlAccessType.FIELD)
public class GatewayInfo {
    @XmlElement
    private Meta meta;

    @XmlElement
    private Time time;

    @XmlElement(name = "full")
    private URL fullXml;

    @XmlElement(name = "light")
    private URL lightXml;

    @XmlElement(name = "categories")
    private URL categoriesXml;

    @XmlElement(name = "sizes")
    private URL sizesXml;

    @XmlElement(name = "producers")
    private URL producersXml;

    @XmlElement(name = "units")
    private URL unitsXml;

    @XmlElement(name = "parameters")
    private URL parametersXml;

    @XmlElement(name = "stocks")
    private URL stocksXml;

    @XmlElement(name = "series")
    private URL seriesXml;

    @XmlElement(name = "warranties")
    private URL warrantiesXml;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public URL getFullXml() {
        return fullXml;
    }

    public void setFullXml(URL fullXml) {
        this.fullXml = fullXml;
    }

    public URL getLightXml() {
        return lightXml;
    }

    public void setLightXml(URL lightXml) {
        this.lightXml = lightXml;
    }

    public URL getCategoriesXml() {
        return categoriesXml;
    }

    public void setCategoriesXml(URL categoriesXml) {
        this.categoriesXml = categoriesXml;
    }

    public URL getSizesXml() {
        return sizesXml;
    }

    public void setSizesXml(URL sizesXml) {
        this.sizesXml = sizesXml;
    }

    public URL getProducersXml() {
        return producersXml;
    }

    public void setProducersXml(URL producersXml) {
        this.producersXml = producersXml;
    }

    public URL getUnitsXml() {
        return unitsXml;
    }

    public void setUnitsXml(URL unitsXml) {
        this.unitsXml = unitsXml;
    }

    public URL getParametersXml() {
        return parametersXml;
    }

    public void setParametersXml(URL parametersXml) {
        this.parametersXml = parametersXml;
    }

    public URL getStocksXml() {
        return stocksXml;
    }

    public void setStocksXml(URL stocksXml) {
        this.stocksXml = stocksXml;
    }

    public URL getSeriesXml() {
        return seriesXml;
    }

    public void setSeriesXml(URL seriesXml) {
        this.seriesXml = seriesXml;
    }

    public URL getWarrantiesXml() {
        return warrantiesXml;
    }

    public void setWarrantiesXml(URL warrantiesXml) {
        this.warrantiesXml = warrantiesXml;
    }
}