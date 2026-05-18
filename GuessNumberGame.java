import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        int secret = new Random().nextInt(10) + 1;
        int guess = 5;
        System.out.println("Secret number (for demo): " + secret);
        System.out.println("Guess = " + guess);
        System.out.println(guess == secret ? "You guessed it!" : "Try again.");
    }
}
