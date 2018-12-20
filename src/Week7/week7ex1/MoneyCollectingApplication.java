package week7ex1;

import java.util.List;

public class MoneyCollectingApplication {
    public static void main(String[] args) {
        MoneyCollector collector = new MoneyCollector();
        MoneyCalculator calculator = new MoneyCalculator();
        List<Integer> payments = collector.getFriendsPayments();
        Integer total = calculator.accumulate(payments);
        System.out.println("The list of money my friends paid is " + payments);
        System.out.println("the total is " + total);
    }
}
