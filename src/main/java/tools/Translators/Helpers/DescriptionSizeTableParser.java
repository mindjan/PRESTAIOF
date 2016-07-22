package tools.Translators.Helpers;

import models.CSVExport.ProductsCSV;
import models.IOF.FullStocks.Description.Description;
import models.IOF.FullStocks.Description.LongDescription;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by root on 16.6.25.
 */
public class DescriptionSizeTableParser {
    HtmlDescritionParser dstp = new HtmlDescritionParser();

    public void parseDescriptions(Description description) throws IOException {
        String parsedWords = "";

        for(LongDescription desc : description.getLongDescriptions()){
            parseOneDescription(desc);
        }

    }

    private void parseOneDescription(LongDescription description) throws IOException {

        String lang = description.getLanguage();

        if (lang.equalsIgnoreCase("pol")) {
            dstp.parseHtmlDescription(description.getDescription());
        }
    }
}
