package javaAssignment;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input string

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase(); // Convert the input to lowercase

        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (str.indexOf(letter) == -1) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters from 'a' to 'z' are present
    }
}

