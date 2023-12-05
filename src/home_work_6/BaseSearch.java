package home_work_6;

import java.util.*;
import java.util.stream.Collectors;

public class BaseSearch {
    /**
     * Метод создает коллекцию HashSet
     * @param document
     * @return возвращает размер коллекции
     */
    public static int countWordsBySet(String document) {
        return new HashSet<String>(Spliter.splitBySpace(document)).size();
    }

    /**
     * Метод считает сколько раз было использовано слово
     * @param words
     * @return коллекцию Map
     */
    public static Map<String, Integer> getUnsortedMapOfFrequency(String words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : Spliter.splitBySpace(words)) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    /**
     * Метод заполняет коллекцию List из Map для сортировки по количеству
     * @param map
     * @return  Наиболее часто встречающиеся слова
     */
    public static List<Map.Entry<String, Integer>> getTopFromUnsortedMap(Map<String, Integer> map, int top) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue() > o2.getValue()) {
                    return -1;
                }
                if (o1.getValue() < o2.getValue()) {
                    return 1;
                }
                return 0;
            }
        });
        return list.stream()
                .limit(top)
                .collect(Collectors.toList());
    }
}


