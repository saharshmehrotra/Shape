import java.util.Scanner;

public class Pyramid extends Shape implements Volume {
    private double baseLength;
    private double baseWidth;
    private double height;

    @Override
    public void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the pyramid's base: ");
        baseLength = scanner.nextDouble();
        System.out.print("Enter the width of the pyramid's base: ");
        baseWidth = scanner.nextDouble();
        System.out.print("Enter the height of the pyramid: ");
        height = scanner.nextDouble();
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Pyramid does not have a perimeter.");
    }

    @Override
    public void calculateArea() {
        double surfaceArea = baseLength * baseWidth +
                             0.5 * baseLength * Math.sqrt(Math.pow((baseWidth / 2), 2) + Math.pow(height, 2)) +
                             0.5 * baseWidth * Math.sqrt(Math.pow((baseLength / 2), 2) + Math.pow(height, 2));
        System.out.println("Surface area of the pyramid: " + surfaceArea);
    }

    @Override
    public void calculateVolume() {
        double volume = (1.0 / 3.0) * baseLength * baseWidth * height;
        System.out.println("Volume of the pyramid: " + volume);
    }
}
