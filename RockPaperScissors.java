import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("=== Rock Paper Scissors Game ===");
        System.out.println("Enter your choice:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        int userChoice = sc.nextInt();

        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice!");
            return;
        }

        int computerChoice = random.nextInt(3) + 1;

        System.out.println("\nYou chose: " + choices[userChoice - 1]);
        System.out.println("Computer chose: " + choices[computerChoice - 1]);

        // Game Logic
        if (userChoice == computerChoice) {
            System.out.println("It's a Draw!");
        }
        else if ((userChoice == 1 && computerChoice == 3) ||
                 (userChoice == 2 && computerChoice == 1) ||
                 (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Wins!");
        }

        sc.close();
    }
}
