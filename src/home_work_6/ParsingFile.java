package home_work_6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class ParsingFile {
     /**
     * Метод распознает файлы в переданной папке, и сохраняет имена файлов в Мap
     *
     * @param path адрес папки с файлами
     * @return Map, где ключ - порядковый номер файла, значение - имя файла
     */
    public Map<Integer, String> createMapOfFiles(String path) {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        Map<Integer, String> mapOfBooks = new HashMap<>();
        int i = 1;
        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                mapOfBooks.put(i++, file.getName());
            }
        }
        return mapOfBooks;
    }

    /**
     * Метод сохраняет результат работы в требуемом виде
     * @param nameFile имя файла для поиска
     * @param word искомое слово
     * @param resultOfSearch количество повторений искомого слова в файле
     * @return результат поиска в виде строки
     */
    public String saveSearchResult(String nameFile, String word, long resultOfSearch) {
        StringBuilder builder = new StringBuilder();
        builder.append("Поиск по файлу: ")
                .append(nameFile)
                .append("  -- значения \" ")
                .append(word)
                .append(" \"  -- дал результат -- ")
                .append(resultOfSearch);
        return builder.toString();
    }

    /**
     * Метод записывает строку в файл
     * @param path адрес файла для записи
     * @param resultOfWork данные для записи
     */
    public void writeToFile(String path, String resultOfWork) {
        try (Writer writer = new FileWriter(path, true)) {

            writer.write(resultOfWork);
            writer.write("\n");
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
