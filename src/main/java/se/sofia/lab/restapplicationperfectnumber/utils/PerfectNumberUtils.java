package se.sofia.lab.restapplicationperfectnumber.utils;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class PerfectNumberUtils {

    // Prevent instantiation as it is a utility class
    private PerfectNumberUtils() {}

    public static boolean isPerfectNumber(int num) {
        if (num == 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return (num - sum) == 0;
    }

    public static ArrayList<Integer> getPerfectNumbersInRange(int start, int end) {
        ArrayList<Integer> perfectNumbers = new ArrayList<>();

        IntStream.rangeClosed(start, end).forEach(
                i -> {
                    if (isPerfectNumber(i)) {
                        perfectNumbers.add(i);
                    }
                });

        return perfectNumbers;
    }

}

