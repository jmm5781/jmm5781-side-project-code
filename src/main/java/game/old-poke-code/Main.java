import game.Pokemon;
import game.PokemonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pokemon> pokemonList = new ArrayList<>();
        PokemonService service = new PokemonService();

        while (true) {
            System.out.println("Let's catch some Pokemon!");
            System.out.println("1. Get first group of 20");
            System.out.println("2. Get second group of 20");
            System.out.println("3. Get third group of 20");
            System.out.println("4. Quit");
            System.out.println();
            System.out.println("Enter choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 4) break;

            switch (choice) {
                case 1: pokemonList = service.getAllPokemon();
                    printThaPokies(pokemonList);
                break;
                case 2: pokemonList = service.getAllPokemon();
                    printThaPokies(pokemonList);
                    break;
                case 3: pokemonList = service.getAllPokemon();
                    printThaPokies(pokemonList);
                    break;
            }
        }
    }

    static void printThaPokies(List<Pokemon> pokies) {
        for (Pokemon poke : pokies) System.out.println(poke);
    }
}
