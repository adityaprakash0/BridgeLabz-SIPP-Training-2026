// Superclass
abstract class GameCharacter {
    private String characterName;

    public GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterName() { return characterName; }

    public abstract void performAttack();
}

// Subclasses
class Warrior extends GameCharacter {
    public Warrior(String characterName) { super(characterName); }

    @Override
    public void performAttack() {
        System.out.println(getCharacterName() + " swings a heavy broadsword! (Melee Damage)");
    }
}

class Mage extends GameCharacter {
    public Mage(String characterName) { super(characterName); }

    @Override
    public void performAttack() {
        System.out.println(getCharacterName() + " casts a blazing fireball! (Magic Damage)");
    }
}

class Archer extends GameCharacter {
    public Archer(String characterName) { super(characterName); }

    @Override
    public void performAttack() {
        System.out.println(getCharacterName() + " shoots a piercing arrow! (Ranged Damage)");
    }
}

// Main class
public class AdventureGameSystem {
    
    // Method to invoke attacks polymorphically and count types
    public static void startBattle(GameCharacter[] characters) {
        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        System.out.println("--- Battle Commences ---");
        for (GameCharacter character : characters) {
            character.performAttack(); // Polymorphic call

            // Counting logic
            if (character instanceof Warrior) warriorCount++;
            else if (character instanceof Mage) mageCount++;
            else if (character instanceof Archer) archerCount++;
        }

        System.out.println("\n--- Battle Summary ---");
        System.out.println("Warriors Participated: " + warriorCount);
        System.out.println("Mages Participated: " + mageCount);
        System.out.println("Archers Participated: " + archerCount);
    }

    public static void main(String[] args) {
        GameCharacter[] party = {
            new Warrior("Arthur"),
            new Mage("Merlin"),
            new Archer("Legolas"),
            new Warrior("Conan")
        };

        startBattle(party);
    }
}
