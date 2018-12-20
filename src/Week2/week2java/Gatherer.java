package week2java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gatherer {

    public List<Hiker> signUp(){
        List<Hiker> hikers = new ArrayList();

        System.out.println("what is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while (!name.isEmpty()) {
            Hiker hiker = new Hiker(name);
            hikers.add (hiker);
            System.out.println("what is your name?");
            name  = scanner.nextLine();



        }
        return hikers;

    }
}
