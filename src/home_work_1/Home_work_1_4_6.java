package home_work_1;

import java.util.Scanner;

public class Home_work_1_4_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = in.nextInt();
        // если его номер делится на 4, но при этом или не делится на 100,
        // или делится на 400.

        if (((year % 4 == 0) && (year%100 != 0)) || (year % 400==0))  {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }
}
