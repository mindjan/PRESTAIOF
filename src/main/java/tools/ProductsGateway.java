package tools;

import models.IOF.Offer;
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
 * Created by m.jankus on 2016-06-05.
 */
public class ProductsGateway {
    public ProductsGateway(){

    }

    public ProductsGateway(URL productsXmlURL) throws ParserConfigurationException, JAXBException, SAXException, IOException {
        Persist(productsXmlURL);
    }

    private Offer offer = new Offer();

    private void Persist(URL offerXmlURL) throws ParserConfigurationException, IOException, JAXBException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(offerXmlURL.openStream());

        JAXBContext jaxbContext = JAXBContext.newInstance(Offer.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        offer = (Offer) jaxbUnmarshaller.unmarshal(doc);
    }
}
