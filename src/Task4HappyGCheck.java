import java.util.Scanner;

public class Task4HappyGCheck {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in); // Set up the tool to read input from user
        while (true) {
            System.out.print("Enter text to check for happy G's: ");// Enter First String
            String text = inputScanner.nextLine(); // Save Text Input
            boolean allGIsHappy = true;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == 'g') {
                    boolean leftMatches = (i > 0 && text.charAt(i-1) == 'g');// Check neighbor to the left
                    boolean rightMatches = (i < text.length()-1 && text.charAt(i+1) == 'g');// Check neighbor to the right
                    // If neither neighbor is 'g', this 'g' is unhappy
                    if (!leftMatches && !rightMatches) allGIsHappy = false;
                }
            }
            //Display result
            System.out.println("Result: " + allGIsHappy);

        }
    }

        }
