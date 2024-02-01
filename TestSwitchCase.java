import java.util.Scanner;

public class TestSwitchCase {
    public static void main(String[] args) {
        System.out.print("What is your mobile OS (1:android,2:IOS,3:WindowsOS): ");
        Scanner keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Android");
                break;
            case 2:
                System.out.println("IOS");
                break;
            case 3:
                System.out.println("WindowsOS");
                break;
            default:
                System.out.println("Please insert 1,2 or 3 only!");
                break;
        }
    }
}
