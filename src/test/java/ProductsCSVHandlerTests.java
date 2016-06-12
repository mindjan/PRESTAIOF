import junit.framework.TestCase;
import org.xml.sax.SAXException;
import tools.CSVExport.ProductsCSVHandler;
import tools.IOFGateways.ProductsGateway;
import tools.IOFGateways.WholesalerGatewayProvider;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

/**
 * Created by Mindaugas on 6/12/2016.
 */
public class ProductsCSVHandlerTests extends TestCase {
    protected void setUp(){

    }

    public void testProductsCSV() throws SAXException, JAXBException, ParserConfigurationException, XPathExpressionException, IOException {
        ProductsCSVHandler productsCSV = new ProductsCSVHandler();
        productsCSV.GenerateProductsCsv(1001);
    }
}
