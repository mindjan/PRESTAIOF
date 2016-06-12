package models.CSVExport;

/**
 * Created by Mindaugas on 6/12/2016.
 */
public class CombinationsCSV {
    private String CSVFormat = "Product ID*;Attribute (Name:Type:Position)*;Value (Value:Position)*;Supplier reference;" +
            "Reference;EAN13;UPC;Wholesale price;Impact on price;Ecotax;Quantity;Minimal quantity;Impact on weight;" +
            "Default (0 = No, 1 = Yes);Combination available date;Image position;Image URL;Delete existing images (0 = No, 1 = Yes);" +
            "ID / Name of shop;Advanced Stock Managment;Depends on stock;Warehouse";

    private String ProductId;
    private String Attribute;
    private String Value;
    private String SupplierReference;
    private String Reference;
    private String EAN13;
    private String UPC;
    private String WholesalePrice;
    private String ImpactOnPrice;
    private String Ecotax;
    private String Quantity;
    private String MinimalQuantity;
    private String ImpactOnWeight;
    private String Default;
    private String CombinationAvailableDate;
    private String ImagePosition;
    private String ImageURL;
    private String DeleteExistingImages;
    private String IDNameOfShop;
    private String AdvancedStockManagment;
    private String DependsOnStock;
    private String Warehouse;

    public String getCSVFormat() {
        return CSVFormat;
    }
}
