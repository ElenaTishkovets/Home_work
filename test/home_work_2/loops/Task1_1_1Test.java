package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_1_1Test {
    @Test
    public void factorial() {
        Assertions.assertEquals("Произошло переполнение", Task1_1_1.factorial(20));
    }

    @Test
    public void factorial1() {
        Assertions.assertEquals("0", Task1_1_1.factorial(0));
    }

    @Test
    public void factorial2() {
        Assertions.assertEquals("1 = 1", Task1_1_1.factorial(1));

    }

    @Test
    public void factorial3() {
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 = 120", Task1_1_1.factorial(5));
    }
    @Test
    public void factorial4() {
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 = 39916800", Task1_1_1.factorial(11));
    }
    @Test
    public void factorial5() {
        Assertions.assertEquals("Пожалуйста, введите положительное число", Task1_1_1.factorial(-5));
    }

}
