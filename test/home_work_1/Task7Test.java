package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task7Test {

    @Test
    public void createPhoneNumber() {
        Assertions.assertEquals("(123) 456-7890", Task7.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void createPhoneNumber2() {
        Assertions.assertEquals("(123) 456-7890", Task7.createPhoneNumber2(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}