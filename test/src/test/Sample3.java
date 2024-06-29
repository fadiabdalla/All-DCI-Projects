package test;

import java.util.Scanner;

public class Sample3 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Text Processing Program");
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Task 1: Count the number of words in the sentence.
        int wordCount = 0;
        String[] words = input.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;
            }
        }
        System.out.println("Word count: " + wordCount);

        // Task 2: Find and print the longest word in the sentence.
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);

        // Task 3: Remove vowels from the sentence.
        String noVowels = input.replaceAll("[AEIOUaeiou]", "");
        System.out.println("Sentence without vowels: " + noVowels);

        scanner.close();
    }
}