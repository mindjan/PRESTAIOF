package tools.CSVExport;

import models.CSVExport.ProductsCSV;
import models.IOF.FullStocks.Sizes.Combinations.Group;
import models.IOF.FullStocks.Sizes.Combinations.SizesAttributes;
import models.IOF.FullStocks.Sizes.Stock.Size;
import models.IOF.Product;
import org.xml.sax.SAXException;
import tools.IOFGateways.ProductsGateway;
import tools.IOFGateways.SizesGateway;
import tools.IOFGateways.WholesalerGatewayProvider;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.*;

/**
 * Created by mindaugas on 16.7.23.
 */
public class CombinationsCSVHandler {
    private static List<String> sizesAll = new ArrayList<String>();
    private static String pattern = "Product ID*;Attribute (Name:Type:Position)*;Value (Value:Position)*;Supplier reference;" +
            "Reference;EAN13;UPC;Wholesale price;Impact on price;Ecotax;Quantity;Minimal quantity;" +
            "Impact on weight;Default (0 = No, 1 = Yes);Combination available date;Image position;Image URL;" +
            "Delete existing images (0 = No, 1 = Yes);ID / Name of shop;Advanced Stock Managment;Depends on stock;Warehouse";

    private Map<String, String> sizes = new HashMap<String, String>();
    private Integer wholesalerCode = 1001;

    public void generateCombinationsCsv() throws SAXException, JAXBException, ParserConfigurationException, XPathExpressionException, IOException {
        WholesalerGatewayProvider wholesalerGatewayProvider = generateGetwayProvider();
        ProductsGateway productsGateway = new ProductsGateway(wholesalerGatewayProvider.getGatewayInfo().getFullXml().getUrl());
        SizesGateway sizesGateway = new SizesGateway(wholesalerGatewayProvider.getGatewayInfo().getSizesXml().getUrl());
        parseSizes(sizesGateway.sizes.getGroups());
        List<String> generateCombinations = createCombinatiosCsv(productsGateway.getOffer().getProducts().getProducts());
        printCsv(generateCombinations);
    }

    private void appenSizes(String size){
        sizesAll.add(size);
    }

    private void printCsv(List<String> lines) throws IOException {
        FileWriter fw = new FileWriter("combinations.csv");

        fw.write(pattern+"\n");
        for (String line : lines) {
            fw.write(line + "\n");
        }

        fw.close();
    }

    private void parseSizes(List<Group> sizesGroups){
        for (Group sizesGroup:sizesGroups) {
            for (SizesAttributes size : sizesGroup.getSizes()){
                sizes.put(size.getId(), size.getName());
            }
        }
    }

    private List<String> createCombinatiosCsv(List<Product> products) throws IOException {
        List<String> lines = new ArrayList<String>();
        for (Product product:products) {
            for(Size size:product.getSizes().getSizes()){
                if(size.getStock() != null){
                    if(size.getStock().get(0).getQuantity() > 3) {
                        lines.add("" + wholesalerCode.toString() + product.getId().toString() + ";;Dydis:select:0;" + sizes.get(size.getId()) + ":0;;;;" +
                                ";" + product.getPrice().getGross() + ";0;;" + size.getStock().get(0).getQuantity() + ";1;" +
                                "0;1;;;;" +
                                ";;;;");
                        sizesAll.add(sizes.get(size.getId()));
                    }
                }
            }
        }
        printSizes();
        return lines;
    }

    private void printSizes() throws IOException {
        List<String> list =  new ArrayList(new HashSet(sizesAll));
        FileWriter fw = new FileWriter("C:\\Users\\Mindaugas\\Projects\\PRESTAIOF\\src\\main\\resources\\sizes.csv");

        for (String a:list) {
            fw.write(a+"\n");
        }
        fw.close();
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
