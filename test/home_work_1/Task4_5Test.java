package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_5Test {

    @Test
    public void identifyChar() {
        Task4_5 checkInputChar = new Task4_5();
        Assertions.assertEquals("Это английский символ", checkInputChar.identifyChar('d'));   //тестируем работу метода на случайных символах
    }

    @Test
    public void identifyChar1() {
        Task4_5 checkInputChar1 = new Task4_5();
        Assertions.assertEquals("Это английский символ", checkInputChar1.identifyChar('Z'));   //тестируем работу метода на случайных символах
    }

    @Test
    public void identifyChar2() {
        Task4_5 checkInputChar2 = new Task4_5();
        Assertions.assertEquals("Это русский символ", checkInputChar2.identifyChar('я'));   //тестируем работу метода на случайных символах
    }

    @Test
    public void identifyChar3() {
        Task4_5 checkInputChar3 = new Task4_5();
        Assertions.assertEquals("Это русский символ", checkInputChar3.identifyChar('Ё'));   //тестируем работу метода на случайных символах
    }

    @Test
    public void identifyChar4() {
        Task4_5 checkInputChar4 = new Task4_5();
        Assertions.assertEquals("Это иной символ", checkInputChar4.identifyChar(' '));   //тестируем работу метода на случайных символах
    }
}