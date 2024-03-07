import java.util.Scanner;

public class Rectangle extends Shape {
    private double length;
    private double width;

    @Override
    public void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }
}
