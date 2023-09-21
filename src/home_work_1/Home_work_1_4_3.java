package home_work_1;

public class Home_work_1_4_3 {


    public static void main(String[] args) {

        int x = (int) (Math.random() * 100) + 1;
        int y = (int) (Math.random() * 100) + 1;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


        if (x % y == 0) {
            System.out.println(x + " делится на " + y + " без остатка");
        } else {
            if (y % x == 0) {
                System.out.println(y + " делится на " + x + " без остатка");
            } else {
                System.out.println("Числа на делятся без остатка");
            }
        }
    }
}