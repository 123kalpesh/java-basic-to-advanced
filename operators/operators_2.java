// write a java program to demonstrate u^2 - v^2 / (u+v)(u-v) 

import java.util.Scanner;
public class operators_2 {
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of u: ");
        int u = sc.nextInt();
        System.out.print("Enter value of v: ");
        int v = sc.nextInt();
        //int u = 10;
        //int v= 5;
        int Numeritor = (u*u) - (v*v);
        int Denomitor = (u+v) * (u-v);
        int result = Numeritor / Denomitor;
        System.out.println("Result of u^2 - v^2 / (u+v)(u-v) is :-" + result);
    }
    
}
