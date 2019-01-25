package week10ex1;

public class PokemonApplication {
    public static void main(String[] args) {
        PokemonMethods player = new PokemonMethods();
        System.out.println("The top fastest pokemons " + player.getTopFiveFastestPokemon());
        System.out.println("The top legendary "+ player.get5LegendaryPokemons());
        System.out.println("Three Pokemon fire type"+ player.get3PokemonsFireType());
        System.out.println("Top two HP Pokemon "+ player.getTop2HPPokemons());


    }
}
