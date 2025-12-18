
//package Arrary;
// Sum of array elements
import java.util.Scanner;

public class arrary_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] sumMatrix = new int[3][3];
        int[][] mulMatrix = new int[3][3];
        int sum = 0;
        int mul = 0;
// enter the elements of the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the element at position [" + i + "][" + j + "] :");
                matrix1[i][j] = scanner.nextInt();
                System.out.println();

            }
        }
// enter the elements of the second matrix
        System.out.println("Enter the elements of the Second matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the element at position [" + i + "][" + j + "] :");
                matrix2[i][j] = scanner.nextInt();
                System.out.println();

            }

        }
        // sum of the two matrices
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                sum = sum + sumMatrix[i][j];
            }
            System.out.println("-----------------------");
        }
// multiplication of the two matrices
        System.out.println("Multiplication of the two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mulMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
                mul = mul + sumMatrix[i][j];
            }
            System.out.println("-----------------------");
        }
        // print the sum of the two matrices
        System.out.println("Sum of the two matrices is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of the two matrices is:" + sum);
// print the multiplication of the two matrices
        System.out.println("Multiplication of the two matrices is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mulMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Multipication of the two matrices is:" + mul);

    }
}