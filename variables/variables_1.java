//variables in java :- variables are containers for storing data values.
//In java there are three types of variables:
//1. Local Variables
//2. Instance Variables
//3. Static Variables
public class variables_1{
//     int instancevar=20; //instance variable
//     static int staticvar=30; //static variable
//     public void method(){
//         int localvar=10; //local variable
//         System.out.println("Local Variable: " + localvar);
//     }
//     public static void main(String args[]){
//         variables_1 obj=new variables_1();
//         obj.method();
//         System.out.println("Instance Variable: " + obj.instancevar);
//         System.out.println("Static Variable: " + staticvar);    
// }
    int a =10;
    static int b =20;
    public void display(){
        int c=30;
        System.out.println("Local variable:-" +c);
    }
    public static void main (String[] args){
        variables_1 obj =new variables_1();
        obj.display();
        System.out.println("Instance variable:-"+obj.a);
        System.out.println("static variable:-"+b);
    }

}