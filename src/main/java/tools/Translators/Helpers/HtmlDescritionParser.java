package tools.Translators.Helpers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mindaugas on 16.7.22.
 */
public class HtmlDescritionParser {

    private Set<String> Description = new HashSet<String>();

    public void parseHtmlDescription(String description) throws IOException {
        Document doc = Jsoup.parse(description);

        removeHtmlAttributes(doc);

        Elements paragraphs = doc.select("p");
        Elements tableElements = doc.select("span");

        processDescriptions(paragraphs);
        processTables(tableElements);

        appendToDTranslationsCsv(Description);
    }

    private void processTables(Elements tables){
        for (Element element:tables) {
            Description.add(element.text().replaceAll("\\d",""));
        }
    }

    private void processDescriptions(Elements descriptions){
        for (Element element : descriptions) {
            if(element.text().contains(":")){
                String[] spited = element.text().replaceAll("\\d","").split(":");
                if(spited[0].length() > 1 && spited[0].substring(0, 1) == " "){
                    spited[0] = spited[0].substring(1);
                }
                if(spited[1].length() > 1 && spited[1].substring(0, 1) == " "){
                    spited[1] = spited[1].substring(1);
                }
                Description.add(spited[0]);
                Description.add(spited[1]);
            }
            else{
               // Description.add(element.text());
            }
        }
    }

    private void appendToDTranslationsCsv(Set<String> Description) throws IOException {
        FileWriter fw = new FileWriter("translations.csv");

        for (String description : Description) {
            fw.write(description+"\n");
        }

        fw.close();
    }

    public String processDescription(String description){
        Document doc = Jsoup.parse(description);

        removeHtmlAttributes(doc);

        return doc.outerHtml().replaceAll("\\n", "").replaceAll(";", "").replaceAll("&nbsp", "");
    }

    private void removeHtmlAttributes(Document doc){
        Elements el = doc.getAllElements();
        for (Element e : el) {
            Attributes at = e.attributes();
            for (Attribute a : at) {
                e.removeAttr(a.getKey());
            }
        }
    }
}
