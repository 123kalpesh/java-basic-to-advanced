package project1;

import java.util.Scanner;

public class If_loop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num_1 = scanner.nextInt();
        int num_3 = scanner.nextInt();
        int num_2 = scanner.nextInt();
        if(num_1>=num_2 && num_1 >= num_3){
            System.out.println("Number is big :-"+num_1);
        }else if(num_2>=num_3){
            System.out.println("Number is big :-"+num_2);
            
        }else{
            System.out.println("Number is big :-"+num_3);
        }

    }
}
