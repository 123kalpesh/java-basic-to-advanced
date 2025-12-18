//write a program to demonstrate the method overloading in java
// Method Overloading is a feature that allows a class to have more than 
// one method with the same name, but different parameters.
// The method overloading is used to increase the readability of the program.
public class function_3 {
    public static void main(String[] args){
        System.out.println("Addition of two number is "+ addition(10,20));
        System.out.println("Addition of three number is "+ addition(10,20,30));
    }
    public static int addition(int a, int b){
        return a+b;
    }
    public Static int addition(int a, int b, int c){
        return a+b+c;
    }
}
