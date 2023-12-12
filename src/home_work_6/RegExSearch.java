package home_work_6;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    private boolean ignoreCase;

    public RegExSearch(boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
    }

    @Override
    public long search(String text, String word) {
        long counter = 0;

//    Код писал Сергей на 17 джаве, на 11 он не работает
//        String patternRaw = "(" +
//                "(?<=[^-\\w]-+)" +    // не буква + любое количество тире
//                "|" +
//                "(?<=\\s-{1,})" +   // пробел + любое количество тире
//                "|" +
//                "(?<=^-{1,})" +     // начало строки + любое количество тире
//                "|" +
//                "(?<=\\s)" +        // пробел
//                "|" +
//                "(?<![\\w-])" +     // не буква и не тире
//                ")" +
//                word +
//                "(" +
//                "(?=-+[^-\\w])" +     // любое количество тире + не буква
//                "|" +
//                "(?=-{1,}\\s)" +    // любое количество тире + пробел
//                "|" +
//                "(?=-{1,}$)" +      // любое количество тире + конец строки
//                "| " +
//                "(?=\\s) " +        // пробел
//                "|" +
//                "(?![\\w-])" +      //не буква и не тире
//                ")";

        String patternRaw2 = "(?<=^|[^а-яА-ЯёЁ\\w-]|(?<=^|[^а-яА-ЯёЁ\\w])-)" + word + "(?=-([^а-яА-ЯёЁ\\w]|$)|[^а-яА-ЯёЁ\\w-]|$)";

        String patternRaw3 = "\\b" + word + "\\b";

        int flags;
        if (ignoreCase) {
            flags = Pattern.UNICODE_CHARACTER_CLASS | Pattern.CASE_INSENSITIVE;
        } else {
            flags = Pattern.UNICODE_CHARACTER_CLASS;
        }

        Pattern pattern = Pattern.compile(patternRaw2, flags);

        Matcher matcher = pattern.matcher(text);//устройство сканирования или тепловизор

        while (matcher.find()) {
            counter++;
        }

        return counter;
    }

    public void setIgnoreCase(boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
    }

}
