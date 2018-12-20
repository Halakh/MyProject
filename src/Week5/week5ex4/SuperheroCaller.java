package week5ex4;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SuperheroCaller {
    public List<Superhero> superheroes= getHeroes();
    Random random = new Random();


    private List<Superhero> getHeroes() {
        return Arrays.asList(new Batman(),new Superman(),new Spiderman());

    }
    public Superhero callSuperhero() {
        int position= random.nextInt(3);
        Superhero superhero= superheroes.get(position);
        return superhero;
    }


}

//Create the SuperheroCaller class that has a
// list with the three superheroes. It has the
// call method that returns
// a random Superhero every time you use it.
