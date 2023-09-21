package home_work_1;

public class Home_work_1_4_2 {
    public static void main(String[] args) {

        int x = (int) (Math.random() * 100) + 1;
        int y = (int) (Math.random() * 100) + 1;
        int z = (int) (Math.random() * 100) + 1;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        if (x > y) {
            if (x < z) {
                System.out.println(x + " среднее число");
            } else if (y > z) {
                System.out.println(y + " среднее число");
            } else if (z < x) {
                System.out.println(z + " среднее число");
            }
        } else if (x > z) {
            System.out.println(x + " среднее число");
        } else if (y > z) {
            System.out.println(z + " среднее число");
        } else if (x > z) {
            System.out.println(x + " среднее число");
        } else {
            System.out.println(y + " среднее число");
        }
    }
}
