public class ExplicitConversion {
    public static void main(String[] args) {
        double doubleVal = 9.99;
        int intVal = (int) doubleVal; // Explicit conversion
        System.out.println("Double: " + doubleVal);
        System.out.println("Integer (after conversion): " + intVal);
    }
}