import java.util.Scanner;
public class Squer {
   // t side;
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the side of the Squer:-");
      int side = sc.nextInt();
      System.out.println("Area of the Squer:-"+area(side));
      System.out.println("Peraminter of the Squer"+ perimeter(side));

      }

   public static int area(int side) {
      return side * side;
   }

   public static int perimeter(int side) {
      return 4 * side;
   }

}
