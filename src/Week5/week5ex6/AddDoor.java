package week5ex6;

public class AddDoor implements Step{
    @Override
    public void perform(Furniture furniture) {
        furniture.add("door");
    }
}
//