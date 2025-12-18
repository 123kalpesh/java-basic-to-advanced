import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + result);
        if (result =="Even"){
          System.out.println(++num);
           }
        else {
         System.out.println(num-1);        
}
    }
}

