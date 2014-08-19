package com.mockigbirdgames.thesaurus.main;

import com.mockigbirdgames.thesaurus.utils.Logger;
import com.mockigbirdgames.thesaurus.utils.SafeMap;

/**
 *
 * Created by ruslan on 19.08.14.
 */
public class Thesaurus {

    private static String language;
    private static SafeMap<String, ThesaurusData> vocabulary = new SafeMap<String, ThesaurusData>();

    public static String localize(String key) {
        ThesaurusData data = vocabulary.get(key, new ThesaurusData(key, null));
        return getLocalized(data) != null ? getLocalized(data) : key;
    }

    private static String getLocalized(ThesaurusData data) {
        if (language.equals("ru")) {
            return data.ru != null ? data.ru : data.en;
        } else {
            return data.en;
        }
    }

    public static void setLanguage(String lang) { language = lang; }

    public static String getLanguage() { return language; }

    public static void main(String[] args) {
        vocabulary.put("exit", new ThesaurusData("Exit", "Выход"));
        Thesaurus.setLanguage("ru");
        Logger.message(Thesaurus.localize("exit"));
    }
}
