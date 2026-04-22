import java.util.Scanner;

public class Task8MirrorEnds {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);// Set up the tool to read input from user
        while (true) {
            System.out.print("Enter text :");// Ask user to Enter text
            String text = inputScanner.nextLine(); // Save Text Input
            String mirrorResult = "";

            for (int i = 0; i < text.length(); i++) {
                // Compare character at start (i) with character at end (length - 1 - i)
                if (text.charAt(i) == text.charAt(text.length() - 1 - i)) {
                    mirrorResult += text.charAt(i); // Add if they match
                }
            }

            System.out.println("Mirror end: " + mirrorResult);
        }
    }
        }
