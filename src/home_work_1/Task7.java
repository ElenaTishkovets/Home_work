package home_work_1;
//7.* Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main, данный метод будет принимает один параметр
// и будет возвращать строку в отформатированном виде. В метод будет передаваться массив из 10 цифр (от 0 до 9).
// Данные цифры должны быть помещены в строку формата: (XXX) XXX-XXXX. Например передан массив: {1,2,3,4,5,6,7,8,9,0},
// возвращаемый результат: (123) 456-7890. (Взято с https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java).
// В задании нельзя использовать колекции, стрима.

public class Task7 {

    public static void main(String[] args) {
        Task7 number = new Task7();
        System.out.println(createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));
        System.out.println(createPhoneNumber2(new Integer[]{1,2,3,4,5,6,7,8,9,0}));

    }
    public static String createPhoneNumber(int[] digits){
        return  "(" + digits[0] + digits[1] + digits[2] +") "
                + digits[3] +digits[4] +digits[5] + "-" +
                digits[6] + digits[7] + digits[8] + digits[9];
    }
    public static String createPhoneNumber2(Integer[] digits){
        return String.format ("(%d%d%d) %d%d%d-%d%d%d%d", digits);
    }
}