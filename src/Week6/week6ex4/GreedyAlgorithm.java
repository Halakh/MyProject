package week6ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreedyAlgorithm {
    private List<Money> moneyList = Arrays.asList(new Cent50(50),new Cent20(20),
            new Cent10(10), new Cent5(5), new Cent2(2),new Cent1(1));

    //after calculating the change we will give this amount of money to the customer
    private List<Money> changeCoins = new ArrayList<>();

    //this is the method i will use to calculate
    public List<Money> change(Integer change) {
        if (change==0){
            return new ArrayList<>();
        }

        for (Money money : moneyList) {
            Integer times = 0;
            //if the coins i have as a waiter is less than or equalls to change
            if(money.isApplicable(change)){
                //how many times do i use/add the same coin to the list
                times = change/money.getAmount();
            }
            //we add to the list the coins we want multiplied by the times we found out
            addToList(changeCoins, money, times);
            change=change-times*money.getAmount();
        }
        return changeCoins;

    }

    private void addToList(List<Money> changeCoins, Money money, Integer times) {
        for (int time = 0; time < times; time++) {
            changeCoins.add(money);
        }
    }

}