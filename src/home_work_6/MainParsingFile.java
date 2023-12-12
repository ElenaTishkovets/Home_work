package home_work_6;

import home_work_6.api.ISearchEngine;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

//Далее задания выполнять только после прохождения темы "Работа с файлами"
//7. Написать новый класс с точкой входа. При запуске программы пользователь должен передать адрес папки,
// из которой мы будет считывать текстовые файлы. Наполнить данную директорию книгами, 100 книг мнинимум.
// При запуске пользователю в консоль выдать список txt файлов и предложить выбрать файл, с которым мы будем работать.
// Пользователь, выбрав файл вводит то, что он хочет найти в этом файле. После каждого ввода осуществляется поиск.
// Вводит пока не надоест. Пользователь может вернуться к выбору файла. Результат всех его поисков должен накапливаться в
// файла result.txt в формате «Имя файла – слово – количество». Тестируем.


public class MainParsingFile {
    public static void main(String[] args) throws IOException {

        // String folderPath = "HomeWork\\src\\home_work_6\\books\\"; //адрес папки с книгами для примера

        //Начинаем работу с пользователем
        Scanner console = new Scanner(System.in);
        System.out.println("Для начала работы введите адрес папки с файлами:");
        String folderPath = console.nextLine(); //сохраняем адрес переданной папки

        ParsingFile parsingFile = new ParsingFile(); //создаем объект класса, в котором обрабатываеются файлы из переданной папки

        Map<Integer, String> result = parsingFile.createMapOfFiles(folderPath); // перерабатываем в Мар
        for (Map.Entry<Integer, String> entry : result.entrySet()) { // выводим на печать для выбора пользователем файла
            System.out.println(entry);
        }

        Scanner console1 = new Scanner(System.in);
        System.out.println();
        System.out.println("Папка обработана успешно. Выберите номер документа для продолжения работы:");

        Integer indexBook = console1.nextInt(); // Сохраняем введенное значение, будем использовать его как ключ в Мар
        String nameFile = result.get(indexBook); // Выводим в консоль имя выбранного файла
        System.out.println("Вы выбрали файл " + nameFile);

        String relativePath = folderPath + nameFile;//получаем относительный путь файла для продолжения работы

        Writer writer = new FileWriter("result.txt");//очищаем файл перед началом работы
        writer.close();

        while (true) {
            Scanner console2 = new Scanner(System.in);
            System.out.println("Введите значение для поиска: ");
            String search = console2.nextLine();//сохраняем строку, которую будем искать

            String textFile = Extractor.extractToString(relativePath);//прочитали и сохранили файл в строку
            ISearchEngine easySearch = new EasySearch();
            long resultOfSearch = easySearch.search(textFile, search);

            System.out.println("Результат поиска: " + resultOfSearch);

            String resultOfWork = parsingFile.saveSearchResult(nameFile, search, resultOfSearch);
            parsingFile.writeToFile("result.txt", resultOfWork);
        }
    }
}
