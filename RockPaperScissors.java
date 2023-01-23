import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello world! Lets play some Rock,Paper,Scissors?");


    final String ROCK = "Rock";
    final String PAPER = "Paper";
    final String SCISSORS = "Scissors";

    System.out.printf("Choose [r]ock, [p]aper or [s]cissors: ");
    String playerMove = scanner.nextLine();

    if (playerMove.equals("r") || playerMove.equals("rock")) {
        playerMove = ROCK;
    } else if (playerMove.equals("p") || playerMove.equals("paper")) {
        playerMove = PAPER;
    } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
        playerMove = SCISSORS;
    } else {
        System.out.println("Invalid Input. Try Again...");
        return;
    }
    Random random = new Random();
    int computerRandomNumber = random.nextInt(3);
    String computerMove = "";
    switch (computerRandomNumber) {
        case 0:
            computerMove = ROCK;
            break;
        case 1:
            computerMove = PAPER;
            break;
        case 2:
            computerMove = SCISSORS;
            break;
    }
    System.out.printf("The computer chose %s.%n", computerMove);

    if (playerMove.equals(ROCK) && computerMove.equals(SCISSORS) ||
            playerMove.equals(PAPER) && computerMove.equals(ROCK) ||
            playerMove.equals(SCISSORS) && computerMove.equals(PAPER)) {
        System.out.println("You win.");
    } else if (playerMove.equals(ROCK) && computerMove.equals(ROCK) ||
            playerMove.equals(PAPER) && computerMove.equals(PAPER) ||
            playerMove.equals(SCISSORS) && computerMove.equals(SCISSORS)) {
        System.out.println("This game was a draw.");
    } else if (playerMove.equals(SCISSORS) && computerMove.equals(ROCK) ||
            playerMove.equals(ROCK) && computerMove.equals(PAPER) ||
            playerMove.equals(PAPER) && computerMove.equals(SCISSORS)) {
        System.out.println("You lose.");
    }


}
}
