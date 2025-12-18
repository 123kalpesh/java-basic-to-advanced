abstract class Calculator {
    abstract int add(int a, int b);
}

class Addition extends Calculator {
    @Override
    int add(int a, int b) {
        return a + b;
    }
}


public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Addition();
        int result = calculator.add(5, 3);
        System.out.println("The sum is: " + result);
    }
}
