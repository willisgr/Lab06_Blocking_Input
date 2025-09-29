import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        String trash = "";
        int guess = 0;
        int number = generator.nextInt(10) + 1;

        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println("Invalid integer: " + trash);
            }
        } while(guess <= 0);

        if (guess == number) {
            System.out.println("You guessed the right number: " + number);
        } else if (guess > number) {
            System.out.println("Your guess was above the number: " + number);
        } else {
            System.out.println("Your guess was below the number: " + number);
        }
    }
}
