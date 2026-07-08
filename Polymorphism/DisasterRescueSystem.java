abstract class RescueTeam {
    private String teamId;
    private String location;

    public RescueTeam(String teamId, String location) {
        this.teamId = teamId;
        this.location = location;
    }

    public String getTeamId() { return teamId; }
    public String getLocation() { return location; }

    public abstract void performDuty();
}

class MedicalTeam extends RescueTeam {
    public MedicalTeam(String teamId, String location) { super(teamId, location); }
    @Override public void performDuty() { System.out.println(getTeamId() + " providing first-aid and trauma care at " + getLocation()); }
}

class FireRescueTeam extends RescueTeam {
    public FireRescueTeam(String teamId, String location) { super(teamId, location); }
    @Override public void performDuty() { System.out.println(getTeamId() + " clearing debris and extracting survivors at " + getLocation()); }
}

class FoodSupplyTeam extends RescueTeam {
    public FoodSupplyTeam(String teamId, String location) { super(teamId, location); }
    @Override public void performDuty() { System.out.println(getTeamId() + " distributing clean water and rations at " + getLocation()); }
}

public class DisasterRescueSystem {

    public static void findTeamByLocation(RescueTeam[] teams, String location) {
        System.out.println("Teams deployed in " + location + ":");
        for (RescueTeam team : teams) {
            if (team.getLocation().equalsIgnoreCase(location)) {
                System.out.println("- " + team.getTeamId() + " (" + team.getClass().getSimpleName() + ")");
            }
        }
    }

    public static void displayTeamsByPrefix(RescueTeam[] teams, String prefix) {
        System.out.println("Teams with ID starting with '" + prefix + "':");
        for (RescueTeam team : teams) {
            if (team.getTeamId().startsWith(prefix)) {
                System.out.println("- " + team.getTeamId());
            }
        }
    }

    public static void analyzeDeployments(RescueTeam[] teams) {
        int medCount = 0, fireCount = 0, foodCount = 0;
        
        for (RescueTeam team : teams) {
            if (team instanceof MedicalTeam) medCount++;
            else if (team instanceof FireRescueTeam) fireCount++;
            else if (team instanceof FoodSupplyTeam) foodCount++;
        }

        System.out.println("Deployments: Medical(" + medCount + "), FireRescue(" + fireCount + "), FoodSupply(" + foodCount + ")");

        // Find Maximum
        String maxCategory = "Medical";
        int max = medCount;

        if (fireCount > max) { max = fireCount; maxCategory = "FireRescue"; }
        if (foodCount > max) { max = foodCount; maxCategory = "FoodSupply"; }

        System.out.println("Category with Maximum Deployments: " + maxCategory + " (" + max + " teams)");
    }

    public static void main(String[] args) {
        RescueTeam[] deployedTeams = {
            new MedicalTeam("MED-01", "Sector A"),
            new MedicalTeam("MED-02", "Sector B"),
            new FireRescueTeam("FIRE-01", "Sector A"),
            new FoodSupplyTeam("FOOD-01", "Sector C"),
            new FoodSupplyTeam("FOOD-02", "Sector A")
        };

        System.out.println("--- Executing Duties ---");
        for (RescueTeam t : deployedTeams) t.performDuty();

        System.out.println("\n--- Analysis ---");
        analyzeDeployments(deployedTeams);
        
        System.out.println("\n--- Search ---");
        findTeamByLocation(deployedTeams, "Sector A");
        displayTeamsByPrefix(deployedTeams, "MED");
    }
}
