package home_work_1;

import java.util.Scanner;

public class Home_work_1_4_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int a = in.nextInt();
        in.nextLine();
        System.out.print("Введите единицу измерения (байт или Кбайт): ");
        String b = in.nextLine();

        if (b.equals("байт")) {
            System.out.println(a / 1024 + " Кбайт");
        } else {
            System.out.println(a * 1024 + " байт");
        }
    }
}
