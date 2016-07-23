import junit.framework.TestCase;
import models.IOF.Product;
import org.xml.sax.SAXException;
import tools.IOFGateways.ProductsGateway;
import tools.IOFGateways.WholesalerGatewayProvider;
import tools.Translators.DescriptionTranslator;
import tools.Translators.Helpers.DescriptionSizeTableParser;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * Created by root on 16.6.25.
 */
public class DescriptionParserTests extends TestCase {
    public void testDescriptionParser() throws SAXException, JAXBException, ParserConfigurationException, XPathExpressionException, IOException {
        DescriptionSizeTableParser descriptionSizeTableParser = new DescriptionSizeTableParser();
        WholesalerGatewayProvider wholesalerGatewayProvider = generateGetwayProvider();
        ProductsGateway productsGateway = new ProductsGateway(wholesalerGatewayProvider.getGatewayInfo().getFullXml().getUrl());

        DescriptionTranslator dt = new DescriptionTranslator();

        for (Product produt : productsGateway.getOffer().getProducts().getProducts()) {
            descriptionSizeTableParser.parseDescriptions(produt.getDescription());
        }

    }

    private WholesalerGatewayProvider generateGetwayProvider() throws IOException, SAXException, ParserConfigurationException, XPathExpressionException, JAXBException {
        Properties props = new Properties();
        FileInputStream input = new FileInputStream("src/main/resources/config.properties");

        props.load(input);
        String czasnabutyGatewayUrl = props.getProperty("czasnabutyGatewayUrl");
        URL xmlUrl = new URL(czasnabutyGatewayUrl);

        WholesalerGatewayProvider wholesalerGatewayProvider = new WholesalerGatewayProvider(xmlUrl);

        return wholesalerGatewayProvider;
    }
}
