package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_1_2Test {
    @Test
    public void factorialRecursion() {
        Assertions.assertEquals("Произошло переполнение", Task1_1_2.factorialRecursion(20));
    }

    @Test
    public void factorialRecursion1() {
        Assertions.assertEquals("0", Task1_1_2.factorialRecursion(0));
    }

    @Test
    public void factorialRecursion2() {
        Assertions.assertEquals("1 = 1", Task1_1_2.factorialRecursion(1));

    }

    @Test
    public void factorialRecursion3() {
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 = 120", Task1_1_2.factorialRecursion(5));
    }

    @Test
    public void factorialRecursion4() {
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 = 39916800", Task1_1_2.factorialRecursion(11));
    }

    @Test
    public void factorialRecursion5() {
        Assertions.assertEquals("Пожалуйста, введите положительное число", Task1_1_2.factorialRecursion(-5));
    }

}
