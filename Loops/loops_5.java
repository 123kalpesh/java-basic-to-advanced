public class loops_5 {
    public static void main(String[] args) {
        
        for (int i = 5; i >= 1; i--){
            for (int j = 5-i ; j >= 1; j--){
                System.out.print(2*i + j*2 -1);
            }
            System.out.println();
        }
    }
    
}
