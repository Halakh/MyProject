package reflectionweek6;
public class Manual extends Car {

    public Manual(String brand) {
        super(brand);
    }

    @Override
    protected String getType() {
        return "Manual";
    }

}


