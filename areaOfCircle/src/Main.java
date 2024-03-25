import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cInputs = new Scanner(System.in);
        // create an instance of the Circle class
        Circle myCircle = new Circle();
        System.out.println("Enter the radius of the circle:");
        double radius = cInputs.nextDouble();

        myCircle.receiveRadius(radius);

        myCircle.calculateArea();

        System.out.println("The area of the circle with radius " + radius + " is: " + myCircle.getArea());
    }
}