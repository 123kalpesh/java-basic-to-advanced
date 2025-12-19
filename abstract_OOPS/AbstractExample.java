// Abstract class example
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method with implementation
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Dog extends Animal {
    // The body of the abstract method is provided here
    public void makeSound() {
        System.out.println("The dog says: Bow Wow");
    }
}

// Subclass (inherit from Animal)
class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat says: Meow");
    }
}

// Main class to test the abstract class
public class AbstractExample {
    public static void main(String[] args) {
        // Create Dog and Cat objects
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        
        // Call the abstract method
        myDog.makeSound();
        myCat.makeSound();
        
        // Call the regular method
        myDog.sleep();
        myCat.sleep();
    }
}