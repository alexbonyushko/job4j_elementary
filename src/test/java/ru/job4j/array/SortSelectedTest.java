package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 6.5.3. Сортировка выборкой. [#156320] test
 */
public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortFiveNumbers() {
        int[] data = new int[]{7, 9, 3, 1, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 3, 5, 7, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortThreeNumbers() {
        int[] data = new int[]{12, 10, 13};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{10, 12, 13};
        assertThat(result).containsExactly(expected);
    }
}