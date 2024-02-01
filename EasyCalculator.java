import java.util.Scanner;

public class EasyCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int operand1, operand2;

        System.out.println("--Easy Calculator");
        System.out.print("Operand1: ");
        operand1 = keyboard.nextInt();
        System.out.print("Operand2: ");
        operand2 = keyboard.nextInt();
        int result = operand1 + operand2;
        System.out.println(operand1 + " + " + operand2 + " = " + result);
    }
}
