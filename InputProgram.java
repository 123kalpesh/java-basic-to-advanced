


import java.util.Scanner; // Import the Scanner class

public class InputProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        // Prompt for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read user input for name

        // Prompt for the user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read user input for age

        // Prompt for the user's favorite number
        System.out.print("Enter your favorite number: ");
        double favoriteNumber = scanner.nextDouble(); // Read user input for favorite number

        // Display the entered information
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite number is " + favoriteNumber + ".");

        scanner.close(); // Close the scanner
    }
}

