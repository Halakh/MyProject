package week4exercise5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AdvancedBackpackApplication {
    public static void main(String[] args) {
        Set<Item> backpack = new HashSet<>();
        System.out.println(backpack);
        Item toothpaste = new Item("toothpaste");
        Item towel = new Item("towel");
        Item underwear = new Item("underwear");
        backpack.add(toothpaste);
        backpack.add(towel);
        backpack.add(underwear);
        System.out.println(backpack);

        Item top = new Item("underwear");
        if (backpack.contains(top)){
            System.out.println("The backpack contains underwear");
        }

        backpack.remove(top);
        if (!backpack.contains(top)){
            System.out.println("The backpack no longer contains underwear");
        }
        backpack.add(toothpaste);
        backpack.add(toothpaste);
        System.out.println("Backpack: "+ backpack);

        System.out.println("Backpack: "+ backpack.size());





    }
}
