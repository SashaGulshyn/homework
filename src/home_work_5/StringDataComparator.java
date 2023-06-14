package src.home_work_5;

import java.util.Arrays;
import java.util.Comparator;

public class StringDataComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
