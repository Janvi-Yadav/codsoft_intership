import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public void guessNo(){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        int randomNo = r.nextInt(1, 100);

        while (attempts <= 10) {
            System.out.println("Guess the Random number (1-100) : ");
            int guessNo = sc.nextInt();
            ++attempts;
            if (randomNo == guessNo) {
                System.out.println("You Guessed The Number Correct ! \nAnswer is " + guessNo);
                System.out.println("Attempts : "+ attempts);
                break;
            }

            if (guessNo > randomNo) {
                System.out.println("too high");
            } else {
                System.out.println("too low");
            }
        }
    }
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        t1.guessNo();
    }
}
