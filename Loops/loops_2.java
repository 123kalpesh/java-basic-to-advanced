//package Loops;

public class loops_2 {
    public static void main(String[] args) {
        for ( int i = 5 ; i>=1; i--){
           for( int j = 5-i ; j>=1; j--){ System.out.print("*");
        }
        System.out.println();
        }
        // output :- *
        //          **
        //          ***
        //          ****
        for ( int i = 0 ; i<5; i++){
        for ( int j = 5-1 ; j>=i; j--){ 
            System.out.print("*");
        }
        System.out.println();
        }
        // output :- *****
        //          ****
        //          ***
        //          **
        //          *


    }
    
}
