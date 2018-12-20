package reflectionweek6;
public class Automatic extends Car {

    public Automatic(String brand) {
        super(brand);
    }

    @Override
    protected String getType() {
        return "Automatic";
    }


}

