public class Circle {
    double  radius;
    double area;

    // Method to calculate the area
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    // Method to return the area
    public double getArea() {
        return area;
    }

    // Method to receive the radius
    public void receiveRadius(double radius) {
        this.radius = radius;
    }
}
