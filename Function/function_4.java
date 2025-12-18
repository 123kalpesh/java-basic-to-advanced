//write a program to demonstrate the recursive function in java
//program of factorial using recursive Function

import java.util.Scanner;
public class function_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println("Factorial of "+ num + " is "+ factorial(num));
        System.out.println("Sum of N serial Number "+ num + " is "+ sum_of_serial_number(num));
    }
    public static int sum_of_serial_number(int num){
        if (num == 0 ){
            return 0;
        }
        else {
            return num + sum_of_serial_number(num-1);
        }
    }
    public static int factorial(int num){
        //int fact = 1;
        // for (int i = 1; i <= num; i++){
        //     fact = fact * i;
        // }
        if (num == 0 || num == 1){
            return 1;
        }
        else {
            return num * factorial(num-1);
        }
    //return fact;
    }
    
}
