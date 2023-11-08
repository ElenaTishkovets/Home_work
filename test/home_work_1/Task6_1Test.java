package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6_1Test {

    @Test
    public void welcom(){
        Task6_1 person1 = new Task6_1();
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал.", person1.welcom( "Вася"));
        Assertions.assertEquals("Я тебя так долго ждал.", person1.welcom("Анастасия"));
        Assertions.assertEquals("Добрый день, а вы кто?", person1.welcom("Елена"));
    }

}
