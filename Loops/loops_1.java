//package Loops;
//Loops in java: Loops are used to execute a block of code repeatedly.
// Types of Loops in java:
// 1. for loop
// 2. while loop
// 3. do-while loop
// 4. for-each loop  :- Syntax: for(type variable : array){
//                          //code to be executed
//                      }
// 5. nested loop
// 6. labeled loop
// 7. goto loop  :- Syntax: goto label;
// 8. break and continue statements
public class loops_1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        //for-each loop
        System.out.println("for-each loop");
        for(int i : arr){
            System.out.println(i);
        }
        //for loop
        System.out.println("for loop");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //while loop
        System.out.println("while loop");
        int i=0;
        while(i<arr.length){
            System.out.println(arr[i]);
            i++;
        }
        //do-while loop
        System.out.println("do-while loop");
        int j = 0;
        do{
            System.err.println(arr[i]);
            i++;

        }while(i<arr.length);
    }
    
}
