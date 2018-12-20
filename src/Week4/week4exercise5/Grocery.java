package week4exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Grocery {
    public String name;


    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grocery grocery = (Grocery) o;
        return Objects.equals(name, grocery.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Grocery{" +
                "name='" + name + '\'' +
                '}';
    }

    public Grocery(String name) {
        this.name = name;
    }
}
