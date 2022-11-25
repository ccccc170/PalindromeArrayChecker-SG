package com.sparta;

import java.util.Arrays;

public class Starter {
    public static void start() {
        String[] stringArr = { "racecar", "same", "mum", "brother", "dad", "was", "yours" };
        System.out.println("Array to check: " + Arrays.toString(stringArr));
        String[] checkedArr = PalindromeArrayChecker.checkPalindromeInArr(stringArr);
        System.out.println("Palindromes: " + Arrays.toString(checkedArr));
    }
}
