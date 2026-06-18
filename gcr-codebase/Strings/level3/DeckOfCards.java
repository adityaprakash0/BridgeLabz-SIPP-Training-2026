import java.util.Scanner;

public class DeckOfCards {

    // Initialize Deck
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];

        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        return deck;
    }

    // Shuffle Deck
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Distribute Cards
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            System.err.println("Not enough cards for distribution!");
            return new String[0][0];
        }

        String[][] distribution = new String[players][cardsPerPlayer];
        int cardIndex = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distribution[i][j] = deck[cardIndex++];
            }
        }
        return distribution;
    }

    // Print Cards
    public static void printHands(String[][] playersHands) {
        for (int i = 0; i < playersHands.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + "'s Hand:");
            for (int j = 0; j < playersHands[i].length; j++) {
                System.out.println("- " + playersHands[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int numPlayers = input.nextInt();
        System.out.print("Enter cards per player: ");
        int numCards = input.nextInt();

        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        
        String[][] hands = distributeCards(deck, numPlayers, numCards);
        if (hands.length > 0) {
            printHands(hands);
        }
        input.close();
    }
}