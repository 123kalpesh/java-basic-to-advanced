import java.util.Scanner;
public class areaShap{
    double getArea_circle(int radius){
        return radius * radius  * 3.14;
    }
    int getArea_rect(int length, int width){
        return length * width;
    }
    double getArea_triangle(int base, int height){
        return base * height /2;
    }
    double getArea_cyllender(int radius , int height){
        return radius * radius *height * 3.14;

    }
    public static void main (String[] args){
        areaShap area = new areaShap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        System.out.println("Enter the radius of the circle: ");
        //int radius2= area.nextInt();
        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        int width = sc.nextInt();
        System.out.println("Enter the base of the triangle: ");
        int base = sc.nextInt();
        System.out.println("Enter the height of the triangle: ");
        int height = sc.nextInt();
        System.out.println("Enter the radius of the cyllender: ");
        int radius_cyllender = sc.nextInt();
        System.out.println("Enter the height of the cyllender: ");
        int height_cyllender = sc.nextInt();

        System.out.println("The area of the circle is: " + area.getArea_circle(radius));
        System.out.println("The area of the rectangle is: " + area.getArea_rect(length, width));
        System.out.println("The area of the triangle is: " + area.getArea_triangle(base, height));
        System.out.println("The area of the cyllender is: " + area.getArea_cyllender(radius_cyllender, height_cyllender));
    }

}