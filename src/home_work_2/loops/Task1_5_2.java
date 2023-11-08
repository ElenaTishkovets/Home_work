package home_work_2.loops;

import java.util.Random;
/**
 * Определение вероятности выпадения четных чисел
 */
public class Task1_5_2 {
    public static void main(String[] args) {

        int totalNumbers = 1000;
        int evenCount = 0;

        Random rnd = new Random();

        for (int i = 0; i < totalNumbers; i++) {
            int randomNumber = rnd.nextInt();
            if (randomNumber % 2 == 0) {
                evenCount++;
            }
        }
        double probabilityOfEvenNumbers = (double) evenCount / totalNumbers;
        System.out.println("Вероятность выпадения четных чисел: " + probabilityOfEvenNumbers);
    }
}
