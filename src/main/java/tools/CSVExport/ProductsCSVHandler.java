package tools.CSVExport;

import models.CSVExport.ProductsCSV;
import models.IOF.FullStocks.Description.LongDescription;
import models.IOF.FullStocks.Images.Image;
import models.IOF.Product;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.xml.sax.SAXException;
import tools.IOFGateways.ProductsGateway;
import tools.IOFGateways.WholesalerGatewayProvider;
import tools.Translators.Helpers.HtmlDescritionParser;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by Mindaugas on 6/11/2016.
 */
public class ProductsCSVHandler {
    HtmlDescritionParser htmlDescritionParser = new HtmlDescritionParser();
    public void GenerateProductsCsv(Integer wholesalerCode) throws ParserConfigurationException, IOException, SAXException, JAXBException, XPathExpressionException {
        WholesalerGatewayProvider wholesalerGatewayProvider = generateGetwayProvider();
        ProductsGateway productsGateway = new ProductsGateway(wholesalerGatewayProvider.getGatewayInfo().getFullXml().getUrl());
        List<ProductsCSV> products = GenerateLines(productsGateway, wholesalerCode);
        print(products);
    }

    private void print(List<ProductsCSV> products) throws IOException {
        FileWriter fw = new FileWriter("products.csv");

        fw.write(products.get(1).getCSVFormat());

        for (ProductsCSV product : products) {
            fw.write(product.getID()+";0;+"+product.getName()+"+;"+product.getCategories()+";"+product.getPrice()+";;"+product.getWholesalePrice()+";0;;" +
                    ";;;;;;;;;;;;;;;1;"+product.getVisability()+";;;"+product.getPrice()+";;"+htmlDescritionParser.processDescription(product.getDescription())+";;;;;;;;1;;;1;"+product.getImageUrls()+";" +
                    ";;;;;;;;;;;"+"\n");
        }

        fw.close();
    }

    private List<ProductsCSV> GenerateLines(ProductsGateway productsGateway, Integer wholesalerCode){
        List<ProductsCSV> lines = new ArrayList<ProductsCSV>();

        String wholesalerCodePref = wholesalerCode.toString();

        for (Product product : productsGateway.getOffer().getProducts().getProducts()){


            ProductsCSV line = new ProductsCSV();
            line.setID(wholesalerCodePref+product.getId().toString());
            line.setActive("0");
            Double price = product.getPrice().getGross()*1.23*1.5;
            line.setPrice(price.toString());
            line.setImageUrls(generateImages(product.getImages().getLarge().getImages()));
            line.setName(product.getDescription().getName().getName());
            line.setMinimalQuantity("1");
            Double priceWholesale = product.getPrice().getGross()*1.23;
            line.setWholesalePrice(priceWholesale.toString());
            line.setAvailableForOrder("1");
            line.setDescription(generateDescription(product.getDescription().getLongDescriptions()));
            line.setVisability("both");
            line.setCondition("new");
            line.setCategories("shoes");
            line.setCategories("shoes");

            lines.add(line);
        }

        return lines;
    }

    private String generateDescription(List<LongDescription> descriptions) {
        String descriptionGenereated = "";
        for (LongDescription description : descriptions){
            if(description.getLanguage().equals("pol")){
                descriptionGenereated = description.getDescription();
            }
        }

        return descriptionGenereated;
    }

    private String generateImages(List<Image> images){
        String imagesLine = "";
        for(Image image : images){
            if(images.indexOf(image) == images.size()-1){
                imagesLine = imagesLine + image.getUrl().toString();
            }
            else{
                imagesLine = imagesLine + image.getUrl().toString() + ",";
            }
        }

        return imagesLine;
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
