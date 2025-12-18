//package String;
// Strings in java :-  String is callection of characters.
// Strings are immutable in java means once we create a string we cannot change it.
//strings are data type in java but it is not a primitive data type it is a class.

public class strings_1 {
    
    public static void main(String[] args) {
        String str1= new String("Hello World");
        System.out.println(str1);
        String str2= new String("Hello java");
        System.out.println(str2);
        String str3= str1 + " " + str2; // concatenation of strings
        System.out.println(str3);
        System.out.println("Length of String :-" + str3.length());
        System.out.println("Character at index 5 :-" + str3.charAt(5));
        System.out.println("Substring from index 6 to 11 :-" + str3.substring(6, 11));
        System.out.println("Index of 'java' :-" + str2.indexOf("java"));// returns the index of first occurrence of the substring
        System.out.println("Replace 'World' with 'Java' :-" + str3.replace("World", "Java"));
        System.out.println("Convert to Uppercase :-" + str3.toUpperCase());
        System.out.println("Convert to Lowercase :-" + str3.toLowerCase());
    }
}
