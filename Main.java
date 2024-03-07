/*
Saharsh Mehrotra
22070126093
AIML B1
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Calculate Area and Perimeter / Volume and Surface Area");
            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    shapeCalculator.calculateShape();
                    break;
                case 2:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

