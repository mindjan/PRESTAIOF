package tools;

import models.GatewayInfo;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.net.URL;

/**
 * Created by m.jankus on 2016-05-20.
 */
public class WholesalerGatewayProvider {
    public WholesalerGatewayProvider(URL gatewayXmlUrl) throws IOException, SAXException, ParserConfigurationException, XPathExpressionException, JAXBException {
        GenerateGatewayInfo(gatewayXmlUrl);
    }

    private GatewayInfo gatewayInfo = new GatewayInfo();

    private void GenerateGatewayInfo(URL gatewayXmlUrl) throws ParserConfigurationException, IOException, JAXBException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(gatewayXmlUrl.openStream());

        JAXBContext jaxbContext = JAXBContext.newInstance(GatewayInfo.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        gatewayInfo = (GatewayInfo) jaxbUnmarshaller.unmarshal(doc);
    }

    public GatewayInfo getGatewayInfo() {
        return gatewayInfo;
    }
}
