package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    
    public static boolean  isPalindrome(int number) {
        number = Math.abs(number);
        String newNumber = String.valueOf(number);
        String reversedStr = "";
        for (int i = 0; i < newNumber.length(); i++) {
            reversedStr = newNumber.charAt(i) + reversedStr;
        }
        return reversedStr.equals(newNumber);  
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        
        int sumOfDivisors = 0;
        
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
        
        return sumOfDivisors == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String[] digitWords = {
            "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
        };

        StringBuilder result = new StringBuilder();

        int remainingNumber = number;

        do {
            int digit = remainingNumber % 10;
            result.insert(0, digitWords[digit] + " ");
            remainingNumber /= 10;
        } while (remainingNumber > 0);

        return result.toString().trim();
    }

}
