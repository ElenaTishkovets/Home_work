package home_work_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalWorking {
    private int age; // возраст от 1 до 15

    private String nick; // кличка

    public AnimalWorking(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }


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

    //создаем массив русских кличек
    private String[] arrayAnimalNick = new String[]{"Айс", "Аэро", "Арден", "Альф", "Алекс", "Арто", "Арчи", "Барни",
            "Барон", "Вилли", "Бруно", "Бинго", "Бумер", "Кэш", "Шеф", "Шериф", "Дизель", "Локи", "Дюк", "Феликс", "Фред",
            "Гизмо", "Джек", "Логан", "Локи", "Пеппер", "Поттер", "Руфус", "Римус", "Реми", "Рекс", "Рокси", "Орео",
            "Нельсон", "Микки", "Ник", "Ден", "Честер", "Хэнк", "Бони", "Клайд", "Лен", "Скуби", "Скай", "Тедди", "Вуди",
            "Тайсон", "Тесла", "Кузя", "Нафаня", "Алиса", "Ава", "Берта", "Бианка", "Карма", "Ленни", "Ариэль", "Мартина",
            "Марта", "Майя", "Ева", "Милка", "Маркиза", "Муля", "Мия", "Дора", "Прада", "Парди", "Ромашка", "Полли", "Пенелопа",
            "Салли", "Салти", "Оливия", "Николь", "Зена", "Зара", "Трикси", "Стелла", "Флора", "Фиона", "Фаня", "Лейла",
            "Тутси", "Симона", "Сайона", "Сима", "Мара", "Мона", "Тесса", "Смоки", "Лиза", "Лада", "Лана", "Дана", "Полли",
            "Элли", "Лили", "Софи", "Кики", "Лотта", "Мэгги", null};

    Random rnd = new Random();

    /**
     * Метод генерирует случайную кличку из массива
     *
     * @return случайная кличка
     */
    public String getNickFromArray() {
        return arrayAnimalNick[rnd.nextInt(arrayAnimalNick.length)];
    }

    public String getAnimalNickFromFile() throws IOException {
        ArrayList<String> nickList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("HomeWork\\src\\home_work_5\\AnimalNick.txt"));
        String read;
        while ((read = bufferedReader.readLine()) != null) {
            nickList.add(read);
        }
        return nickList.get(rnd.nextInt(nickList.size()));
    }

    /**
     * Метод генерирует случайный возраст в заданном пределе от 1 до 15
     * @return
     */
    public int getRandomAge() {
        int min = 1;
        int max = 15;
        int dif = max - min;
        int randomAge = rnd.nextInt(dif) + min;
        return randomAge;
    }

    public  List<AnimalWorking> getRandomAnimalsArrayList() throws IOException {
        ArrayList<AnimalWorking> randomAnimals = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            randomAnimals.add(new AnimalWorking(getRandomAge(), getAnimalNickFromFile()));
        }
        return randomAnimals;
    }

    @Override
    public String toString() {
        return " {age = " + age + ", nick = '" + nick + "'}";
    }
}





