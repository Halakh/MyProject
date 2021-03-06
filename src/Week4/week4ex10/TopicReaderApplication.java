package Week4.week4ex10;

import week4ex7.Topic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TopicReaderApplication {
    public static void main(String[] args) {
        TopicReader topicReader = new TopicReader();
        List<Topic>topicList= topicReader.getTopics("week4ex10/topics");
        for (Topic topic : topicList) {
            System.out.println("Topic list: " + topic);
        }
        // to change a list to a set, just create a new set and include
        //the original list in the arguments

        Set<Topic>topicSet = new HashSet<>(topicList);

        for (Topic topic : topicSet) {
            System.out.println("Topic set: " + topic);


        }







    }
}
//n the TopicReaderApplication class main method,
// create a TopicReader, use the getTopics method
// and place them inside a list. Display the list of topics.
// Create a set of Topic, add the elements of the previous
// list and display it to notice that there happens to be
// duplicates. To ensure uniqueness you have to create the
// equals method in the Topic class. Do this and run the
// program again
// to make sure the set does not display any duplicates.
