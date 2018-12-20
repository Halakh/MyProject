package week4exercise4;

import java.util.Optional;

public class BasicGiftApplication {
    public static void main(String[] args) {
        //Create an empty giftBox Optional of String and display it.

        Optional<String> giftbox = Optional.empty();
        System.out.println("Gift: "+ giftbox);

        //ssign an Optional of String to the
        // giftBox containing an actual present and display it.
        giftbox= Optional.of("Robocar");
        System.out.println("Gift: "+ giftbox);




        if(giftbox.isPresent()){
            System.out.println("There is a present in the giftbox");
        }
        //this is unique in optional because we dont provide position
        //for (get())
        System.out.println("The gift is " + giftbox.get());









    }







}
//Optional<ELEMENT-TYPE> optional = Optional.of(element);
//Optional<ELEMENT-TYPE> optional = Optional.empty();