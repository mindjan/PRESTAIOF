package tools.Translators.Helpers;

import models.IOF.FullStocks.Description.Description;
import models.IOF.FullStocks.Description.LongDescription;

/**
 * Created by root on 16.6.25.
 */
public class DescriptionParser {
    public void parseDescriptions(Description description){
        String parsedWords = "";

        for(LongDescription desc : description.getLongDescriptions()){
            parseOneDescription(desc);
        }

    }

    private void parseOneDescription(LongDescription description){
        String lang = description.getLanguage();
        String parsedSizesTable = description.getDescription().substring(description.getDescription().indexOf("<table"),
                description.getDescription().indexOf("</table>")+8);
        parsedSizesTable.replace("VELIKOST", "EU").replace("DÉLKA VLOŽKY(CM)", "CM");
        int a = 1;
    }

    private void writeToDescriptionFiles(String fileName, String words, String lang){

    }
}
