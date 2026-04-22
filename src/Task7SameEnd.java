import java.util.Scanner;

public class Task7SameEnd {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);// Set up the tool to read input from user
        while (true) {
            System.out.print("Enter text :");// Ask user to Enter text
            String text = inputScanner.nextLine(); // Save Text Input

            String longestResult = "";

            // Loop up to half the length because ends cannot overlap
            for (int length = 1; length <= text.length() / 2; length++) {
                String prefixPart = text.substring(0, length); // Part from the start
                String suffixPart = text.substring(text.length() - length); // Part from the end

                if (prefixPart.equals(suffixPart)) {
                    longestResult = prefixPart; // Update with the longer match
                }
            }

            System.out.println("Longest same end: " + longestResult);
        }
    }

}