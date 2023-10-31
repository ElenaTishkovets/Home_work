package home_work_4;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

    //переопределяем метод compare
    @Override
    public int compare(String string1, String string2) {

        if (string1 == null || string1.length() < string2.length()) {
            return -1;
        }
        if (string2 == null || string1.length() > string2.length()) {
            return 1;
        }
        return 0;
    }
}
