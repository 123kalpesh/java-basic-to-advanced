abstract class Pen {

    public abstract void chnagenib();
    public  void write() {
        System.out.println("Pen is writing");
    }
    public void refill(){
        System.out.println("Now Refilling Your pen");
    }
    public void display(){
        System.out.println("Pen is Displaying");
    }
}

class Fountenpen extends Pen {
    public void chnagenib(){
        System.out.println("here You change The Founten Pen Nib");
    }
}

public class Abstract_2 {
    public static void main (String[] args){
        Fountenpen myFount = new Fountenpen();
        myFount.write();
        myFount.chnagenib();
        myFount.display();
        myFount.refill();

    }
}
