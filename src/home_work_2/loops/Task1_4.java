package home_work_2.loops;

//1.4.* Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением до переполнения и после переполнения. Умножать на:
//        1.4.1. 3
//        1.4.2. 188
//        1.4.3. -19
//        1.4.4. Да и вообще на любое целочисленное
public class Task1_4 {
    /**
     * Метод производит умножение на указанное число, пока не произойдет переполнение
     * @param multiple множитель
     * @return значение до и после переполнения
     */
    public static String overFlow(long multiple) {
        if (multiple==0){
            return "Переполнение недостежимо";
        }
        long a = 1;

        boolean overflow;
        long prev = a;
        long next = 0;

        do {
            overflow = true;

            try {
                next = Math.multiplyExact(prev, multiple);
                prev = next;
            } catch (ArithmeticException e) {
                next = prev * multiple;
                overflow = false;
            }
        } while (overflow);

        return "Произошло переполнение. Предыдущее значение: " + prev + ". Значение после переполнения: " + next;
    }
}
