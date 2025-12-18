//package Arrary;
//Array in java :- Array is a collection of similar data types stored in a contiguous memory location.
//Array is a data structure that stores a fixed-size sequential collection of elements of the same type.
//Array is a collection of similar data types stored in a contiguous memory location.
//Array is a data structure that stores a fixed-size sequential collection of elements of the same type.

public class arrary_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        //Array Traversal
        for ( int i = 0; i <arr.length ; i++){
            System.out.println(arr[i]);
        }
        // Array Sum
        int sum = 0;
        for ( int j = 0; j<arr.length ; j++){
            sum = sum + arr[j];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
