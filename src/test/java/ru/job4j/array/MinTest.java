package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 6.5.1. Поиск минимального числа в массиве. [#179803] test
 */
public class MinTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[]{0, 5, 10};
        int result = Min.findMin(array);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[]{10, 5, 3};
        int result = Min.findMin(array);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[]{10, 2, 5};
        int result = Min.findMin(array);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

}