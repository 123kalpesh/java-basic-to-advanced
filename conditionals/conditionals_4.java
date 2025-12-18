// Switch statement in java:
// Switch statement is used to perform different actions based on different conditions.
// Syntax:
// switch(expression){
//     case value1:
//         //code to be executed if the expression is equal to value1
//         break;
//     case value2:
//         //code to be executed if the expression is equal to value2
//         break;
//     default:
//         //code to be executed if the expression is not equal to any of the values
//         break;
// }

import java.util.Scanner;

public class conditionals_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        String category = "";
        if(age >=18){
            category = "Adult";

        }else if (age >= 13 && age <18){
            category = "Teenager";
        }else{
            category = "Child";
        }
        switch(category){
            case "Adult":
                System.out.println("You are an adult");
                break;
            case "Teenager":
                System.out.println("You are a teenager");
                break;
            default:
                System.out.println("You are a child");
        }
        //System.out.println("You are a " + category);
}
}