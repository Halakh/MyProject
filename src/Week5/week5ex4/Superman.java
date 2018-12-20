package week5ex4;

import week5ex5.Villain;

public class Superman implements Superhero  {
    @Override
    public void fight(Villain villain) {
        villain.weaken(getName());

    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public String getName() {
        return "Superman";
    }
}
