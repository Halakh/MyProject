package week4ex8;

import java.util.Optional;

public class AdvancedGiftApplication {
    public static void main(String[] args) {
        Optional<Box> giftBox = Optional.empty();
        System.out.println(giftBox);
        Box box = new Box("Robotoy");
        giftBox = Optional.of(box);
        System.out.println(giftBox);

        if(giftBox.isPresent()){
            System.out.println("There is a present in the gift box");
        }
        System.out.println("The gift is a content = " + giftBox.get());

    }

}
