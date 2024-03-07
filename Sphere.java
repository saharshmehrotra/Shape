import java.util.Scanner;

public class Sphere extends Shape implements Volume {
    private double radius;

    @Override
    public void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        radius = scanner.nextDouble();
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Sphere does not have a perimeter.");
    }

    @Override
    public void calculateArea() {
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("Surface area of the sphere: " + surfaceArea);
    }

    @Override
    public void calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of the sphere: " + volume);
    }
}
