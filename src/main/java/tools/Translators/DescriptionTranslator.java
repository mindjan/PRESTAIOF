package tools.Translators;

import models.Translation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by m.jankus on 2016-06-18.
 */
public class DescriptionTranslator {
    private List<Translation> translations;

    private void load(){
        translations.add(new Translation("Rozmiary", "Išmiera"));
        translations.add(new Translation("Dł. wkładki", "Ilgis"));
        translations.add(new Translation("Materiał", "Medžiaga"));
        translations.add(new Translation("*niniejsza tabela przedstawia przybliżone wartości", "* Lentelėje nurodyti apytiksliai dydžiai"));
        translations.add(new Translation("tekstylny", "tekstilės"));
    }

    public List<Translation> getTranslations() {
        return translations;
    }

    public void setTranslations(List<Translation> translations) {
        this.translations = translations;
    }
}
