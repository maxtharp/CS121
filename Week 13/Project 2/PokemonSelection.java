package Project;
import java.util.Scanner;

public class PokemonSelection {
    public static Object createPokemon() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pokemon name: ");
        String name = scanner.nextLine();
        System.out.print("Pokemon HP: ");
        int HP = Integer.parseInt(scanner.nextLine());
        System.out.print("Pokemon move: ");
        String move = scanner.nextLine();
        System.out.print("Pokemon power: ");
        int power = Integer.parseInt(scanner.nextLine());
        System.out.print("Pokemon speed: ");
        int speed = Integer.parseInt(scanner.nextLine());

        Pokemon pokemon = new Pokemon(name, HP, move, power, speed);
        return pokemon.displayPokemonStats();
    }
}
