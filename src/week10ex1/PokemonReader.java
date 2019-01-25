package week10ex1;

import Week4.week4ex9.FileReader;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PokemonReader {
    public FileReader reader=new FileReader();
    public List<Pokemon> getPokemons(){
        return reader.asList("week10ex1/pokemon.csv").stream()
                .skip(1)
                .map(l-> Arrays.asList(l.split(";")))
                .map(l->new Pokemon(
                        Integer.valueOf(l.get(0)),
                        l.get(1),
                        l.get(2),
                        l.get(3),
                        Integer.valueOf(l.get(4)),
                        Integer.valueOf(l.get(5)),
                        Integer.valueOf(l.get(6)),
                        Integer.valueOf(l.get(7)),
                        Integer.valueOf(l.get(8)),
                        Integer.valueOf(l.get(9)),
                        Integer.valueOf(l.get(10)),
                        Integer.valueOf(l.get(11)),
                        Boolean.valueOf(l.get(12))))
                .collect(Collectors.toList());

    }
}