// Rectangle.java
public class Rectangle {
    double length;
    double width;

    // Method to calculate area
    double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.width = 5;
        System.out.println("Area of Rectangle: " + r.calculateArea());
    }
}

