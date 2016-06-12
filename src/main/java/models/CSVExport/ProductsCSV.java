package models.CSVExport;

/**
 * Created by Mindaugas on 6/11/2016.
 */
public class ProductsCSV {
    private String CSVFormat = "ID;Active (0/1);Name *;Categories (x,y,z...);Price tax excluded or Price tax included;Tax rules ID;Wholesale price;On sale (0/1);Discount amount;Discount percent;" +
            "Discount from (yyyy-mm-dd);Discount to (yyyy-mm-dd);Reference #;Supplier reference #;Supplier;Manufacturer;EAN13;UPC;Ecotax;Width;Height;Depth;Weight;Quantity;Minimal quantity;Visibility;" +
            "Additional shipping cost;Unity;Unit price;Short description;Description;Tags (x,y,z...);Meta title;Meta keywords;Meta description;URL rewritten;Text when in stock;Text when backorder allowed;" +
            "Available for order (0 = No, 1 = Yes);Product available date;Product creation date;Show price (0 = No, 1 = Yes);Image URLs (x,y,z...);Delete existing images (0 = No, 1 = Yes);" +
            "Feature(Name:Value:Position);Available online only (0 = No, 1 = Yes);Condition;Customizable (0 = No, 1 = Yes);Uploadable files (0 = No, 1 = Yes);" +
            "Text fields (0 = No, 1 = Yes);Out of stock;ID / Name of shop;Advanced stock management;Depends On Stock;Warehouse";

    private String ID = "";
    private String Active = "";
    private String Name = "";
    private String Categories = "";
    private String Price = "";
    private String TaxRulesID = "";
    private String WholesalePrice = "";
    private String OnSale = "";
    private String DiscountAmmount = "";
    private String DiscountPOercent = "";
    private String DiscountFrom = "";
    private String DiscountTo = "";
    private String SupplyerReference = "";
    private String Supplier = "";
    private String Manufacturer = "";
    private String EAN13 = "";
    private String UPC = "";
    private String EcoTax = "";
    private String Width = "";
    private String Height = "";
    private String Depth = "";
    private String Weight = "";
    private String Quantity = "";
    private String MinimalQuantity = "";
    private String Visability = "";
    private String AdditionalShoppingCost = "";
    private String Unity = "";
    private String UnitPrice = "";
    private String ShortDescription = "";
    private String Description = "";
    private String Tags = "";
    private String MetaTitle = "";
    private String MetaKeywords = "";
    private String MetaDescription = "";
    private String UrlRewritten = "";
    private String TextWhenInStock = "";
    private String TextWhenBackorderAllowed = "";
    private String AvailableForOrder = "";
    private String ProductAvailableDate = "";
    private String ProductCreationDate = "";
    private String ShowPrice = "";
    private String ImageUrls = "";
    private String DeleteExistingImages = "";
    private String Feature = "";
    private String AvailableOnlineOnly = "";
    private String Condition = "";
    private String Customizable = "";
    private String UploadableFiles = "";
    private String TextFields = "";
    private String OutOfStock = "";
    private String IDORNameOfShop = "";
    private String AdvancedStockManagement = "";
    private String DependsOnStock = "";
    private String Warehouse = "";




