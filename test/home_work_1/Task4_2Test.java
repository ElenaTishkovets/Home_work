package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_2Test {
   @Test
   public void  findOverageNumber(){
       Task4_2 chechNumber = new Task4_2();
       Assertions.assertEquals(8, chechNumber.findOverageNumber(9,8,7)); // тестируем работу метода на трех разных числах
   }
    @Test
    public void  findOverageNumber1(){
        Task4_2 chechNumber1 = new Task4_2();
        Assertions.assertEquals(60, chechNumber1.findOverageNumber(61,60,60)); // тестируем работу метода c двумя одинаковыми числами
    }

    @Test
    public void  findOverageNumber2(){
        Task4_2 chechNumber2 = new Task4_2();
        Assertions.assertEquals(60, chechNumber2.findOverageNumber(60,60,70)); // тестируем работу метода c двумя одинаковыми числами
    }
    @Test
    public void  findOverageNumber3(){
        Task4_2 chechNumber3 = new Task4_2();
        Assertions.assertEquals(8, chechNumber3.findOverageNumber(8,8,8)); // тестируем работу метода на трех одинаковых числах
    }
}
