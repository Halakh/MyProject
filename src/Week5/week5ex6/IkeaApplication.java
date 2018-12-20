package week5ex6;

import reflectionweek5.TvTable;
import reflectionweek5.TvTableBuilder;

public class IkeaApplication {
    public static void main(String[] args) {
        WardrobeBuilder builder = new WardrobeBuilder();
        Wardrobe wardrobe = builder.build();
        System.out.println(wardrobe);
        TvTableBuilder builder1= new TvTableBuilder();
        TvTable tvTable = builder1.build();
        System.out.println(tvTable);




    }





}