import java.util.Scanner;

public class Task3IsNotBalancer {

        public static void main(String[] args) {
            Scanner inputScanner = new Scanner(System.in); // Set up the tool to read input from user
            while (true) {
                System.out.print("Enter text to check balance of 'is' and 'not: ");// Enter First String
                String textInput = inputScanner.nextLine(); // Save Text Input

                int isCount = 0;
                int notCount = 0;

                for (int i = 0; i < textInput.length(); i++) {
                    // Count 'is'
                    if (i <= textInput.length() - 2 && textInput.substring(i, i + 2).equals("is")) isCount++;
                    //Count 'not'
                    if (i <= textInput.length() - 3 && textInput.substring(i, i + 3).equals("not")) notCount++;
                }
                 //Display Result
                System.out.println("Dose Counts are Same ? " + (isCount == notCount));

            }
        }
    }
