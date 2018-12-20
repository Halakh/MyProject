package week1;

import java.util.Scanner;

public class exercise16 {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scan1 = new Scanner(System.in);
        String name = scan1.nextLine();

        System.out.println("What is your order number?");
        Scanner scan2 = new Scanner(System.in);
        Integer num = scan2.nextInt();

        Integer result = num % 3;
        Integer price = result * 4;

        System.out.println("Here you are," + name + ". It’s" + price + " Euro.");


    }

}



