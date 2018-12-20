package week5ex4;

import java.util.ArrayList;

public class SuperheroApplication {
    public static void main(String[] args) {
        SuperheroCaller superheroCaller = new SuperheroCaller();
        superheroCaller.callSuperhero();
        System.out.println("Superhero: " + superheroCaller.callSuperhero());
        ArrayList<Superhero> heroes = new ArrayList<>();
        for (int times=1 ; times<=6; times++){
            heroes.add(superheroCaller.callSuperhero());


            System.out.println("Superhero "+times+":"+superheroCaller.callSuperhero()
            );

            System.out.println();

        }

    }

}
//Display the superheroe names one by one
// with a loop by also showing the number of
// appearance.
//Display the number of superheroes by using
// the list’s size.

