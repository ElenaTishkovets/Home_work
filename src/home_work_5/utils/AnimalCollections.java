package home_work_5.utils;

import home_work_5.AnimalWorking;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AnimalCollections {
    private static Random rnd = new Random();

    /**
     * Метод генерирует случайную кличку животного из переданного файла
     *
     * @return случайную кличку
     * @throws IOException
     */
    public static String getAnimalNickFromFile() throws IOException {
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
     *
     * @return
     */
    public static int getRandomAge() {
        int min = 1;
        int max = 15;
        int dif = max - min;
        int randomAge = rnd.nextInt(dif) + min;
        return randomAge;
    }

    /**
     * Метод генерирует коллекцию, со случайными параметрами
     *
     * @return коллекцию ArrayList
     * @throws IOException
     */
    public static List<AnimalWorking> getRandomAnimalsArrayList() throws IOException {
        ArrayList<AnimalWorking> randomAnimals = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            randomAnimals.add(new AnimalWorking(getRandomAge(), getAnimalNickFromFile()));
        }
        return randomAnimals;
    }


    /**
     * Метод генерирует коллекцию, со случайными параметрами
     *
     * @return коллекцию LinkedList
     * @throws IOException
     */
    public static List<AnimalWorking> getRandomAnimalLinkedList() throws IOException {
        LinkedList<AnimalWorking> randomAnimals = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            randomAnimals.add(new AnimalWorking(getRandomAge(), getAnimalNickFromFile()));
        }
        return randomAnimals;
    }

    /**
     * Метод генерирует коллекцию, со случайными параметрами
     *
     * @return коллекцию HashSet
     * @throws IOException
     */
    public static Set<AnimalWorking> getRandomAnimalHashSet() throws IOException {
        HashSet<AnimalWorking> randomAnimals = new HashSet<>();
        for (int i = 0; i < 100000; i++) {
            randomAnimals.add(new AnimalWorking(getRandomAge(), getAnimalNickFromFile()));
        }
        return randomAnimals;
    }
    /**
     * Метод генерирует коллекцию, со случайными параметрами
     *
     * @return коллекцию TreeSet
     * @throws IOException
     */
    public static Set<AnimalWorking> getRandomAnimalTreeSet() throws IOException {
        TreeSet<AnimalWorking> randomAnimals = new TreeSet<>();
        for (int i = 0; i < 100000; i++) {
            randomAnimals.add(new AnimalWorking(getRandomAge(), getAnimalNickFromFile()));
        }
        return randomAnimals;
    }
}


