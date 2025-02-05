import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Num1 = 3, Num2 = 5;

        System.out.println("Please enter a number to see if it is divisible by 3 or 5");
        int input = Integer.parseInt(scanner.nextLine());

        Boolean IsDivisible = (input % Num1 == 0 && input % Num2 == 0);

        System.out.println("The number you have entered reported: " + IsDivisible);

        scanner.close();

    }
}
