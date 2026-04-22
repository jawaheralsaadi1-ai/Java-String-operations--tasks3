
import java.util.Scanner;

public class Task2SubstirngRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Set up the tool to read input from user

        while (true) {
            // Ask for user for input
            System.out.print("Enter the base string: "); // Enter First String
            String baseString = scanner.nextLine(); // Save First String
            System.out.print("Enter the substring to remove: "); // Enter the char to remove it
            String toRemove = scanner.nextLine();// Save the char to Remov it

            String result = "";
            int i = 0;
            while (i < baseString.length()) {
                // Check if the substring matches (ignoring case)
                if (i <= baseString.length() - toRemove.length() &&
                        baseString.substring(i, i + toRemove.length()).equalsIgnoreCase(toRemove)) {
                    i += toRemove.length(); // Skip the characters we want to remove
                } else {
                    result += baseString.charAt(i); // Keep the character
                    i++;
                }
            }
            System.out.println("Result: " + result);

        }
    }
}
