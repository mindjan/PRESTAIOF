package tools.IOFGateways;

import models.IOF.FullStocks.Sizes.Combinations.SizesValues;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Mindaugas on 6/11/2016.
 */
public class SizesGateway {

    public SizesGateway(URL productsXmlURL) throws ParserConfigurationException, JAXBException, SAXException, IOException {
        Persist(productsXmlURL);
    }

    public SizesValues sizes = new SizesValues();

    private void Persist(URL sizesXmlURL) throws ParserConfigurationException, IOException, JAXBException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(sizesXmlURL.openStream());

        JAXBContext jaxbContext = JAXBContext.newInstance(SizesValues.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        sizes = (SizesValues) jaxbUnmarshaller.unmarshal(doc);
    }
}
