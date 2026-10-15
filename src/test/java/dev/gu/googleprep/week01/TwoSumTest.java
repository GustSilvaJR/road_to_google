package dev.gu.googleprep.week01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private static void assertValidPair(int[] input, int target) {
        int[] pair = TwoSum.findIndices(input, target);
        assertNotNull(pair);
        assertEquals(2, pair.length, "Deve retornar dois índices");
        assertTrue(pair[0] >= 0 && pair[1] < input.length && pair[0] < pair[1],
            "Índices devem ser válidos, diferentes e ordenados");
        assertEquals((long) target, (long) input[pair[0]] + input[pair[1]]);
    }

    @Test void findsValidPair() {
        assertValidPair(new int[]{2, 7, 11, 15}, 9);
    }

    @Test void acceptsDuplicateNumbersAtDistinctIndices() {
        assertValidPair(new int[]{3, 3}, 6);
    }

    @Test void returnsEmptyWhenNoPairExists() {
        assertArrayEquals(new int[0], TwoSum.findIndices(new int[]{1, 2, 3}, 999));
    }

    @Test void handlesNegativeNumbers() {
        assertValidPair(new int[]{-4, 2, 8, 9}, 5);
    }
}
