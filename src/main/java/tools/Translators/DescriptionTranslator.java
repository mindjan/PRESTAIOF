package tools.Translators;

import models.Translation;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.*;

/**
 * Created by m.jankus on 2016-06-18.
 */
public class DescriptionTranslator {
    Map<String, String> translations = new HashMap<String, String>();

    public DescriptionTranslator() throws IOException {
        loadTranslations();
    }

    public String translateDescription(String description){
        Document doc = Jsoup.parse(description);
        removeHtmlAttributes(doc);
        String translated = trancslateEverything(doc.outerHtml());
        return translated;
    }

    private String trancslateEverything(String description){
        for (String key:translations.keySet()) {
            description.replaceAll(key, translations.get(key));
        }
        return description;
    }

    private void loadTranslations() throws IOException {
        FileInputStream fis = new FileInputStream("/home/mindaugas/Projects/PRESTAIOF/src/main/resources/translations.csv");

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;
        while ((line = br.readLine()) != null) {
            if (line.contains(">>>")) {
                String[] translationsSplitted = line.split(">>>");
                translations.put(translationsSplitted[0], translationsSplitted[1]);
            }
        }

        br.close();
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
