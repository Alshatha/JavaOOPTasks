// Bike.java
public class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
    }
}
