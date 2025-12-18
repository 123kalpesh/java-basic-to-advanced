//inheritance is a mechanism in which one class acquires the properties and methods of another class.
//inheritance is used to achieve runtime polymorphism.
//inheritance is used to achieve code reusability.
//inheritance c1 -> c2 -> c3 here parent class is c1 and child class is c2 and c3
//Types of inheritance:
//1. Single Inheritance
//2. Multilevel Inheritance
//3. Hierarchical Inheritance
//4. Hybrid Inheritance

public class Circle {
    int radius;
    int getCircleArea(int radius){
        return radius * radius * 3.14;
    }
}
public class Cyllinder extends Circle {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Area of circle is : " + c.getCircleArea(50));
        Cyllinder cy = new Cyllinder();
        System.out.println("Area of cyllinder is : " + cy.getCircleArea(50));
    }
}