import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Please enter you name: ");
        String name = scanner.nextLine();
        
        System.out.println("What is your age? ");
        String age = scanner.nextLine();

        System.out.println("What is your height? ");
        String height = scanner.nextLine();

        System.out.println("What is your favorite Number?");
        int favNum = Integer.parseInt(scanner.nextLine());

        System.out.println("So, your name is " + name + " and you are " + age + " Years old, Your height is " + height + "." );
        System.out.println("And your favorite number divided by 5 is " + (favNum / 5) + ".");

        scanner.close();
    }
    
}
