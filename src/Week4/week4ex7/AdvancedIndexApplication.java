package week4ex7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvancedIndexApplication {
    public static void main(String[] args) {
        Map<Integer, List<Topic>> index = new HashMap<>();
        System.out.println(index);
        //Create two Integers that represent
        // two different page numbers.
        Integer pageNumber1 = new Integer(1);
        Integer pageNumber2 = new Integer(2);

        Topic topic1 = new Topic("connecting");
        Topic topic2 = new Topic("positive things");
        Topic topic3 = new Topic("ecologic economy");

        //Put the page numbers and topics1 and topics2
        // respectively into the index map .
        List<Topic>topics1 = new ArrayList<>();
        topics1.add(topic3);

        List<Topic>topics2 = new ArrayList<>();
        topics2.add(topic2);
        topics2.add(topic1);

        index.put(1,topics1);
        index.put(2,topics2);
        System.out.println("Index: "+ index);

        System.out.println("Index Key " + index.keySet());
        System.out.println("Index Key " + index.values());

        Topic topic4 = new Topic("sociology");

        //Get the topics1 from the map and call it stored.
        //we make a list called STORED=Map.get(topics1 key)

        List<Topic> stored = index.get(1);
        stored.add(topic4);

        //we have to print the whole map to be able to see a part of it
        System.out.println(index);

        if (index.containsKey(1)){
            System.out.println("The first key is included");
        }
        //Get the topics2 from the map and call it stored2 and display it.
        List<Topic>stored2 = index.get(2);
        System.out.println("Index :" + index);













    }
}
