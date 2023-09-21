package home_work_1;

public class Home_work_1_3 {
    public static void main(String[] args) {

        // Вычислить площадь круга с округлением до целого числа
        int r = 10;
        int s = (int) Math.round(Math.PI * (Math.pow(r, 2)));
        System.out.println(s);


        // Вывод случайного числа от 1 до 100 и его проверка на четность
        int x = (int) (Math.random() * 100) + 1;
        if (x % 2 == 0) {
            System.out.println(x + " - Четное число");
        } else {
            System.out.println(x + " - Нечетное число");
        }
    }
}
