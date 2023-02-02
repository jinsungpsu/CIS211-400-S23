import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> allCards = readCSV("pokemon.csv");
        Collections.shuffle(allCards);

        Stack<Pokemon> player = new LinkedStack<>();
        Stack<Pokemon> computer = new LinkedStack<>();

        for (int i = 0; i < 10; i++) {
            player.push(allCards.get(i));
        }
        for (int i = 10; i < 20; i++) {
            computer.push(allCards.get(i));
        }
    }

    static List<Pokemon> readCSV(String filename) {
        File file = new File(filename);

        List<Pokemon> pokemonList = new ArrayList<>();

        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();

            while (scan.hasNextLine()) {
                String[] info = scan.nextLine().split(",");
                // #,Name,Type 1,Type 2,Total,HP,Attack,Defense,Sp. Atk,Sp. Def,Speed,Generation,Legendary
                Pokemon poke = new Pokemon(info[1], Integer.parseInt(info[6]),Integer.parseInt(info[7]));
                pokemonList.add(poke);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }

        return pokemonList;
    }
}
