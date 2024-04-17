package sort;

import java.util.Comparator;

public class SortByAgePeople implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return o1.compareTo(o2);
    }
}
