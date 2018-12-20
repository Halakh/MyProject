package week5ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WardrobeBuilder {
    public Wardrobe build(){
        Wardrobe wardrobe = new Wardrobe();
        List<Step> steps = getSteps();
        for (Step step : steps) {
            step.perform(wardrobe);
        }
        return wardrobe;
    }

    private List<Step> getSteps() {
        //we create objects from classes
        return Arrays.asList(new AddBottom(),new AddSide(),
                new AddSide(),new AddBack(),new AddTop(),
                new AddShelf(),new AddShelf(),new AddShelf(),
                new AddShelf(),new AddShelf(),new AddShelf(),
                new AddShelf(),new AddShelf(), new AddDoor(),
                new AddDoor());
    }


}

//Create the WardrobeBuilder class that has a list of
// all the Steps it has to follow to build a wardrobe.
// It has the build method.
// It creates an empty Wardrobe and applies
// all the steps one by one to it until
// it’s finished and then it returns it.
// A Wardrobe needs the following to be
// completed: one bottom, two sides, one back,
// one top, eight shelves and two doors.
