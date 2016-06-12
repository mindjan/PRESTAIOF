package models.IOF.FullStocks.Description;

import javax.xml.bind.annotation.*;

/**
 * Created by Mindaugas on 6/12/2016.
 */
@XmlRootElement(name = "name")
@XmlAccessorType(XmlAccessType.FIELD)
public class DescName {
        @XmlValue
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
