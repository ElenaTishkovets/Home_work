package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6_3Test {

    @Test
    public void welcom(){
        Task6_3 person3 = new Task6_3();
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал.", person3.welcom( "Вася"));
        Assertions.assertEquals("Я тебя так долго ждал.", person3.welcom("Анастасия"));
        Assertions.assertEquals("Добрый день, а вы кто?", person3.welcom("Елена"));
    }

}
