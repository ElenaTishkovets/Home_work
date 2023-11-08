package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_6Test {

    @Test
    public void checkLeapYear() {
        Task4_6 checkInputYear = new Task4_6();
        Assertions.assertTrue(checkInputYear.checkLeapYear(2020)); //тестируем работу метода на год кратный 4
    }

    @Test
    public void checkLeapYear1() {
        Task4_6 checkInputYear1 = new Task4_6();
        Assertions.assertTrue(checkInputYear1.checkLeapYear(2000)); //тестируем работу метода на год, кратный 400 и 100
    }

    @Test
    public void checkLeapYear2() {
        Task4_6 checkInputYear2 = new Task4_6();
        Assertions.assertFalse(checkInputYear2.checkLeapYear(2100)); //тестируем работу метода на год, кратный 100
    }
}