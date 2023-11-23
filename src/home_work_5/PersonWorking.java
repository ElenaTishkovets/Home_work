package home_work_5;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class PersonWorking {
    private String nick; // псевдоним пользователя

   private String password; // пароль пользователя с длиной от 5 до 10 символов

    private String name; // имя пользователя

    /**
     * Метод генерирует строку из случайных символов на основе символов таблицы Unicode
     *
     * @return строку из случайных символов размером 20 символов
     */
    public String generateRandomString() {

        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            Random rnd = new Random();
            char char1 = (char) rnd.nextInt();
            randomString.append(char1);
        }
        return randomString.toString();
    }


    /**
     * Метод генерирует строку из русских букв на основе символов таблицы Unicode
     *
     * @return строку из случайных русских букв размером 20 символов
     */
    public String generateRandomRussianString() {

        StringBuilder randomRussianString = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            int min = 1040;
            int max = 1103;
            int dif = max - min;
            Random rnd = new Random();
            char char1 = (char) (rnd.nextInt(dif) + min);
            randomRussianString.append(char1);
        }
        return randomRussianString.toString();
    }

    //формируем массив русских имен
    private String[] arrayRussianNames = new String[]{"Анна", "Мария", "Екатерина", "Ольга", "Татьяна", "Ирина", "Елена", "Светлана", "Наталья", "Виктория",
            "Алёна", "Алина", "Дарья", "Полина", "Ангелина", "Валерия", "Евгения", "Юлия", "Милана", "София",
            "Ксения", "Вероника", "Владислава", "Арина", "Анжела", "Амина", "Инна", "Майя", "Регина", "Кристина",
            "Карина", "Любовь", "Маргарита", "Злата", "Роза", "Эльза", "Эмма", "Лариса", "Марина", "Илона",
            "Анисья", "Артемида", "Диана", "Эвелина", "Жанна", "Изабелла", "Софья", "Таисия", "Ульяна", "Христина", "Александр", "Дмитрий", "Михаил", "Иван", "Сергей", "Андрей", "Юрий", "Николай", "Павел", "Владимир",
            "Артем", "Максим", "Егор", "Игорь", "Денис", "Станислав", "Кирилл", "Тимофей", "Алексей", "Роман",
            "Василий", "Никита", "Олег", "Вадим", "Глеб", "Вячеслав", "Илья", "Арсений", "Евгений", "Константин",
            "Леонид", "Петр", "Федор", "Антон", "Георгий", "Марк", "Аркадий", "Валентин", "Виталий", "Григорий",
            "Даниил", "Ефим", "Захар", "Исаак", "Клим", "Лев", "Мирон", "Платон", "Руслан", "Савелий", null};
    Random rnd = new Random();

    /**
     * Метод генерирует случайное имя из массива русских имен
     *
     * @return случайное имя
     */
    public String getNameFromArray() {
        return arrayRussianNames[rnd.nextInt(arrayRussianNames.length)];
    }

    /**
     * Метод генерирует случайное имя, полученное из файла
      * @return сгенерированное имя
     * @throws IOException
     */
    public String getNameFromFile() throws IOException {
        ArrayList<String> nameList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("HomeWork\\src\\home_work_5\\RussianNames.txt"));
        String read;
        while ((read = bufferedReader.readLine()) != null) {
            nameList.add(read);
        }
        return nameList.get(rnd.nextInt(nameList.size()));
    }

    /**
     * Метод генерирует строку из случайных символов на основе символов таблицы Unicode
     *
     * @return строку из случайных символов размером 20 символов
     */

    public String generateRandomStringForPersonNick() {
        return generateRandomString();
    }

    /**
     * Метод генерирует строку из английских букв на основе символов таблицы Unicode
     *
     * @return строку из случайных русских букв размером 20 символов
     */
    public String generateRandomEnglishStringForPersonNick() {

        StringBuilder randomEnglishString = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            int min = 97;
            int max = 122;
            int dif = max - min;
            Random rnd = new Random();
            char char1 = (char) (rnd.nextInt(dif) + min);
            randomEnglishString.append(char1);
        }
        return randomEnglishString.toString();
    }

    /**
     * Метод генерирует случайный псевдоним, полученный из файла
     * @return сгенерированный псевдоним
     * @throws IOException
     */
    public String getPersonNickFromFile() throws IOException {
        ArrayList<String> nameList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("HomeWork\\src\\home_work_5\\PersonNick.txt"));
        String read;
        while ((read = bufferedReader.readLine()) != null) {
            nameList.add(read);
        }
        return nameList.get(rnd.nextInt(nameList.size()));
    }





}
