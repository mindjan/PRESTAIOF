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
import java.io.*;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by Mindaugas on 6/11/2016.
 */
public class ProductsCSVHandler {
    HtmlDescritionParser htmlDescritionParser = new HtmlDescritionParser();

    public ProductsCSVHandler() throws IOException {
    }

    public void GenerateProductsCsv(Integer wholesalerCode) throws ParserConfigurationException, IOException, SAXException, JAXBException, XPathExpressionException {
        WholesalerGatewayProvider wholesalerGatewayProvider = generateGetwayProvider();
        ProductsGateway productsGateway = new ProductsGateway(wholesalerGatewayProvider.getGatewayInfo().getFullXml().getUrl());
        List<ProductsCSV> products = GenerateLines(productsGateway, wholesalerCode);
        List<ProductsCSV> filteredProducts = filterImportedProducts(products);
        print(filteredProducts);
    }

    private  List<ProductsCSV> filterImportedProducts(List<ProductsCSV> products) throws IOException {
        List<ProductsCSV> filteredProducts = new ArrayList<ProductsCSV>();
        List<String> importedProducts = readImportedProducts();
        for(ProductsCSV product: products){
            if(!importedProducts.contains(product.getID())){
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    }

    private List<String> readImportedProducts() throws IOException {
        List<String> importedProductsIds = new ArrayList<String>();

        FileInputStream fis = new FileInputStream("C:\\Users\\Mindaugas\\Projects\\PRESTAIOF\\src\\main\\resources\\importedProducts.csv");

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;
        while ((line = br.readLine()) != null) {
            importedProductsIds.add(line);
        }
        br.close();

        return importedProductsIds;
    }

    private void print(List<ProductsCSV> products) throws IOException {
        FileWriter fw = new FileWriter("products.csv");

        fw.write(products.get(1).getCSVFormat()+"\n");

        for (ProductsCSV product : products) {
            fw.write(product.getID()+";0;+"+product.getName()+"+;"+product.getCategories()+";"+product.getPrice()+";;"+product.getWholesalePrice()+";0;;" +
                    ";;;;;;;;;;;;;;;1;"+product.getVisability()+";;;"+product.getPrice()+1+";;"+htmlDescritionParser.processDescription(product.getDescription()).replace(";","").replace("\n", "")+";;;;;;;;1;;;1;"+product.getImageUrls()+";" +
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
            Double price = product.getPrice().getGross()/4.36*2;
            line.setPrice(String.format("%.2f", price));
            line.setImageUrls(generateImages(product.getImages().getLarge().getImages()));
            line.setName(product.getDescription().getName().getName());
            line.setMinimalQuantity("1");
            Double priceWholesale = product.getPrice().getGross()/4.36;
            line.setWholesalePrice(String.format("%.2f", priceWholesale));
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
