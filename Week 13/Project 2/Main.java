package Project;

public class Main {
    public static void main(String[] args) {
        System.out.println("Player 1, enter your Pokemon.");
        Object x = PokemonSelection.createPokemon();
        System.out.println("\nPlayer 2, enter your Pokemon.");
        Object y = PokemonSelection.createPokemon();
        System.out.println("\nPlayer 1\n----------");
        System.out.println(x);
        System.out.println("\nPlayer 2\n----------");
        System.out.println(y);
    }
}
