import java.util.Scanner;

public class Task5CountTriple {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in); // Set up the tool to read input from user
        while (true) {
            System.out.print("Enter text to count triples: ");// Ask user to Enter text
            String text = inputScanner.nextLine(); // Save Text Input
            int triplesFound = 0;

            // Stop 2 characters before the end so i+1 and i+2 don't crash
            for (int i = 0; i <= text.length() - 3; i++) {
                char firstChar = text.charAt(i);
                char secondChar = text.charAt(i + 1);
                char thirdChar = text.charAt(i + 2);

                // Check if all three match
                if (firstChar == secondChar && firstChar == thirdChar) triplesFound++;

            }

            System.out.println("Total triples: " + triplesFound);

        }
    }}