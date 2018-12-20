package week6ex2;

public abstract class IceCream {
    private String flavor;
    private String topping;

    public String getFlavor() {
        return flavor;
    }

    public String getTopping() {
        return topping;
    }

    public IceCream(String flavor, String topping) {
        this.flavor = flavor;
        this.topping = topping;
    }
    //It has the abstract method eat that returns a String.
    // The method cannot have any implementation because the way we eat it will depend
    // on the specific classes that extend from it.
    public abstract String eat();
}
