package com.sparta;

public class PalindromeArrayChecker {
    public static String[] checkPalindromeInArr(String[] stringArr) {
        int palindromeCounter = 0;
        String[] checkerArr = new String[stringArr.length];

        for (int i = 0; i < stringArr.length; i ++) {
            String newString = "";
            String reverseString = "";

            for (int j = 0; j < stringArr[i].length(); j++) {
                if (Character.isLetter(stringArr[i].charAt(j))) {
                    newString = newString + stringArr[i].charAt(j);
                }
            }

            for (int k = stringArr[i].length() - 1; k >= 0; k--) {
                if (Character.isLetter(stringArr[i].charAt(k))) {
                    reverseString = reverseString + stringArr[i].charAt(k);
                }
            }

            if (newString.equalsIgnoreCase(reverseString) && !stringArr[i].equals("")) {
                palindromeCounter++;
                checkerArr[i] = stringArr[i];
            } else {
                checkerArr[i] = "Not a palindrome";
            }
        }

        String[] returnedArr = new String[palindromeCounter];
        int returnedArrInserter = 0;

        for (int i = 0; i < checkerArr.length; i++) {
            if (!checkerArr[i].equals("Not a palindrome")) {
                returnedArr[returnedArrInserter] = checkerArr[i];
                returnedArrInserter++;
            }
        }

        return returnedArr;
    }
}
