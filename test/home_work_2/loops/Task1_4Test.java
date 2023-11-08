package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
//1.4.* Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением до переполнения и после переполнения. Умножать на:
//        1.4.1. 3
//        1.4.2. 188
//        1.4.3. -19
//        1.4.4. Да и вообще на любое целочисленное

public class Task1_4Test {

    @Test
    public void overFlow() {
        Assertions.assertEquals("Произошло переполнение. Предыдущее значение: 4052555153018976267. Значение после переполнения: -6289078614652622815", Task1_4.overFlow(3));
    }

    @Test
    public void overFlow1() {
        Assertions.assertEquals("Произошло переполнение. Предыдущее значение: 1560496482665168896. Значение после переполнения: -1774566438301073408", Task1_4.overFlow(188));
    }

    @Test
    public void overFlow2() {
        Assertions.assertEquals("Произошло переполнение. Предыдущее значение: 799006685782884121. Значение после переполнения: 3265617043834753317", Task1_4.overFlow(-19));
    }

    @Test
    public void overFlow3() {
        Assertions.assertEquals("Произошло переполнение. Предыдущее значение: 1982457608111853125. Значение после переполнения: -7432359160780327831", Task1_4.overFlow(4565));
    }

    @Test
    public void overFlow4() {
        Assertions.assertEquals("Переполнение недостежимо", Task1_4.overFlow(0));
    }
}
