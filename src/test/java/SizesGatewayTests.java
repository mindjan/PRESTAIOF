import junit.framework.TestCase;
import org.xml.sax.SAXException;
import tools.IOFGateways.SizesGateway;
import tools.IOFGateways.WholesalerGatewayProvider;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * Created by Mindaugas on 6/11/2016.
 */
public class SizesGatewayTests extends TestCase {
    protected void setUp(){

    }

    public void testProductsGateway() throws SAXException, JAXBException, ParserConfigurationException, XPathExpressionException, IOException {
        WholesalerGatewayProvider wholesalerGatewayProvider = generateGetwayProvider();
        SizesGateway sizesGateway = new SizesGateway(wholesalerGatewayProvider.getGatewayInfo().getSizesXml().getUrl());
        int a = 1;
    }

    private WholesalerGatewayProvider generateGetwayProvider() throws IOException, SAXException, ParserConfigurationException, XPathExpressionException, JAXBException {
        Properties props = new Properties();
        FileInputStream input = new FileInputStream("src\\main\\resources\\config.properties");

        props.load(input);
        String czasnabutyGatewayUrl = props.getProperty("czasnabutyGatewayUrl");
        URL xmlUrl = new URL(czasnabutyGatewayUrl);

        WholesalerGatewayProvider wholesalerGatewayProvider = new WholesalerGatewayProvider(xmlUrl);

        return wholesalerGatewayProvider;
    }
}
