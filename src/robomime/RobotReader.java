package robomime;

import Week4.week4ex9.FileReader;


import java.util.List;
import java.util.stream.Collectors;


public class RobotReader {
    private FileReader reader=new FileReader();
    public List<String> getCommands(){
       return reader.asStream("robomime/robomime.txt")
               .collect(Collectors.toList());

    }

}
