//write a program to add two number parameter and return type

//import project1.addition_of_arry;
import java.util.Scanner;
public class function_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int a= sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int result= addition(a,b);
        System.out.println("Addition of two number is "+ result);
        int result2 = subtraction(a,b);
        System.out.println("Subtraction of two number is "+ result2);
        int result3 = multiplication(a,b);
        System.out.println("Multiplication of two number is "+ result3);
        int result4 = division(a,b);//function call is used to call the function
        System.out.println("Division of two number is "+ result4);
    }
    public static int addition(int a, int b)// parameter is used to pass the value to the function
    {
        return a+b;
    }
    public static int subtraction(int a, int b){
        return a-b;// return is used to return the value to the main function
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static int division(int a, int b){
        return a/b;
    }   
}

