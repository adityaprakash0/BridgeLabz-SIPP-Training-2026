// Interfaces with conflicting default methods
interface StreamingService {
    void streamMovie(String movieName);
    
    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription: Standard HD Plan Active.");
    }
}

interface GamingService {
    void playGame(String gameName);
    
    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription: Pro Cloud Gaming Active.");
    }
}

// Implementing class resolving the conflict
class SmartTV implements StreamingService, GamingService {
    
    @Override
    public void streamMovie(String movieName) {
        System.out.println("Now Streaming Movie: " + movieName);
    }

    @Override
    public void playGame(String gameName) {
        System.out.println("Now Launching Game: " + gameName);
    }

    // Resolving default method conflict
    @Override
    public void showSubscriptionDetails() {
        System.out.println("--- Smart TV Unified Subscriptions ---");
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

// Main class
public class SmartTVSystem {
    public static void main(String[] args) {
        String[] movies = {"Inception", "Interstellar"};
        String[] games = {"Cyberpunk 2077", "FIFA 24"};
        
        SmartTV myTv = new SmartTV();

        myTv.showSubscriptionDetails(); // Calls the overridden resolved method
        
        System.out.println("\n--- Available Content ---");
        for (String movie : movies) myTv.streamMovie(movie);
        for (String game : games) myTv.playGame(game);
    }
}
