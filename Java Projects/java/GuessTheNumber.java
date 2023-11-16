import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    static Random rm = new Random();
    static Scanner sc = new Scanner(System.in);
    static int guess_num;
    static int ram_num; 
    static int total_chances = 0;

    public void guessNumber() {
        System.out.println("\033[H\033[2J");
        ram_num = rm.nextInt(50);
        System.out.println("Guess the number in between (0-50) ");
        do {
            guess_num = sc.nextInt();
            if (guess_num == ram_num) {
                System.out.println("Correct answer");
                System.out.println("You won after " + total_chances + " chances");
            } else if (ram_num > guess_num) {
                System.out.println("Guess a big number");
                total_chances += 1;
            } else if (ram_num < guess_num) {
                System.out.println("Guess a small number");
                total_chances += 1;
            }
        } while (guess_num != ram_num);
    }

    public static void main(String[] args) {
        GuessTheNumber u1 = new GuessTheNumber();
        u1.guessNumber();
    }
}
