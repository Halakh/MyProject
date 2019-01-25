package week10ex1;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PokemonMethods {
    private PokemonReader reader= new PokemonReader();
    public List<Pokemon> getTopFiveFastestPokemon() {
        return reader.getPokemons().stream()

                .sorted(Comparator.comparing(Pokemon::getSpeed))
                .limit(5)
                .collect(Collectors.toList());
    }

    public List<Pokemon> get5LegendaryPokemons() {
        return reader.getPokemons().stream()
                .filter(p -> p.getLegendary().equals(true))
                .limit(5)
                .collect(Collectors.toList());
    }
    public Set<Pokemon> get3PokemonsFireType() {
        return reader.getPokemons().stream()
                .filter(p -> p.getFirstType().equalsIgnoreCase("fire"))
                .limit(3)
                .collect(Collectors.toSet());
    }
    public Set<Pokemon> getTop2HPPokemons(){
        return reader.getPokemons().stream()
                .sorted(Comparator.comparing(Pokemon::gethP))
                .limit(2)
                .collect(Collectors.toSet());
    }
}
