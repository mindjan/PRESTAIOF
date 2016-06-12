import junit.framework.TestCase;
import models.IOF.GatewayInfo;
import models.IOF.GatewayInfoModels.Meta.Meta;
import models.IOF.GatewayInfoModels.Meta.Time.OfferDate;
import models.IOF.GatewayInfoModels.Meta.Time.Time;
import org.xml.sax.SAXException;
import tools.IOFGateways.WholesalerGatewayProvider;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * Created by m.jankus on 2016-05-20.
 */
public class WholesalerGatewayProviderTests extends TestCase {
    protected void setUp(){

    }

    public void testXmlParserShouldParseCorrectly() throws IOException, XPathExpressionException, SAXException, ParserConfigurationException, JAXBException {
        Properties props = new Properties();
        FileInputStream input = new FileInputStream("src\\main\\resources\\config.properties");

        props.load(input);
        String czasnabutyGatewayUrl = props.getProperty("czasnabutyGatewayUrl");
        URL xmlUrl = new URL(czasnabutyGatewayUrl);

        WholesalerGatewayProvider wholesalerGatewayProvider = new WholesalerGatewayProvider(xmlUrl);

        assertGatewayTypes(wholesalerGatewayProvider);
    }

    private void assertGatewayTypes(WholesalerGatewayProvider wholesalerGatewayProvider){
        assertGatewayMeta(wholesalerGatewayProvider.getGatewayInfo().getMeta());
        assertGatewayUrls(wholesalerGatewayProvider.getGatewayInfo());
        assertOfferTime(wholesalerGatewayProvider.getGatewayInfo().getMeta().getTime());
    }

    public void assertGatewayUrls(GatewayInfo gatewayInfo){
        assertNotNull(gatewayInfo.getCategoriesXml());
        assertNotNull(gatewayInfo.getFullXml());
        assertNotNull(gatewayInfo.getLightXml());
        assertNotNull(gatewayInfo.getParametersXml());
        assertNotNull(gatewayInfo.getProducersXml());
        assertNotNull(gatewayInfo.getSeriesXml());
        assertNotNull(gatewayInfo.getSizesXml());
        assertNotNull(gatewayInfo.getStocksXml());
        assertNotNull(gatewayInfo.getUnitsXml());
        assertNotNull(gatewayInfo.getWarrantiesXml());
    }

    public void assertGatewayMeta(Meta gatewayMeta){
        assertNotNull(gatewayMeta);
        assertNotNull(gatewayMeta.getFax());
        assertNotNull(gatewayMeta.getEmail());
        assertNotNull(gatewayMeta.getAddress());
        assertNotNull(gatewayMeta.getHomepageAddress());
        assertNotNull(gatewayMeta.getLongName());
        assertNotNull(gatewayMeta.getShortName());
        assertNotNull(gatewayMeta.getShowcaseImageUrl());
        assertNotNull(gatewayMeta.getTel());
        assertNotNull(gatewayMeta.getTime());
    }

    public void assertOfferTime(Time offerTime){
        String offerStartDate = null;
        String offerEndDate = null;
        for (OfferDate offerDate: offerTime.getOfferDateCreate()) {
            if(offerDate.getDateCreated() != null){
                offerStartDate = offerDate.getDateCreated();
            }
            if(offerDate.getDateExpires() != null){
                offerEndDate = offerDate.getDateExpires();
            }
        }

        assertNotNull(offerStartDate);
        assertNotNull(offerEndDate);
    }
}
