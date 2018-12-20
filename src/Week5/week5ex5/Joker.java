package week5ex5;

import week5ex4.Superhero;

public class Joker implements Villain{

    public Integer lives = 10;

    @Override
    public void weaken(String name) {
        System.out.println("Damn you,"+ name +"!" +"You managed to weaken me!");
        lives--;
        if (lives==0)
            System.out.println("You all defeated me! But I will be back!");


    }
}
//it has the lives attribute that starts with the value ten.
// In its weaken method, display the message
// “Damn you, <Superhero’s name>! You managed to weaken me!”
// and subtract one from his lives counter.
// If his lives reaches zero, he displays the message
// “You all defeated me! But I will be back!”.
