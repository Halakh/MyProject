package week6ex3;

public class Coffee {
    private String madeBy;
    private Integer brewedTime;

    public Coffee(String madeBy, Integer brewedTime) {
        this.madeBy = madeBy;
        this.brewedTime = brewedTime;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public Integer getBrewedTime() {
        return brewedTime;
    }
}
//t has the madeBy String attribute and the brewedTime Integer attribute. They are provided via constructor.
// It has the getMadeBy and getBrewedTime methods.


//https://github.com/Halakh/MyProjects.git