    public String getCSVFormat() {
        return CSVFormat;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategories() {
        return Categories;
    }

    public void setCategories(String categories) {
        Categories = categories;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getTaxRulesID() {
        return TaxRulesID;
    }

    public void setTaxRulesID(String taxRulesID) {
        TaxRulesID = taxRulesID;
    }

    public String getWholesalePrice() {
        return WholesalePrice;
    }

    public void setWholesalePrice(String wholesalePrice) {
        WholesalePrice = wholesalePrice;
    }

    public String getOnSale() {
        return OnSale;
    }

    public void setOnSale(String onSale) {
        OnSale = onSale;
    }

    public String getDiscountAmmount() {
        return DiscountAmmount;
    }

    public void setDiscountAmmount(String discountAmmount) {
        DiscountAmmount = discountAmmount;
    }

    public String getDiscountPOercent() {
        return DiscountPOercent;
    }

    public void setDiscountPOercent(String discountPOercent) {
        DiscountPOercent = discountPOercent;
    }

    public String getDiscountFrom() {
        return DiscountFrom;
    }

    public void setDiscountFrom(String discountFrom) {
        DiscountFrom = discountFrom;
    }

    public String getDiscountTo() {
        return DiscountTo;
    }

    public void setDiscountTo(String discountTo) {
        DiscountTo = discountTo;
    }

    public String getSupplyerReference() {
        return SupplyerReference;
    }

    public void setSupplyerReference(String supplyerReference) {
        SupplyerReference = supplyerReference;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String supplier) {
        Supplier = supplier;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getEAN13() {
        return EAN13;
    }

    public void setEAN13(String EAN13) {
        this.EAN13 = EAN13;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public String getEcoTax() {
        return EcoTax;
    }

    public void setEcoTax(String ecoTax) {
        EcoTax = ecoTax;
    }

    public String getWidth() {
        return Width;
    }

    public void setWidth(String width) {
        Width = width;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        Height = height;
    }

    public String getDepth() {
        return Depth;
    }

    public void setDepth(String depth) {
        Depth = depth;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getMinimalQuantity() {
        return MinimalQuantity;
    }

    public void setMinimalQuantity(String minimalQuantity) {
        MinimalQuantity = minimalQuantity;
    }

    public String getVisability() {
        return Visability;
    }

    public void setVisability(String visability) {
        Visability = visability;
    }

    public String getAdditionalShoppingCost() {
        return AdditionalShoppingCost;
    }

    public void setAdditionalShoppingCost(String additionalShoppingCost) {
        AdditionalShoppingCost = additionalShoppingCost;
    }

    public String getUnity() {
        return Unity;
    }

    public void setUnity(String unity) {
        Unity = unity;
    }

    public String getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        UnitPrice = unitPrice;
    }

    public String getShortDescription() {
        return ShortDescription;
    }

    public void setShortDescription(String shortDescription) {
        ShortDescription = shortDescription;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTags() {
        return Tags;
    }

    public void setTags(String tags) {
        Tags = tags;
    }

    public String getMetaTitle() {
        return MetaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        MetaTitle = metaTitle;
    }

    public String getMetaKeywords() {
        return MetaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        MetaKeywords = metaKeywords;
    }

    public String getMetaDescription() {
        return MetaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        MetaDescription = metaDescription;
    }

    public String getUrlRewritten() {
        return UrlRewritten;
    }

    public void setUrlRewritten(String urlRewritten) {
        UrlRewritten = urlRewritten;
    }

    public String getTextWhenInStock() {
        return TextWhenInStock;
    }

    public void setTextWhenInStock(String textWhenInStock) {
        TextWhenInStock = textWhenInStock;
    }

    public String getTextWhenBackorderAllowed() {
        return TextWhenBackorderAllowed;
    }

    public void setTextWhenBackorderAllowed(String textWhenBackorderAllowed) {
        TextWhenBackorderAllowed = textWhenBackorderAllowed;
    }

    public String getAvailableForOrder() {
        return AvailableForOrder;
    }

    public void setAvailableForOrder(String availableForOrder) {
        AvailableForOrder = availableForOrder;
    }

    public String getProductAvailableDate() {
        return ProductAvailableDate;
    }

    public void setProductAvailableDate(String productAvailableDate) {
        ProductAvailableDate = productAvailableDate;
    }

    public String getProductCreationDate() {
        return ProductCreationDate;
    }

    public void setProductCreationDate(String productCreationDate) {
        ProductCreationDate = productCreationDate;
    }

    public String getShowPrice() {
        return ShowPrice;
    }

    public void setShowPrice(String showPrice) {
        ShowPrice = showPrice;
    }

    public String getImageUrls() {
        return ImageUrls;
    }

    public void setImageUrls(String imageUrls) {
        ImageUrls = imageUrls;
    }

    public String getDeleteExistingImages() {
        return DeleteExistingImages;
    }

    public void setDeleteExistingImages(String deleteExistingImages) {
        DeleteExistingImages = deleteExistingImages;
    }

    public String getFeature() {
        return Feature;
    }

    public void setFeature(String feature) {
        Feature = feature;
    }

    public String getAvailableOnlineOnly() {
        return AvailableOnlineOnly;
    }

    public void setAvailableOnlineOnly(String availableOnlineOnly) {
        AvailableOnlineOnly = availableOnlineOnly;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public String getCustomizable() {
        return Customizable;
    }

    public void setCustomizable(String customizable) {
        Customizable = customizable;
    }

    public String getUploadableFiles() {
        return UploadableFiles;
    }

    public void setUploadableFiles(String uploadableFiles) {
        UploadableFiles = uploadableFiles;
    }

    public String getTextFields() {
        return TextFields;
    }

    public void setTextFields(String textFields) {
        TextFields = textFields;
    }

    public String getOutOfStock() {
        return OutOfStock;
    }

    public void setOutOfStock(String outOfStock) {
        OutOfStock = outOfStock;
    }

    public String getIDORNameOfShop() {
        return IDORNameOfShop;
    }

    public void setIDORNameOfShop(String IDORNameOfShop) {
        this.IDORNameOfShop = IDORNameOfShop;
    }

    public String getAdvancedStockManagement() {
        return AdvancedStockManagement;
    }

    public void setAdvancedStockManagement(String advancedStockManagement) {
        AdvancedStockManagement = advancedStockManagement;
    }

    public String getDependsOnStock() {
        return DependsOnStock;
    }

    public void setDependsOnStock(String dependsOnStock) {
        DependsOnStock = dependsOnStock;
    }

    public String getWarehouse() {
        return Warehouse;
    }

    public void setWarehouse(String warehouse) {
        Warehouse = warehouse;
    }
}
