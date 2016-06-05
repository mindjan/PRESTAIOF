package models.IOF.GatewayInfo.Meta;

import models.IOF.GatewayInfo.Meta.Time.Time;

import javax.xml.bind.annotation.*;

/**
 * Created by m.jankus on 2016-05-20.
 */
@XmlRootElement(name = "meta")
@XmlAccessorType(XmlAccessType.FIELD)
public class Meta {

    @XmlElement(name = "long_name")
    private String longName;

    @XmlElement(name = "short_name")
    private String shortName;

    @XmlElement(name = "showcase_image")
    private ShowcaseImage showcaseImageUrl;

    @XmlElement
    private String email;

    @XmlElement(name = "address")
    private Address address;

    @XmlElement
    private String tel;

    @XmlElement(name = "fax")
    private String fax;

    @XmlElement(name = "www")
    private String homepageAddress;

    @XmlElement(name = "time")
    private Time time;

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ShowcaseImage getShowcaseImageUrl() {
        return showcaseImageUrl;
    }

    public void setShowcaseImageUrl(ShowcaseImage showcaseImageUrl) {
        this.showcaseImageUrl = showcaseImageUrl;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getHomepageAddress() {
        return homepageAddress;
    }

    public void setHomepageAddress(String homepageAddress) {
        this.homepageAddress = homepageAddress;
    }
}
