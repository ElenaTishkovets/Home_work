package home_work_1;

import java.util.Scanner;
import java.util.Obje

public class Home_work_1_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Как Вас зовут? ");
        String name = in.nextLine();

        boolean nameVasya = Objects.equals(name, "Вася");
        boolean nameAna = Objects.equals(name, "Анастасия");

        if (nameVasya) {
            System.out.println("Привет!\nЯ тебя так долго ждал");
        } else if (nameAna) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а Вы кто?");
        }
    }
}


class Home_work_1_6_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Как Вас зовут? ");
        String name = in.nextLine();

        boolean nameVasya = Objects.equals(name, "Вася");
        boolean nameAna = Objects.equals(name, "Анастасия");
        boolean nameDif = !("Анастасия".equals(name) && "Вася".equals(name));

        if (nameVasya) {
            System.out.println("Привет!\nЯ тебя так долго ждал");
        } else if (nameAna) {
            System.out.println("Я тебя так долго ждал");
        } else if (nameDif) {
            System.out.println("Добрый день, а Вы кто?");
        }
    }
}


class Home_work_1_6_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Как Вас зовут? ");
        String name = in.nextLine();

        switch (name) {
            case "Вася":
                System.out.println("Привет!\nЯ тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а Вы кто?");
                break;
        }
    }
}

