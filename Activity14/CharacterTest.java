package Activity14;

public class CharacterTest {
    public static void main(String[] args) {
        Character character1 = new Character();
        Character character2 = new Character("Jo");
        Character character3 = new Character("Joey", 5, 12, 15);

        System.out.printf("Original health %d\n", character3.getHealth());
        character3.setHealth(10);
        System.out.printf("Set health: %d\n", character3.getHealth());
        character3.setHealth(10,character3.getStrength());
        System.out.printf("Set health with strength: %d\n", character3.getHealth());
    }
}
