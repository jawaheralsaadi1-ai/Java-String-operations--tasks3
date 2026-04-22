import java.util.Scanner;

public class Task6SumDigits {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in); // Set up the tool to read input from user
        while (true) {
            System.out.print("Enter text : ");// Ask user to Enter text
            String text = inputScanner.nextLine(); // Save Text Input

        int digitSum = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Check if the character is a digit '0' through '9'
            if (Character.isDigit(currentChar)) {
                // Convert char to string, then parse it to an integer
                digitSum += Integer.parseInt(String.valueOf(currentChar));
            }
        }
        //Display Result
        System.out.println("Sum of digits: " + digitSum);
    }}}
