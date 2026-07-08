interface TextModeration {
    void checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: No offensive or explicit language allowed.");
    }

    // Static method
    static boolean containsRestrictedWords(String post) {
        String[] restrictedWords = {"abuse", "hate", "kill"};
        for (String word : restrictedWords) {
            if (post.toLowerCase().contains(word)) return true;
        }
        return false;
    }
}

interface SpamDetection {
    void checkSpamContent(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: No repetitive spam or excessive links allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public void checkOffensiveContent(String post) {
        if (TextModeration.containsRestrictedWords(post)) {
            System.out.println("Status [OFFENSIVE]: " + post);
        } else {
            System.out.println("Status [VALID TEXT]: " + post);
        }
    }

    @Override
    public void checkSpamContent(String post) {
        if (post.contains("http") || post.contains("buy now")) {
            System.out.println("Status [SPAM]: " + post);
        } else {
            System.out.println("Status [VALID FORMAT]: " + post);
        }
    }

    @Override
    public void displayModerationPolicy() {
        System.out.println("--- Platform Unified Moderation Policy ---");
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
    
    public void moderatePost(String post) {
        System.out.println("\nEvaluating Post: \"" + post + "\"");
        if (TextModeration.containsRestrictedWords(post)) {
            System.out.println("-> Action: BLOCKED (Offensive)");
        } else if (post.contains("http") || post.contains("buy now")) {
            System.out.println("-> Action: BLOCKED (Spam)");
        } else {
            System.out.println("-> Action: APPROVED (Valid)");
        }
    }
}

public class ContentModerationPlatform {
    public static void main(String[] args) {
        String[] userPosts = {
            "Hello everyone, having a great day!",
            "Click here to buy now http://spamlink.com",
            "I hate this, I will kill you!",
            "Just finished reading a good book."
        };

        ContentModerator aiModerator = new ContentModerator();
        aiModerator.displayModerationPolicy();

        for (String post : userPosts) {
            aiModerator.moderatePost(post);
        }
    }
}
