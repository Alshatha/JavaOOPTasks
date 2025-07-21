// Person.java
public class Person {
    String name;
    int age;

    // Method to display name and age
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // main method to run the program
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Alice";
        p.age = 25;
        p.display();
    }
}
