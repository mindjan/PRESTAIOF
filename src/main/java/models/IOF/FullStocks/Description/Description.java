package models.IOF.FullStocks.Description;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by m.jankus on 2016-06-05.
 */
@XmlRootElement(name = "description")
@XmlAccessorType(XmlAccessType.FIELD)
public class Description {
//    @XmlElement(name = "name")
//    private List<Name> name;
//    @XmlElement(name = "version")
//    private Version version;
    @XmlElement(name = "long_desc")
    private List<LongDescription> longDescriptions;

//    public List<Name> getName() {
//        return name;
//    }
//
//    public void setName(List<Name> name) {
//        this.name = name;
//    }

//    public Version getVersion() {
//        return version;
//    }
//
//    public void setVersion(Version version) {
//        this.version = version;
//    }

    public List<LongDescription> getLongDescriptions() {
        return longDescriptions;
    }

    public void setLongDescriptions(List<LongDescription> longDescriptions) {
        this.longDescriptions = longDescriptions;
    }

    @XmlRootElement(name = "name")
    @XmlAccessorType(XmlAccessType.FIELD)
    public class Name{
        @XmlElement(name = "name")
        private String name;
        @XmlAttribute(name = "xml:lang")
        private String lang;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }
    }

    @XmlRootElement(name = "version")
    @XmlAccessorType(XmlAccessType.FIELD)
    public class Version{
        @XmlElement(name = "name")
        private List<Name> name;

        public List<Name> getName() {
            return name;
        }

        public void setName(List<Name> name) {
            this.name = name;
        }
    }

}
