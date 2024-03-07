import java.util.*;

public class ShapeCalculator {
    private Shape selectedShape;
    private Scanner scanner;

    public ShapeCalculator() {
        scanner = new Scanner(System.in);
    }

    // Method to calculate area and perimeter for 2D shapes or volume and surface area for 3D shapes
    public void calculateShape() {
        selectShape();
        selectedShape.calculateShape();
        selectedShape.calculatePerimeter();

        if (selectedShape instanceof Volume) {
            ((Volume) selectedShape).calculateVolume();
        } else {
            System.out.println("Selected shape does not have a volume.");
        }
    }

    // Helper method to select a shape
    private void selectShape() {
        System.out.println("Select a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Sphere");
        System.out.println("5. Cylinder");
        System.out.println("6. Pyramid");

        int choice = getIntInput("Enter the number corresponding to the desired shape: ");

        switch (choice) {
            case 1:
                selectedShape = new Circle();
                break;
            case 2:
                selectedShape = new Rectangle();
                break;
            case 3:
                selectedShape = new Square();
                break;
            case 4:
                selectedShape = new Sphere();
                break;
            case 5:
                selectedShape = new Cylinder();
                break;
            case 6:
                selectedShape = new Pyramid();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid shape.");
                selectShape();
        }

        selectedShape.showShape(selectedShape.getClass().getSimpleName());
    }

    // Method to get integer input from the user
    private int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            System.out.print(prompt);
            scanner.next(); // Consume the invalid input
        }
        int input = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        return input;
    }

    // Methods for specific 2D shapes
    public void calculate2DShape() {
        selectShape();
        calculateShape();
    }

    // Methods for specific 3D shapes
    public void calculate3DShape() {
        selectShape();
        calculateShape();
    }
}
