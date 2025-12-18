//patern printing using loops 
// output :-        *
//                 ***
//                *****
//               *******
//                *****
//                 ***
//                  **
//                  *
//package Loops;

public class loops_3 {
    public static void main(String[] args) {

        int n = 4;

        // Upper half
        for (int i = 0; i <= n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * i + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 0; i--) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * i + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
