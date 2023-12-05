package home_work_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spliter {
    /**
     * Метод делит документ на подстроки по пробелу и сохранает их в массив строк, создает коллекцию и заполняет ее элементами массива
     *
     * @param document
     * @return коллекцию
     */
    public static List<String> splitBySpace(String document) {
        String[] words = document.split("\\s+");
        return new ArrayList<>(Arrays.asList(words));
    }
}
