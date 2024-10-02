import java.util.Scanner;

public class CircleAreaCalculator {

    // Method to calculate the area of the circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = 0;
        
        while (true) {
            try {
                System.out.print("Enter the radius of the circle: ");
                String input = scanner.nextLine();
                
                // Parse the input to double
                radius = Double.parseDouble(input);
                
                // Check if the radius is negative
                if (radius < 0) {
                    System.out.println("Radius cannot be negative. Please enter a positive number.");
                    continue; // Ask for input again
                }

                break; // Exit loop if input is valid
                
            } catch (NumberFormatException e) {
                // Handle non-numeric input
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // Calculate the area
        double area = calculateArea(radius);

        // Display the result, formatted to 2 decimal places
        System.out.printf("The area of the circle with radius %.2f is: %.2f\n", radius, area);

        // Close the scanner
        scanner.close();
    }
}
