import junit.framework.TestCase;
import org.xml.sax.SAXException;
import tools.WholesalerGatewayProvider;

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

    public void testGatewayXmlParser() throws IOException, XPathExpressionException, SAXException, ParserConfigurationException, JAXBException {
        Properties props = new Properties();
        FileInputStream input = new FileInputStream("src\\main\\resources\\config.properties");
        props.load(input);
        String czasnabutyGatewayUrl = props.getProperty("czasnabutyGatewayUrl");
        URL xmlUrl = new URL(czasnabutyGatewayUrl);
        WholesalerGatewayProvider wholesalerGatewayProvider = new WholesalerGatewayProvider(xmlUrl);

        assertTrue(wholesalerGatewayProvider.getGatewayInfo().getMeta().getLongName() == "CZASNABUTY.PL");
    }

}
