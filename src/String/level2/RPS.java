package String.level2;

import java.util.Scanner;

class RPS {
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        int index = (int)(Math.random() * 3);
        return choices[index];
    }

    public static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("scissors") && comp.equals("paper")) ||
                (user.equals("paper") && comp.equals("rock")))
            return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0, draws = 0;

        System.out.println("🎮 Welcome to Rock-Paper-Scissors!");
        System.out.println("Type 'rock', 'paper', or 'scissors' to play.\n");

        for (int round = 1; round <= 10; round++) {
            System.out.print("Round " + round + " - Your move: ");
            String userChoice = sc.nextLine().toLowerCase();

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid input. Please enter rock, paper, or scissors.");
                round--; // retry this round
                continue;
            }

            String compChoice = getComputerChoice();
            String winner = getWinner(userChoice, compChoice);

            System.out.println("Computer chose: " + compChoice);
            System.out.println("Result: " + winner + " wins this round!\n");

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;
        }

        System.out.println("🎯 Game Over! Here's the summary:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + draws);

        if (userWins > compWins)
            System.out.println("🏆 You win the game!");
        else if (compWins > userWins)
            System.out.println("💻 Computer wins the game!");
        else
            System.out.println("🤝 It's a tie!");
    }
}