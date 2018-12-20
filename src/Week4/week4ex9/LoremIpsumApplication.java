package week4ex9;

import java.util.List;

public class LoremIpsumApplication {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        readFile(fileReader);

    }
    public static void readFile(FileReader fileReader){
        System.out.println("---Document---");
        List<String> lines = fileReader.asLines("week4ex9/lorem-ipsum");
        for (String line: lines){
            System.out.println(line);

        }
    }


}
