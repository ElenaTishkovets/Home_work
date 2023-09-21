package home_work_1;

import java.util.Scanner;

public class Home_work_1_4_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите любое целое число: ");
        int a = in.nextInt();

        if (a % 2 == 1) {
            System.out.println(a + " - Нечетное число");
        } else {
            System.out.println(a + " - не является нечетным числом");
        }

    }
}
