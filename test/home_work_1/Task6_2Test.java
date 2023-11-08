package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6_2Test {

    @Test
    public void welcom(){
        Task6_2 person2 = new Task6_2();
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал.", person2.welcom( "Вася"));
        Assertions.assertEquals("Я тебя так долго ждал.", person2.welcom("Анастасия"));
        Assertions.assertEquals("Добрый день, а вы кто?", person2.welcom("Елена"));
    }

}
