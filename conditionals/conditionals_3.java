// write a java program to find the type of website from the url
// .com - commercial website
// .org - organization website
// .edu - education website
// .gov - government website
// .net - network website

import java.util.Scanner;
public class conditionals_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the url: ");
        String url = scanner.nextLine();
        if(url.endsWith(".com")){
            System.out.println("The website is a commercial website");
        }else if (url.endsWith(".org")){
            System.out.println("The website is an organization website");
        }else if (url.endsWith(".edu")){
            System.out.println("The website is an education website");
        }else if (url.endsWith(".gov")){
            System.out.println("The website is a government website");
        }else if (url.endsWith(".net")){
            System.out.println("The website is a network website");
        }else{
            System.out.println("The website is not a valid website");
        }
    }
}