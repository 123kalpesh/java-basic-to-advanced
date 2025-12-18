//package operators;
// demonstrate of comparision operators in java
import java.util.Scanner;
public class operators_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
       
        if (a %2 == 0) {
            System.out.println(a + " is even number");
        } else {
            System.out.println(a + " is odd number");
        }
        //sc.close();
    }
    
}
