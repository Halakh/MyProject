package week4Reflection;

import week4ex9.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RobodogApplication {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        readFile(fileReader);

    }
    public static void readFile(FileReader fileReader){
        List<String> newLines = new ArrayList<>();
        List<String> lines = fileReader.asLines("week4Reflection/robodog.txt");
        for (String line: lines){
            System.out.println(line);
            String[] split = line.split("");
            List<String> message =new ArrayList<>(Arrays.asList(split)) ;
            System.out.println(message);
            System.out.println(message);



            }


        }




        }



    //newLines = new ArrayList<>(Arrays.asList(line));
//            String symbol = "!";
//            for (line:newLines) {
//                newLines.remove(symbol);
//                System.out.println(line);
//
//            }