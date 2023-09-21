package home_work_1;

import java.util.Scanner;

public class Home_work_1_4_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите значение и программа определит, Вы ввели букву или иной символ: ");
        char a = in.next().charAt(0);

        if (Character.isLetter(a)) {
            System.out.println("Вы ввели букву");
        } else {
            System.out.println("Вы ввели иной символ.");
        }
    }
}
