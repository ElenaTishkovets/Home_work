package home_work_1;

// 4.3 Проверка делимости одного числа на другое
public class Task4_3 {

    /**
     * Метод проверяет делится ли одно число на другое
     * @param x случайное число 1
     * @param y случайное число 2
     * @return true если одно число делится на другое, false если числа не делятся
     */
    public boolean checkDivide(int x, int y) {
        if (x == 0 && y == 0) {             // исключает возможное деление на ноль
            return false ;
        }
        return y != 0 && x % y == 0 || y % x == 0;
    }
}