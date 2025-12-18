//package conditionals;
//Conditionals in java : conditional statements are used to control the flow of 
// execution of a program based on certain conditions.
// type of  Conditional statements in java are:
// 1. if statement
// 2. if-else statement
// 3. if-else-if statement
// 4. switch statement

//1. if statement: Syntax:
// if(condition){
//     //code to be executed if the condition is true
// } 

//2. if-else statement: Syntax:
// if(condition){
//     //code to be executed if the condition is true
// }else{
//     //code to be executed if the condition is false
// }
//3. if-else-if statement: Syntax:
// if(condition){
//     //code to be executed if the condition is true
// }else if(condition){
//     //code to be executed if the condition is true
// }else{
//     //code to be executed if the condition is false
// }
//4. switch statement: Syntax:
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


public class conditionals_1 {
    //1. if statement:
    public static void main(String[] args) {
        int a=10;
        if(a>0){
            System.out.println("A is positive");
        }else{
            System.out.println("A is negative");
        }
    
    //2. if-else statement:
    
        int b=10;
        if(b>0){
            System.out.println("B is positive");
        }else{
            System.out.println("B is negative");
        }
    
    //3. if-else-if statement:
    
        int c=10;
        if(c>0){
            System.out.println("C is positive");
        }else if(a<0){
            System.out.println("C is negative");
        }
    
    //4. switch statement:
    
        int d=10;
        switch(d){
            case 1:
                System.out.println("A is 1");
                break;
            
            case 2:
                System.out.println("A is 2");
                break;
            default:
                System.out.println("A is not 1 or 2");
                break;
    }
    }

}