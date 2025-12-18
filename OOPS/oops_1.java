//package OOPS;
//oops in java :- oops is a programming paradigm that is used to create a program.
//               class is a blueprint of an object.
//               object is an instance of a class.
//               inheritance is a mechanism of acquiring the properties of the parent class into the child class.
//               polymorphism is a mechanism of having multiple forms.
//               encapsulation is a mechanism of wrapping the data and the methods that work on the data within a single unit.
//               abstraction is a mechanism of hiding the real implementation of the method and showing only the functionality to the user.
//               interface is a mechanism of achieving abstraction.
//               package is a mechanism of grouping the classes and the interfaces that work together.
// Types of oops in java:
// 1. Class
// 2. Object
// 3. Inheritance
// 4. Polymorphism
// 5. Encapsulation
// 6. Abstraction
// 7. Interface
// 8. Package
public class oops_1 {
    public static void main(String[] args) {
        System.out.println("Employee Details");
        oops_2 obj = new oops_2();
        obj.display();
        oops_3 obj2 = new oops_3();
        obj2.display();
    }
}

class oops_2 {
    int age =29;
    String name = "King";
    float salary = 55000.50f;
    char grade = 'A';
    boolean isEmployed = true;
    public void display() {
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Age: "+age);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee Grade: "+grade);
        System.out.println("Employee isEmployed: "+isEmployed);
    }
}

class oops_3 {
    int age =25;
    String name = "Kishan";
    float salary = 36546365.565f;
    char grade = 'S';
    boolean isEmployed = false;
    public void display() {
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Age: "+age);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee Grade: "+grade);
        System.out.println("Employee isEmployed: "+isEmployed);
    }
}

