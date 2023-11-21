import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weekend plan");
        System.out.println("Enter 1 for movies");
        System.out.println("Enter 2 for shopping");
        System.out.println("Enter 3 for Eating out");
        System.out.println("Enter 4 for no plan");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("your weekend plan is going for a movie");
        } else if (choice == 2) {
            System.out.println("your weekend plan is going for a shopping");
        } else if (choice == 3) {
            System.out.println("your weekend plan is going for a Eating out");
        } else if(choice == 4) {
            System.out.println("Sleep");
        }

    }
}
