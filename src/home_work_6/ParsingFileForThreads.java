package home_work_6;

import home_work_6.api.ISearchEngine;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class ParsingFileForThreads implements Callable {
    private final String nameFile;
    private final String relativePath;

    private final String searchString;

    private final CountDownLatch latch;

    public ParsingFileForThreads(String relativePath, String searchString, CountDownLatch latch, String nameFile) {
        this.relativePath = relativePath;
        this.searchString = searchString;
        this.latch = latch;
        this.nameFile = nameFile;
    }

    @Override
    /**
     * Метод передает работу для потока
     * Возвращает строку
     */
    public String call() {
        try {
            long resultOfSearch = 0;
            String textFile = Extractor.extractToString(relativePath);//прочитали и сохранили файл в строку
            ISearchEngine easySearch = new EasySearch();//создаем объект класса, который умеет искать
            resultOfSearch = easySearch.search(textFile, searchString);//запускаем поиск
            ParsingFile parsingFile = new ParsingFile();
            String resultOfWork = parsingFile.saveSearchResult(nameFile, searchString, resultOfSearch);
            return resultOfWork;
        } finally {
            latch.countDown();
        }
    }
}
