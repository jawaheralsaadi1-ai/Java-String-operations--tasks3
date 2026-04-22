import java.util.Scanner;

public class Task9MaxBlock {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);// Set up the tool to read input from user
        while (true) {
            System.out.print("Enter text :");// Ask user to Enter text
            String text = inputScanner.nextLine(); // Save Text Input
            int largestBlock = 0;

            for (int i = 0; i < text.length(); i++) {
                int currentBlockSize = 0;

                // Look forward from 'i' to find how many match
                for (int j = i; j < text.length(); j++) {
                    if (text.charAt(i) == text.charAt(j)) {
                        currentBlockSize++;
                    } else {
                        break; // Stop if characters change
                    }
                }

                // Update largestBlock if current run is bigger
                if (currentBlockSize > largestBlock) {
                    largestBlock = currentBlockSize;
                }
            }

            System.out.println("Largest block size: " + largestBlock);
        }
    }
}
