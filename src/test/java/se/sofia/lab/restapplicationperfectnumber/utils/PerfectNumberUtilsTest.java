package se.sofia.lab.restapplicationperfectnumber.utils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberUtilsTest {

    @Test
    public void testIsPerfectNumber() {
        assertTrue(PerfectNumberUtils.isPerfectNumber(6));
        assertTrue(PerfectNumberUtils.isPerfectNumber(28));
        assertTrue(PerfectNumberUtils.isPerfectNumber(8128));
        assertFalse(PerfectNumberUtils.isPerfectNumber(0));
        assertFalse(PerfectNumberUtils.isPerfectNumber(17));
        assertFalse(PerfectNumberUtils.isPerfectNumber(4711));
        assertFalse(PerfectNumberUtils.isPerfectNumber(10000));
    }

    @Test
    public void testGetPerfectNumbersInRange() {
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(6);
        expectedResult.add(28);
        expectedResult.add(496);
        expectedResult.add(8128);

        ArrayList<Integer> actualResult = PerfectNumberUtils.getPerfectNumbersInRange(1, 10000);

        assertEquals(actualResult.size(), 4);
        expectedResult.forEach(i -> assertTrue(actualResult.contains(i)));
    }

}