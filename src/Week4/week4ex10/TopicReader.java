package week4ex10;

import week4ex7.Topic;
import week4ex9.FileReader;

import java.util.ArrayList;
import java.util.List;

//Reuse the FileReader class from exercise 9.
// Don’t copy it, just reuse it by importing it.
//Create the TopicReader class that has a FileReader as
// an attribute.
public class TopicReader {
    private FileReader fileReader = new FileReader();

    public List<Topic> getTopics(String filePath) {
        List<Topic> topics = new ArrayList<>();
        List<String> lines = fileReader.asLines("week4ex10/topics");
        for (String line : lines) {
            Topic topic = new Topic(line);
            topics.add(topic);


        }
        return topics;


    }

}


//Create the TopicReader class that has a FileReader as an
// attribute. It has the getTopics method that uses
// the File Reader to read the topics.txt file,
// transform every line into one Topic and returns
// the list of topics.
