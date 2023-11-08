package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// 1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить,
// Второе число это степень в которую возводят первое число. Степень - только положительная и целая.
// Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
//         1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
//         1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
public class Task1_3Test {
    @Test
    public void raisePower (){
        Assertions.assertEquals("18.0 ^ 5 = 1889568.0", Task1_3.raisePower(18.0, 5));
    }
@Test
    public void raisePower1 (){
        Assertions.assertEquals("7.5 ^ 2 = 56.25", Task1_3.raisePower(7.5, 2));
    }
    @Test
    public void raisePower2 (){
        Assertions.assertEquals("2.5 ^ 0 = 1.0", Task1_3.raisePower(2.5, 0));
    }
    @Test
    public void raisePower3 (){
        Assertions.assertEquals("-2.5 ^ 0 = 1.0", Task1_3.raisePower(-2.5, 0));
    }
    @Test
    public void raisePower4 (){
        Assertions.assertEquals("Введена некоректная степень числа", Task1_3.raisePower(2.5, -1));
    }
    @Test
    public void raisePower5 (){
        Assertions.assertEquals("-2.5 ^ 3 = -15.625", Task1_3.raisePower(-2.5, 3));
    }
    @Test
    public void raisePower6 (){
        Assertions.assertEquals("0.0 ^ 0 = 1.0", Task1_3.raisePower(0, 0));
    }
    @Test
    public void raisePower7 (){
        Assertions.assertEquals("0.0 ^ 1 = 0.0", Task1_3.raisePower(0, 1));
    }

}
