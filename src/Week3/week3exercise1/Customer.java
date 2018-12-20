package week3exercise1;

public class Customer {
    public String name;
    private String category;

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Customer(String name, String category) {
        this.name = name;
        this.category = category;
    }
}
