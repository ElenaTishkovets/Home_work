package home_work_6;

import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    @Override
    /**
     * Метод считает сколько раз слово было использовано в тексте
     */
    public long search(String text, String word) {
        int index;
        int startOfSearching = 0;
        long counter = 0;

        while ((index = text.indexOf(" " + word + " ", startOfSearching)) != -1) {
            counter++;
            startOfSearching = index + 1;
        }
        return counter;
    }
}
