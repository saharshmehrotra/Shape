import java.util.Scanner;

public class Circle extends Shape {
    private double radius;

    @Override
    public void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
    }

    @Override
    public void calculatePerimeter() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle: " + circumference);
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle: " + area);
    }
}
