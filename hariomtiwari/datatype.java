package hariomtiwari;

public class datatype {
    public static void main(String[] args) {
        // Java's eight primitive data types
        byte smallNumber = 100;
        short shortNumber = 1_000;
        int number = 10_000;
        long largeNumber = 1_000_000_000L;
        float decimal = 20.5F;
        double preciseDecimal = 30.123456789;
        char character = 'A';
        boolean isLearningJava = true;

        System.out.println("Primitive data types:");
        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + shortNumber);
        System.out.println("int: " + number);
        System.out.println("long: " + largeNumber);
        System.out.println("float: " + decimal);
        System.out.println("double: " + preciseDecimal);
        System.out.println("char: " + character);
        System.out.println("boolean: " + isLearningJava);

        // Reference data types: String, arrays, objects, enums, and wrapper classes
        String message = "Hello, World!";
        int[] marks = {90, 85, 95};
        Student student = new Student("Hariom");
        Day today = Day.MONDAY;
        Integer wrappedNumber = 42;

        System.out.println("\nReference data type examples:");
        System.out.println("String: " + message);
        System.out.println("Array's first value: " + marks[0]);
        System.out.println("Object (Student name): " + student.name);
        System.out.println("Enum: " + today);
        System.out.println("Wrapper class (Integer): " + wrappedNumber);
    }

    static class Student {
        String name;

        Student(String name) {
            this.name = name;
        }
    }

    enum Day {
        MONDAY
    }
}
