
import java.util.Scanner;
public class Task1WordEndCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Set up the tool to read input from user

        while (true) {
            // Ask for user for input
        System.out.println("Enter a text to count words ending in 'y' or 'z':");
        String text = scanner.nextLine().toLowerCase(); // Save  text

        int endCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);

            // Check if current character is 'y' or 'z'
            if (currentLetter == 'y' || currentLetter == 'z') {
                //if end of a word is the last char OR the next char is not a letter
                if (i == text.length() - 1 || !Character.isLetter(text.charAt(i + 1))) {
                    endCount++;
                }
            }
        }
        //Display the result
        System.out.println("Number of words  = " + endCount);

    }
}
}
