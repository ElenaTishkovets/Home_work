package home_work_2.loops;

public class Task1_6 {
    /**
     * Вывод таблицы умножения
     */
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i += 4) {
            for (int j = 1; j <= 9; j++) {
                for (int k = i; k < i + 4 && k <= 9; k++) {
                    System.out.printf("%-2d * %-2d = %-3d   ", k, j, k * j);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
