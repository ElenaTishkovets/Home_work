package home_work_1;

import java.util.Objects;

public class Task6_1 implements ICommunicationPrinter{
    /**
     * Возвращает приветствие в зависимости от введенного имени из консоли
     * @param name, имя, введенное из консоли
     * @return приветствие
     */
    @Override
    public String welcom(String name) {
        if (Objects.equals(name, "Вася")) {
            return "Привет!" + "\n" + "Я тебя так долго ждал.";
        } else {
            if (Objects.equals(name, "Анастасия")) {
                return "Я тебя так долго ждал.";
            } else {
                return "Добрый день, а вы кто?";
            }
        }
    }

}
