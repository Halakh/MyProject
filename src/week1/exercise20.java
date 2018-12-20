package week1;

import java.util.Scanner;

public class exercise20 {
    public static void main (String[] args){
        System.out.println("woof food do I get today?");
        Scanner scanner = new Scanner(System.in);
        Integer food = scanner.nextInt();
        Integer jumpTimes = 6* food;
        Integer barktimes = 1+food;
        System.out.println("(Jumps" + jumpTimes + "times and barks" + barktimes+"times)");
    }
}

