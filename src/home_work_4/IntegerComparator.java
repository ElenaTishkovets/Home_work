package home_work_4;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer int1, Integer int2) {
        if (int1 == null || int1 < int2) {
            return -1;
        }
        if (int2 == null || int1> int2) {
            return 1;
        }
        return 0;
    }
}
