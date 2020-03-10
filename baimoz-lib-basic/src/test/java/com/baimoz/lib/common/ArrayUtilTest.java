package com.baimoz.lib.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayUtilTest {

    @Test
    public void testFilter() {
        String[] originArr = {"1", "2", "3"};
        String[] res = ArrayUtil.filter(originArr, new String[0], element -> Integer.parseInt(element) > 1);

        String[] expected = {"2", "3"};
        assertArrayEquals(expected, res);
    }
}