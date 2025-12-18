//abstract class :- here we can't create object of abstract class
//abstract method :- method without body, it is declared with ; 
//interface :- interface is a collection of abstract methods

abstract class Shape {
    abstract void area();
}
public class Circle implements Shape {
    void area() {
        System.out.println("Area of circle");
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area();
    }
}
