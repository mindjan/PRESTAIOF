package models.IOF;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.net.URL;

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
    private URL showcaseImageUrl;

    @XmlElement
    private String email;

    @XmlElement
    private Address address;

    @XmlElement
    private String tel;

    @XmlElement(name = "fax")
    private String fax;

    @XmlElement(name = "www")
    private URL homepageAddress;

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

    public URL getShowcaseImageUrl() {
        return showcaseImageUrl;
    }

    public void setShowcaseImageUrl(URL showcaseImageUrl) {
        this.showcaseImageUrl = showcaseImageUrl;
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

    public URL getHomepageAddress() {
        return homepageAddress;
    }

    public void setHomepageAddress(URL homepageAddress) {
        this.homepageAddress = homepageAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
