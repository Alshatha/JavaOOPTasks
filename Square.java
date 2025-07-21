// Square.java
public class Square implements Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public static void main(String[] args) {
        Square s = new Square(4);
        System.out.println("Area of Square: " + s.getArea());
    }
}
