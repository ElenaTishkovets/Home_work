package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
//        1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
//        1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
//        1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
public class Task1_2Test {

    @Test
    public void myltiplyChar (){
        Assertions.assertEquals("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080", Task1_2.myltiplyChar("181232375"));
    }
    @Test
    public void myltiplyChar1 (){
        Assertions.assertEquals("8 * 9 * 3 * 2 * 1 = 432", Task1_2.myltiplyChar("89321"));
    }
    @Test
    public void myltiplyChar2 (){
        Assertions.assertEquals("Введено не целое число", Task1_2.myltiplyChar("99.2"));
    }
    @Test
    public void myltiplyChar3 (){
        Assertions.assertEquals("Введено не число", Task1_2.myltiplyChar("99..2"));
    }
    @Test
    public void myltiplyChar4 (){
        Assertions.assertEquals("Введено не число", Task1_2.myltiplyChar("Привет"));
    }
    @Test
    public void myltiplyChar5 (){
        Assertions.assertEquals("Введено не число", Task1_2.myltiplyChar("Девяносто девять"));
    }
}
