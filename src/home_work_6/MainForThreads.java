package home_work_6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.*;

//Далее задания выполнять только после прохождения темы "Многопоточное программирование"
//8. Написать новый класс с точкой входа. При запуске программы пользователь должен передать адрес папки,
// из которой мы будет считывать текстовые файлы. После запуска пользователь указывает что он хочет найти в этих текстах.
// После каждого ввода осуществляется поиск. Вводит пока не надоест. Поиск выполняется многопоточно.
// Один файл – одно задание для поиска. Задания помещаются в ExecutorService.
// Результат всех его поисков должен накапливаться в файла result.txt в формате «Имя файла – слово – количество».
// После заверщение обработки всех книг вывести записанные результаты в файла result.txt;
// Тестируем
public class MainForThreads {
    public static void main(String[] args) throws IOException, InterruptedException {

        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        CountDownLatch latch = new CountDownLatch(100);

        // String path = "HomeWork\\src\\home_work_6\\books\\"; //адрес папки с книгами для примера

        //Начинаем работу с пользователем
        Scanner console = new Scanner(System.in); //Начинаем работу с пользователем
        System.out.println("Для начала работы введите адрес папки с файлами:");
        String path = console.nextLine(); //сохраняем адрес переданной папки

        while (true) {
            System.out.println("Введите значение для поиска: ");
            String search = console.nextLine();//сохраняем строку, которую будем искать во всех файлах

            ParsingFile parsingFile = new ParsingFile(); // создали объект для вызова методов работы с файлами
            Map<Integer, String> mapOfBooks = parsingFile.createMapOfFiles(path);// обработали папку и создали коллекцию из файлов,
//начинаем перебирать коллекцию и отдавать элементы коллекции потокам в работу

            try (Writer writer = new FileWriter("result.txt")) {
                List<Future<String>> futures = new ArrayList<>();
                for (Map.Entry<Integer, String> entry : mapOfBooks.entrySet()) {
                    String nameFile = entry.getValue();//сохраняем имя файла (значение в нашей коллекции)

                    String relativePath = path + nameFile;// получаем относительный путь

                    futures.add(executorService.submit(new ParsingFileForThreads(relativePath, search, latch, nameFile)));
                }
                latch.await();

                for (Future<String> future : futures) {
                    String result = future.get();
                    writer.write(result);
                    writer.write("\n");
                }
                writer.flush();

            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
