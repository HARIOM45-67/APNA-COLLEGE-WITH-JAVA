package hariomtiwari;

public class vriable {
    // Instance variable: each object has its own value.
    int age = 20;

    // Static variable: shared by all objects of this class.
    static String school = "Apna College";

    public static void main(String[] args) {
        // Local variables and Java's eight primitive data types.
        byte smallNumber = 100;
        short shortNumber = 1_000;
        int number = 10_000;
        long largeNumber = 1_000_000_000L;
        float decimal = 5.5F;
        double preciseDecimal = 19.99;
        char grade = 'A';
        boolean isLearningJava = true;

        // Reference variables store references to objects or arrays.
        String name = "Hariom";
        int[] marks = {90, 85, 95};
        vriable student = new vriable();

        // A final variable can be assigned only once.
        final double PI = 3.14159;

        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + shortNumber);
        System.out.println("int: " + number);
        System.out.println("long: " + largeNumber);
        System.out.println("float: " + decimal);
        System.out.println("double: " + preciseDecimal);
        System.out.println("char: " + grade);
        System.out.println("boolean: " + isLearningJava);
        System.out.println("String: " + name);
        System.out.println("Array first value: " + marks[0]);
        System.out.println("Instance variable (age): " + student.age);
        System.out.println("Static variable (school): " + vriable.school);
        System.out.println("Constant (PI): " + PI);
    }
}
