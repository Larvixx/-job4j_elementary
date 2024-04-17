package algorythm;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void searchWhen3() {
        int[] list = new int[] {7, 56, 86, 34, 77, 32, 54, 77, 3, 86};
        int expected = 3;
        assertThat(BinarySearch.search(list, 3)).isEqualTo(expected);

    }

    @Test
    void searchWhen77() {
        int[] list = new int[] {1, 3, 5, 7, 12, 32, 54, 77, 85, 86};
        int expected = 77;
        assertThat(BinarySearch.search(list, 77)).isEqualTo(expected);

    }

    @Test
    void searchWhen12() {
        int[] list = new int[] {1, 3, 5, 7, 12, 32, 54, 77, 85, 86};
        int expected = 12;
        assertThat(BinarySearch.search(list, 12)).isEqualTo(expected);

    }
}