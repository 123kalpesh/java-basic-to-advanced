//package operators;
// Operators in Java :- operators are special symbols that perform
//  specific operations on one, two, or three operands and then return a result.
// Types of Operators in Java :-
// 1. Arithmetic Operators:- +, -, *, /, %, ++, --
// 2. Unary Operators:- +, -, ++, --, !
// 3. Assignment Operators:- =, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=
// 4. Relational Operators:- ==, !=, >, <, >=, <=
// 5. Logical Operators:- &&, ||, !
// 6. Bitwise Operators:- &, |, ^, ~, <<, >>, >>>
// 7. Ternary Operator:- ? :
// 8. instanceof Operator
public class operators_1 {
    public static void main(String[] args) {
        int a = 100;
        int b=200;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a* b  ="+ (a*b));//Multiplication
        System.out.println("b / a = " + (b / a)); // Division
        System.out.println("b % a = " + (b % a)); // Modulus

        //Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("A == B :-"+(a==b));
        System.out.println("A != B :-"+(a!=b));
        System.out.println("A>B:-"+(a>b));
        System.out.println("A<B:-"+(a<b));
        System.out.println("A>=B:-"+(a>=b));
        System.out.println("A<=B:-"+(a<=b));

        //Logical Operators
        System.out.println("Logical Operators:");
        System.out.println("(a<b) && (a==100):-"+((a<b) && (a==100)));
        System.out.println("(a<b) || (a==100):-"+((a<b) || (a==100)));
        System.out.println("!(a<b):-"+(!(a<b)));

        //Ternary Operator
        System.out.println("Ternary Operator:");
        int max =  (a>b) ? a: b;
        System.out.println("max Number of in A & B :-"+max);


         } 
}
