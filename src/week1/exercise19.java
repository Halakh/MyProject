package week1;

import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {
        System.out.println("welcome to our comic shop! how much is your comic?");
        Scanner scanner = new Scanner(System.in);
        Integer price = scanner.nextInt();
        System.out.println("how much are you going to pay?");
        Integer moneyPaid = scanner.nextInt();

        Integer change = moneyPaid-price;
        Double euro = Math.floor(change);
        Integer cent = (change*100)%100;

        System.out.println("Here you are,"+euro+"and"+cent+ "cents");







    }
}
