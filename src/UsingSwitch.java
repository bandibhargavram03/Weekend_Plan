import java.util.Scanner;

public class UsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weekend plan");
        System.out.println("Enter 1 for movies");
        System.out.println("Enter 2 for shopping");
        System.out.println("Enter 3 for Eating out");
        System.out.println("Enter 4 for no plan");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> System.out.println("your weekend plan is going for a movie");
            case 2 -> System.out.println("your weekend plan is going for a shopping");
            case 3 -> System.out.println("Going For Eating out");
            case 4 -> System.out.println("sleep");
        }
    }
}
