package JavaCourse.Algorithms;

import java.util.HashMap;
import java.util.Map;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Test the method with some example strings
        System.out.println(isPotentialPalindrome("Racecar"));  // true
        System.out.println(isPotentialPalindrome("mmaab"));  // true
        System.out.println(isPotentialPalindrome("Hello"));    // false
    }

    // Method to check if a string is a palindrome or can be rearranged to form a palindrome
    public static boolean isPotentialPalindrome(String str) {
        // Check if the string is already a palindrome
        if (isPalindrome(str)) {
            return true;
        }

        // Count the frequency of each character in the string (ignoring non-alphanumeric characters and case)
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : str.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        // Count the number of characters with odd frequency
        int oddCount = 0;
        for (int count : charFrequency.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // For a potential palindrome, there can be at most one character with odd frequency
        return oddCount <= 1;
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Initialize pointers for the start and end of the string
        int left = 0;
        int right = cleanStr.length() - 1;

        // Iterate through the string until the pointers meet
        while (left < right) {
            // Check if the characters at the left and right positions are equal
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                // If they are not equal, the string is not a palindrome
                return false;
            }
            // Move the pointers towards each other
            left++;
            right--;
        }
        // If the loop completes without returning false, the string is a palindrome
        return true;
    }

    }
