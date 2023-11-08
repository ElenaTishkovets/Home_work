package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_4Test {

    @Test
    public void convertBytesKilobytes() {
        Task4_4 converter = new Task4_4();
        Assertions.assertEquals("1024 байт", converter.convertBytesKilobytes(1, "Кбайт"));   //тестируем работу метода на случайных числах
    }

    @Test
    public void convertBytesKilobytes1() {
        Task4_4 converter1 = new Task4_4();
        Assertions.assertEquals("1 Кбайт", converter1.convertBytesKilobytes(1024, "байт"));   //тестируем работу метода на случайных числах
    }

    @Test
    public void convertBytesKilobytes2() {
        Task4_4 converter2 = new Task4_4();
        Assertions.assertEquals("12 Кбайт", converter2.convertBytesKilobytes(13000, "байт"));   //тестируем работу метода на случайных числах
    }

    @Test
    public void convertBytesKilobytes3() {
        Task4_4 converter3 = new Task4_4();
        Assertions.assertEquals("Введено отрицательное число", converter3.convertBytesKilobytes(-1, "Кбайт"));   //тестируем работу метода на отрицательных числах
    }

    @Test
    public void convertBytesKilobytes4() {
        Task4_4 converter4 = new Task4_4();
        Assertions.assertEquals("Введены некорректные данные", converter4.convertBytesKilobytes(1, "example"));   //тестируем работу метода на некорректном типе байт/Кбайт
    }
}