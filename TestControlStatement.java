import java.util.Scanner;

public class TestControlStatement {
    public static void main(String[] args) {
        System.out.print("What is temperatrue outside? ");
        Scanner keyboard = new Scanner(System.in);
        double temperatrue = keyboard.nextDouble();
        boolean isColdoutside = false;
        if (temperatrue <= 20)
            isColdoutside = true;
        System.out.print("Is  it snowing (true/false)? ");
        boolean isSnowing = keyboard.nextBoolean();

        if (isColdoutside == true) {
            if (isSnowing) {
                System.out.println("Wear parka");
            } else {
                System.out.println("Wear jacket");
            }

        } else {
            System.out.println("Wear shorts ");
        }

        if (isColdoutside && isSnowing) {
            System.out.println("Wear parka ");
        } else if (isColdoutside && isSnowing == false) {
            System.out.println("Wear jacket");
        } else if (isColdoutside == false) {
            System.out.println("Wear shorts ");
        }
    }

}
