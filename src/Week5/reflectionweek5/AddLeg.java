package reflectionweek5;

import week5ex6.Furniture;
import week5ex6.Step;

public class AddLeg implements Step {


    @Override
    public void perform(Furniture furniture) {
        furniture.add("leg");
    }

}
