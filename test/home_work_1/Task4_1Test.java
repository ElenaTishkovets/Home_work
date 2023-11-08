package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_1Test {
   @Test
   public void  determineOddNumber(){
       Task4_1 chechNumber = new Task4_1();
       Assertions.assertTrue(chechNumber.determineOddNumber(9)); // тестируем работу метода на нечетном числе
   }
    @Test
    public void  determineOddNumber1(){
        Task4_1 chechNumber1 = new Task4_1();
        Assertions.assertTrue(chechNumber1.determineOddNumber(-9)); //тестируем работу метода на отрицательных числах
    }

    @Test
    public void  determineOddNumber2(){
        Task4_1 chechNumber2 = new Task4_1();
        Assertions.assertFalse(chechNumber2.determineOddNumber(10));// тестируем ввод четного числа
    }
}
