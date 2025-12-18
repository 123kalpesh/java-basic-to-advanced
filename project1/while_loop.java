package project1;
import java.util.Scanner;
 public class while_loop{
 
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Hello");
        int age[] ={12,4,5};
        System.out.println("Useing the reversed loop");
        for (int i=2; i<=age.length;i--){
            System.out.println(age[i]+" ");
        }
        System.out.println("using the forvard arry");
        for (int i: age) {
            System.out.println(age[i]);
        
        }
    }
    
 }