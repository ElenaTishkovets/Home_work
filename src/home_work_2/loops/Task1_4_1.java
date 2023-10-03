package home_work_2.loops;
/**
 * Проверка на переполнение после умножения на заданное число
 */
public class Task1_4_1 {
    public static void main(String[] args) {
        long a = 1L;
        long number = a;
        long multiplier = 3L;

        while (true) {
            number = a;
            a *= multiplier;

            // Проверяем на переполнение
            if (a < number) {
                System.out.println("Переполнение произошло!");
                break;
            }
        }
        System.out.println("Значение до переполнения: " + number);
        System.out.println("Значение после переполнения: " + a);
    }
}
