package home_work_4;

import java.util.Comparator;

public class StringAlphabeticComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return 0;
        }
        int result = str1.compareTo(str2);
        return result;
    }
}