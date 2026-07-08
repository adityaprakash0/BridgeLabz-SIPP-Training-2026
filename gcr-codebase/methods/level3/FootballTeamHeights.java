public class FootballTeamHeights {

    public static void populateHeights(int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            // Random height between 150 and 250 cms
            heights[i] = (int) (Math.random() * 101) + 150;
        }
    }

    public static int calculateTotalSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double calculateMeanHeight(int[] heights) {
        int sum = calculateTotalSum(heights);
        return (double) sum / heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int teamSize = 11;
        int[] playerHeights = new int[teamSize];

        populateHeights(playerHeights);

        System.out.print("Player Heights (cm): ");
        for (int height : playerHeights) {
            System.out.print(height + " ");
        }
        System.out.println();

        System.out.println("Mean Height: " + calculateMeanHeight(playerHeights) + " cm");
        System.out.println("Shortest Height: " + findShortestHeight(playerHeights) + " cm");
        System.out.println("Tallest Height: " + findTallestHeight(playerHeights) + " cm");
    }
}
