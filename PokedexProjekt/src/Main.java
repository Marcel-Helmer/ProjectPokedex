import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Erstelle eine ArrayList für das PokeTeam
        ArrayList<String> PokeTeam = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Initiale Pokémon hinzufügen
        PokeTeam.add(PokemonList.pokedex.get(1).getName());
        PokeTeam.add(PokemonList.pokedex.get(6).getName());
        PokeTeam.add(PokemonList.pokedex.get(34).getName());


        //PokemonList.pokedex.get(1).zeigeEintrag();

        System.out.println("Fahre Pokedex hoch");
        System.out.println("Hallo Trainer, was möchtest du gerne tun?");

        // Auswahl Team oder Pokedex


        for (;;) {
            System.out.println("1. In den Pokedex sehen");
            System.out.println("2. Verwaltung des Teams");
            int choose = scanner.nextInt();


// Ab hier beginnt die Abfrage des Pokedex

            switch (choose) {
                case 1:
                    System.out.println("Leite zum Pokedex");
                    for (; ; ) {
                        System.out.println("1. Liste aller Pokemon");
                        System.out.println("2. Spezifisches Pokemon");
                        System.out.println("3. Zurück");
                        int Pokedex = scanner.nextInt();

                        switch (Pokedex) {
                            case 1:
                                System.out.println("Hier eine vollständige lister aller Pokemon");
                                for (int i = 1; i < PokemonList.pokedex.size(); i++)
                                    PokemonList.pokedex.get(i).zeigeEintrag();
                                break;
                            case 2:
                                System.out.println("Bitte geben sie eine Nummer ein (1 - " + (PokemonList.pokedex.size() - 1) + ")");
                                int pokedexNr = scanner.nextInt();
                                PokemonList.pokedex.get(pokedexNr).zeigeEintrag();
                                break;
                            case 3:
                                System.out.println("Gehe zurück");

                            default:
                                if (Pokedex != 1 && Pokedex != 2 && Pokedex != 3) {
                                    System.out.println("Fehlerhafte eingabe");
                                }
                        }
                        break;
                    }
                    break;


// Ab hier beginnt die Teamverwaltung
                case 2:
                    System.out.println("Sie möchten Ihr Team verwalten");

                    for (; ; ) {

                        System.out.println("1. Team ansehen");
                        System.out.println("2. Pokemon hinzufügen");
                        System.out.println("3. Pokemon entfernen");
                        System.out.println("4. Pokedexeintrag Prüfen");
                        System.out.println("5. Zurück");

                        int team = scanner.nextInt();

                        switch (team) {

                            case 1:
                                System.out.println("Dein aktuellen Team:");
                                for (int i = 0; i < PokeTeam.size(); i++) {
                                    System.out.println(PokeTeam.get(i));
                                }
                                break;
                            case 2:
                                while (true) {
                                    System.out.println("Gib eine Zahl ein, um deinem Team ein Pokemon hinzuzufügen " + (PokemonList.pokedex.size() - 1) + " (oder 0 zum Beenden): ");
                                    for (int i = 0; i < PokeTeam.size(); i++) {
                                        System.out.println((i + 1) + ". " + PokeTeam.get(i));
                                    }
                                    int addPoke = scanner.nextInt();


                                    if (addPoke == 0) {
                                        break; // Beende die Schleife, wenn 0 eingegeben wird
                                    }

                                    if (addPoke < 1 || addPoke > 40) {
                                        System.out.println("Ungültige Zahl. Bitte gib eine Zahl zwischen 1 und 40 ein.");
                                    } else {
                                        PokeTeam.add(PokemonList.pokedex.get(addPoke).getName());
                                        System.out.println("Pokemon hinzugefügt: " + PokemonList.pokedex.get(addPoke).getName());
                                    }
                                }
                                break;
                            case 3:


                                while (true) {
                                    for (int i = 0; i < PokeTeam.size(); i++) {
                                        System.out.println((i + 1) + ". " + PokeTeam.get(i));
                                    }
                                    System.out.println("Gib eine Zahl ein, um ein Pokémon zu entfernen (oder 0 zum Beenden): ");
                                    int pokeDelete = scanner.nextInt();

                                    if (pokeDelete == 0) {
                                        break; // Beende die Schleife, wenn 0 eingegeben wird
                                    }

                                    if (pokeDelete < 1 || pokeDelete > 40) {
                                        System.out.println("Ungültige Zahl. Bitte gib eine Zahl zwischen 1 und 40 ein.");
                                    } else {
                                        String pokemonToRemove = PokeTeam.get(pokeDelete - 1);
                                        if (PokeTeam.contains(pokemonToRemove)) {
                                            PokeTeam.remove(pokemonToRemove);
                                            System.out.println("Pokémon entfernt: " + pokemonToRemove);
                                        } else {
                                            System.out.println("Pokémon nicht im Team: " + pokemonToRemove);
                                        }
                                    }
                                }


                                break;
                            case 4:

                                System.out.println("Welches Pokemon möchtest du Prüfen?");
                                for (int i = 0; i < PokeTeam.size(); i++) {
                                    System.out.println((i+1) + ". " + PokeTeam.get(i));
                                }

                                int dexNr = scanner.nextInt();

                                PokemonList.pokedex.get(dexNr).zeigeEintrag();

                            case 5:
                                System.out.println("Zurück");
                                break;


                            default:
                                System.out.println("Fehlerhafte Eingabe");


                        }
                        break;
                    }
            }
        }
    }
}