import java.util.Scanner;

public class Cylinder extends Shape implements Volume {
    private double radius;
    private double height;

    @Override
    public void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        height = scanner.nextDouble();
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Cylinder does not have a perimeter.");
    }

    @Override
    public void calculateArea() {
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface area of the cylinder: " + surfaceArea);
    }

    @Override
    public void calculateVolume() {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of the cylinder: " + volume);
    }
}
