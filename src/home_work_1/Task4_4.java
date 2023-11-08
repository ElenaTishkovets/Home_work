package home_work_1;
// 4.4 Перевести байты в килобайты или наоборот

import java.util.Objects;

public class Task4_4 {
    /**
     * Метод определяет введенное значение и переводит байты в килобайты или наоборот
     * @param typeBytes тип введенного значения
     * @param number число, которое необходимо перевести в байты или килобайты
     * @return если введено число в байтах возвращает число в килобайтах и наоборот
     */
    public String convertBytesKilobytes(int number, String typeBytes) {
        if (number < 0) {
            return "Введено отрицательное число";
        }
        if (Objects.equals(typeBytes, "байт")) {
            return number / 1024 + " Кбайт";
        } else if (Objects.equals(typeBytes, "Кбайт")) {
            return number * 1024 + " байт";
        } else return "Введены некорректные данные";
    }
}