package home_work_1;

public class Home_work_1_2 {

    public static void main(String[] args) {

        int post = 2;
        int un = 8;

        int a = 5 + 2 / 8; //Отет 5. Решение 5+0,25 = 5,25. В ответ записываем только целую часть
        System.out.println(a);

        int b = (5 + 2) / 8; //Ответ 0. Решение 7/8 = 0.875. В ответ записываем целую часть
        System.out.println(b);

        int c = (5 + post++) / 8; //Ответ 0. Решение (5+2)/8=7/8=0.875. В ответ записываем целую часть
        System.out.println(c);

        int d = (5 + post++) / --un;//Ответ 1. Решение (5+2)/7=1
        System.out.println(d);

        int e = (5 * 2 >> post++) / --un;//Ответ 0. Решение (10>>2)/7=2/7=0.29. В ответ записываем целую часть
        System.out.println(e);

        int f = (5 + 7 > 20 ? 68 : 22 * 2 >> post++) / --un;//Ответ 1. Ошибка компиляции. Решение (12>20?68:44>>2)/7= (44>>2)/7=11/7=1.57
        System.out.println(f);

        // Int g = "(5+7>20?68>=68:22*2>>post++)/--un";//Ошибка выполнения программы. Решение 12>20?true:44>>2/7, получаем значение true, дальнейшие вычисления не имеют смысла

        boolean h = 6 - 2 > 3 && 12 * 12 <= 119;//Ответ false. Решение 4 > 3 && 144<=119. Условие И не соблюдается
        System.out.println(h);

        boolean i = true && false; //Ответ false. Логическая операция И возвращает true, если оба операнда true
        System.out.println(i);
    }
}
