// DataType:- A class to demonstrate different data types in Java
//          data type haveing different sizes and values
//          showing the usage of primitive data types
//          and their default values in Java.
//         most commonly used data types in java are:
//         byte, short, int, long, float, double, char, boolean
// DataType:- A class to demonstrate different data types in Java
// Showing usage of primitive data types and their sizes/values
class DataType {
    public static void main(String[] args) {
        // byte data type
        byte byteVar = 100;
        System.out.println("Byte Value: " + byteVar);
       // System.out.println("Byte Size: " + Byte.BYTES + " bytes");
        System.out.println("Byte min value: " + Byte.MIN_VALUE);
        System.out.println("Byte max value: " + Byte.MAX_VALUE);

        // short data type 
        short shortVar = 10000;
        System.out.println("\nShort Value: " + shortVar);
        //System.out.println("Short Size: " + Short.BYTES + " bytes");
        System.out.println("Short min value: " + Short.MIN_VALUE);
        System.out.println("Short max value: " + Short.MAX_VALUE);

        // int data type
        int intVar = 100000;
        System.out.println("\nInt Value: " + intVar);
        //System.out.println("Int Size: " + Integer.BYTES + " bytes");
        System.out.println("Int min value: " + Integer.MIN_VALUE);
        System.out.println("Int max value: " + Integer.MAX_VALUE);

        // long data type
        long longVar = 100000L;
        System.out.println("\nLong Value: " + longVar);
        //System.out.println("Long Size: " + Long.BYTES + " bytes");
        System.out.println("Long min value: " + Long.MIN_VALUE);
        System.out.println("Long max value: " + Long.MAX_VALUE);

        // float data type
        float floatVar = 10.5f;
        System.out.println("\nFloat Value: " + floatVar);
        //System.out.println("Float Size: " + Float.BYTES + " bytes");
        System.out.println("Float min value: " + Float.MIN_VALUE);
        System.out.println("Float max value: " + Float.MAX_VALUE);

        // double data type
        double doubleVar = 20.09980009;
        System.out.println("\nDouble Value: " + doubleVar);
       // System.out.println("Double Size: " + Double.BYTES + " bytes");
        System.out.println("Double min value: " + Double.MIN_VALUE);
        System.out.println("Double max value: " + Double.MAX_VALUE);

        // char data type
        char charVar = 'A';
        System.out.println("\nChar Value: " + charVar);
        //System.out.println("Char Size: " + Character.BYTES + " bytes"); 
        System.out.println("Char min value: " + (int)Character.MIN_VALUE);
        System.out.println("Char max value: " + (int)Character.MAX_VALUE);

        // boolean data type
        boolean boolVar = true;
        System.out.println("\nBoolean Value: " + boolVar);
        System.out.println("Boolean has no fixed size in Java");
    }
}
