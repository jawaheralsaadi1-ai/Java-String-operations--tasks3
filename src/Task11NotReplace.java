import java.util.Scanner;

public class Task11NotReplace {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);// Set up the tool to read input from user
        while (true) {
            System.out.print("Enter text :");// Ask user to Enter text
            String text = inputScanner.nextLine(); // Save Text Input
            String finalResult = "";

            for (int i = 0; i < text.length(); i++) {
                // Check if current part is "is"
                if (i <= text.length() - 2 && text.substring(i, i + 2).equals("is")) {
                    // Check if there is a letter before it
                    boolean letterBefore = (i > 0 && Character.isLetter(text.charAt(i - 1)));
                    // Check if there is a letter after it
                    boolean letterAfter = (i < text.length() - 2 && Character.isLetter(text.charAt(i + 2)));

                    // If no letter before and no letter after, it's a standalone "is"
                    if (!letterBefore && !letterAfter) {
                        finalResult += "is not";
                        i++; // Skip the 's' in 'is'
                    } else {
                        finalResult += text.charAt(i); // Keep the 'i'
                    }
                } else {
                    finalResult += text.charAt(i); // Keep regular character
                }
            }

            System.out.println("Result: " + finalResult);
        }
    }
}
