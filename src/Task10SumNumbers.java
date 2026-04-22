import java.util.Scanner;

public class Task10SumNumbers {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);// Set up the tool to read input from user
        while (true) {
            System.out.print("Enter text :");// Ask user to Enter text
            String text = inputScanner.nextLine(); // Save Text Input
            int totalSum = 0;
            String tempDigitHolder = ""; // Temporary storage for current number digits

            for (int i = 0; i < text.length(); i++) {
                if (Character.isDigit(text.charAt(i))) {
                    tempDigitHolder += text.charAt(i); // Collect digits in a row
                } else {
                    if (!tempDigitHolder.equals("")) {
                        totalSum += Integer.parseInt(tempDigitHolder); // Add gathered number
                        tempDigitHolder = ""; // Reset for next number
                    }
                }
            }

            // Add the final gathered number if the string ends with digits
            if (!tempDigitHolder.equals("")) {
                totalSum += Integer.parseInt(tempDigitHolder);
            }

            System.out.println("Total sum of numbers: " + totalSum);
        }
    }
}
