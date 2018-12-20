package week4exercise3;

import java.util.HashMap;
import java.util.Map;

public class BasicIndexApplication {
    public static void main(String[] args) {
        //Create an empty index map connecting Integers for the
        // page numbers and Strings for the book topics and display it.
        Map<Integer,String> indexMap = new HashMap<>();

        //Create three Integers that represent three different page numbers.
        //Create three Strings that represent three different book topics.
        //Put them into the index map from biggest to smallest page number
        // and display it to notice that the entries are automatically arranged.
        indexMap.put(3,"ecologic economy");
        indexMap.put(2,"possessive things");
        indexMap.put(1,"connecting");
        System.out.println("The index is"+ indexMap);

        //Display the map keys.
        System.out.println("The index keys:" + indexMap.keySet());

        //Display the map values.
        System.out.println("The index values are " + indexMap.values());

        //Create one String representing another book topic.
        //put this new topic into the same page number than an existing one and display the map to notice that the previous one is replaced.


        indexMap.put(1,"teaching methods");
        System.out.println(indexMap);

        //Ask if one of the keys is contained
        //in the map and display the answer.

        if (indexMap.containsKey(1)){
            System.out.println("The page number 1 exists as key");
        }
        System.out.println("The topic on page number 1 "+ indexMap.get(3)+ "is ecologic economy");
        System.out.println("The index size "+ indexMap.size());
    }
}