import java.util.Scanner;

public class RockPaperScissorsGame {

    // Get computer choice [cite: 289]
    public static String getComputerChoice() {
        int random = (int) (Math.random() * 3);
        if (random == 0) return "rock";
        if (random == 1) return "paper";
        return "scissors";
    }

    // Determine winner [cite: 290]
    public static String determineWinner(String player, String computer) {
        if (player.equals(computer)) return "Tie";
        if (player.equals("rock") && computer.equals("scissors")) return "Player"; [cite: 287, 288]
        if (player.equals("paper") && computer.equals("rock")) return "Player"; [cite: 287, 288]
        if (player.equals("scissors") && computer.equals("paper")) return "Player"; [cite: 287, 288]
        return "Computer";
    }

    // Calculate stats [cite: 291]
    public static String[][] calculateStats(int playerWins, int computerWins, int ties, int totalGames) {
        double playerPct = (totalGames == 0) ? 0 : ((double) playerWins / totalGames) * 100;
        double computerPct = (totalGames == 0) ? 0 : ((double) computerWins / totalGames) * 100;
        
        return new String[][] {
            {"Player Wins", String.valueOf(playerWins), String.format("%.2f%%", playerPct)},
            {"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", computerPct)},
            {"Ties", String.valueOf(ties), "N/A"}
        }; [cite: 291]
    }

    // Display results [cite: 292]
    public static void displayGameResults(String[][] stats) {
        System.out.println("\n--- Game Statistics ---");
        System.out.printf("%-15s | %-10s | %-15s%n", "Entity", "Total Wins", "Win Percentage");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.printf("%-15s | %-10s | %-15s%n", stats[i][0], stats[i][1], stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of games to simulate: ");
        int totalGames = input.nextInt(); [cite: 293]

        int playerWins = 0, computerWins = 0, ties = 0;

        for (int i = 0; i < totalGames; i++) {
            String computer = getComputerChoice();
            // Automatically simulating player choices here for the multi-game simulation
            String player = getComputerChoice(); 
            String winner = determineWinner(player, computer);

            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
            else ties++;
        }

        String[][] stats = calculateStats(playerWins, computerWins, ties, totalGames);
        displayGameResults(stats); [cite: 293]
        
        input.close();
    }
}