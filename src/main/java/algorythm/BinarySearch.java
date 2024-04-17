package algorythm;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static int search(int[] list, int value) {
        Arrays.sort(list);
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int quess = list[mid];
            if (quess == value) {
                return quess;
            }
            if (quess > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -1;
    }
}
