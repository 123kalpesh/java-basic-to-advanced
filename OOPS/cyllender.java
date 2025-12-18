public class cyllender {
    private int radius;
    private int height; 
    public cyllender(){
        this.radius = 1;
        this.height = 1;
    }
    
    public double getVolume(){
        return 3.14 * radius * radius * height;
    }
    
    public double getSurfaceArea(){
        return 3.14 * radius * (radius + height);
    }
    
    // Getter for radius
    public int getRadius() {
        return radius;
    }
    
    // Setter for radius
    public void setRadius(int radius) {
        System.out.println("Radius is : " + radius);
        this.radius = radius;
    }
    
    // Getter for height
    public int getHeight() {
        return height;
    }
    
    // Setter for height
    public void setHeight(int height) {
        System.out.println("Height is : " + height);
        this.height = height;
    }
    public static void main (String[] args){
        cyllender c = new cyllender();
        c.setRadius(2);
        c.setHeight(3);
        System.out.println("Volume is : " + c.getVolume());
        System.out.println("Surface Area is : " + c.getSurfaceArea());
        System.out.println("Radius is : " + c.getRadius());
        System.out.println("Height is : " + c.getHeight());
    }
}