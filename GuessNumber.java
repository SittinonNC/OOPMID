import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int randomNumber = randomNumbers.nextInt(100);
        System.out.println(randomNumber);

        Scanner keyboard = new Scanner(System.in);
        int guessNumber = 0;
        do {
            System.out.print("Insert guess number: ");
            guessNumber = keyboard.nextInt();

            if (guessNumber < randomNumber) {
                System.out.println("Your guess number is less than random number");
            } else if (guessNumber > randomNumber) {
                System.out.println("Your guess number is more than random number");
            } else {
                System.out.println("CONGRATULATIONS the random number = " + randomNumber);
            }
        } while (guessNumber != randomNumber);
    }
}
