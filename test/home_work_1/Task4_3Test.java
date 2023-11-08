package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_3Test {
   @Test
    public  void checkDivide (){
       Task4_3 checkDiv = new Task4_3();
       Assertions.assertTrue(checkDiv.checkDivide(9,3));   //тестируем работу метода на случайных числах
   }
    @Test
    public  void checkDivide1 (){
        Task4_3 checkDiv1 = new Task4_3();
        Assertions.assertTrue(checkDiv1.checkDivide(3,9)); //тестируем работу метода на случайных числах
    }
    @Test
    public  void checkDivide2 (){
        Task4_3 checkDiv2 = new Task4_3();
        Assertions.assertTrue(checkDiv2.checkDivide(0,3)); //тестируем работу метода с переданным 0
    }
    @Test
    public  void checkDivide3 (){
        Task4_3 checkDiv3 = new Task4_3();
        Assertions.assertTrue(checkDiv3.checkDivide(3,0)); //тестируем работу метода с переданным 0
    }
    @Test
    public  void checkDivide4 (){
        Task4_3 checkDiv4 = new Task4_3();
        Assertions.assertFalse(checkDiv4.checkDivide(0,0)); //тестируем работу метода с переданным 0
    }
    @Test
    public  void checkDivide5 (){
        Task4_3 checkDiv5 = new Task4_3();
        Assertions.assertFalse(checkDiv5.checkDivide(10,7)); //тестируем работу метода на случайных числах
    }
}
