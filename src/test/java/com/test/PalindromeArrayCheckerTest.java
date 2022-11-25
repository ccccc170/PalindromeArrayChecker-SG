package com.test;

import com.sparta.PalindromeArrayChecker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PalindromeArrayCheckerTest {
    @Test
    @DisplayName("Function returns an empty array when passed an empty array")
    public void returnsEmptyArrayWhenPassedEmptyArray () {
        String[] arr = new String[0];
        String[] expectedArr = new String[0];
        String[] result = PalindromeArrayChecker.checkPalindromeInArr(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns an empty array when passed an array of empty strings")
    public void returnsEmptyArrayWhenPassedArrayOfEmptyStrings () {
        String[] arr = { "", "", "" };
        String[] expectedArr = new String[0];
        String[] result = PalindromeArrayChecker.checkPalindromeInArr(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns an array with one palindrome when passed an array with one palindrome")
    public void returnsArrayWithOnePalindromeWhenPassedArrayWithOnePalindrome () {
        String[] arr = { "racecar" };
        String[] expectedArr = { "racecar" };
        String[] result = PalindromeArrayChecker.checkPalindromeInArr(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns an empty array when passed an array with one none-palindrome")
    public void returnsEmptyArrayWhenPassedArrayWithOneNonePalindrome () {
        String[] arr = { "tooth" };
        String[] expectedArr = new String[0];
        String[] result = PalindromeArrayChecker.checkPalindromeInArr(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns an array with just the same palindromes when passed an array with only multiple palindromes")
    public void returnsArrayWithSamePalindromesWhenPassedArrayWithOnlyMultiplePalindromes () {
        String[] arr = { "racecar", "mum", "dad", "deified" };
        String[] expectedArr = { "racecar", "mum", "dad", "deified" };
        String[] result = PalindromeArrayChecker.checkPalindromeInArr(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns an empty array when passed an array with only multiple none-palindromes")
    public void returnsEmptyArrayWhenPassedArrayWithOnlyMultipleNonePalindromes () {
        String[] arr = { "should", "hello", "smell", "goose" };
        String[] expectedArr = new String[0];
        String[] result = PalindromeArrayChecker.checkPalindromeInArr(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns an array with only the palindromes when passed an array with palindromes and none-palindromes")
    public void returnsArrayWithOnlyThePalindromesWhenPassedArrayWithPalindromesAndNonePalindromes () {
        String[] arr = { "racecar", "mum", "goose", "dad", "should", "smell", "deified" };
        String[] expectedArr = { "racecar", "mum", "dad", "deified" };
        String[] result = PalindromeArrayChecker.checkPalindromeInArr(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns an array with only the palindromes when passed an array with palindromes, none-palindromes and empty strings")
    public void returnsArrayWithOnlyThePalindromesWhenPassedArrayWithPalindromesNonePalindromesAndEmptyStrings () {
        String[] arr = { "racecar", "", "mum", "goose", "dad", "should", "", "", "smell", "deified" };
        String[] expectedArr = { "racecar", "mum", "dad", "deified" };
        String[] result = PalindromeArrayChecker.checkPalindromeInArr(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns an array with just the same palindromes regardless of case of palindromes")
    public void returnsArrayWithSamePalindromesRegardlessOfCaseOfPalindromes () {
        String[] arr = { "RACECAR", "says", "mum", "love", "daD", "talk", "DEifIed" };
        String[] expectedArr = { "RACECAR", "mum", "daD", "DEifIed" };
        String[] result = PalindromeArrayChecker.checkPalindromeInArr(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns an array with just the same palindromes regardless of spaces within palindromes")
    public void returnsArrayWithSamePalindromesRegardlessOfSpacesWithinPalindromes () {
        String[] arr = { "race car", "sa ys", "mu  m", "love", "da d", "ta  lk", "DEi  fIed" };
        String[] expectedArr = { "race car", "mu  m", "da d", "DEi  fIed" };
        String[] result = PalindromeArrayChecker.checkPalindromeInArr(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns an array with just the same palindromes regardless of number characters within palindromes")
    public void returnsArrayWithSamePalindromesRegardlessOfNumberCharactersWithinPalindromes () {
        String[] arr = { "po00p", "yes", "ra34ce98car", "dei67fi90ed", "ta90lk", "br00oom" };
        String[] expectedArr = { "po00p", "ra34ce98car", "dei67fi90ed" };
        String[] result = PalindromeArrayChecker.checkPalindromeInArr(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns an array with just the same palindromes regardless of special characters within palindromes")
    public void returnsArrayWithSamePalindromesRegardlessOfSpecialCharactersWithinPalindromes () {
        String[] arr = { "race\"''car", "do--;g", ";;cat", "mu----[[m", " zo++=o/?m", "d{{?a''d" };
        String[] expectedArr = { "race\"''car", "mu----[[m", "d{{?a''d" };
        String[] result = PalindromeArrayChecker.checkPalindromeInArr(arr);
        assertArrayEquals(expectedArr, result);
    }
}
