package home_work_1;
//        4.2 Среди трёх чисел найти среднее
public class Task4_2 {

    /**
     * Метод ищет среднее число среди трех заданных
     *
     * @param x число 1
     * @param y число 2
     * @param z число 3
     * @return среднее число
     */
    public int findOverageNumber(int x, int y, int z) {
        if (x <= z && x >= y || x < y && x > z) {
            return x;
        } else if (y < z && y > x || y < x && y > z) {
            return y;
        } else {
            return z;
        }
    }
}


