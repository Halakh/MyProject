package week6ex1;

public class HotAirBalloonApplication {
    public static void main(String[] args) {
        //Create a SmallHotAirBalloon, name it smallBalloon and use its liftUp and land methods.
        // Notice that the class had no code, but it’s using the code from its parent class HotAirBalloon.
        SmallHotAirBalloon smallHotAirBalloon = new SmallHotAirBalloon();
        System.out.println("smallBalloon --");
        smallHotAirBalloon.liftUp();
        smallHotAirBalloon.land();

        BigHotAirBalloon bigHotAirBalloon = new BigHotAirBalloon();
        System.out.println("bigBalloon --");
        bigHotAirBalloon.liftUp();
        bigHotAirBalloon.land();


        //In a new line, assign the variables smallBalloon and bigBalloon to HotAirBalloon
        // variables called small and big respectively. Just use the = symbol.
        HotAirBalloon small= new SmallHotAirBalloon();
        HotAirBalloon big= new BigHotAirBalloon();
        System.out.println("small--");
        small.liftUp();
        small.land();

        System.out.println("big--");
        big.liftUp();
        big.land();



    }

}

//Use both methods from both small and big variables.
// Notice that now we are using them as HotAirBalloons,
// exactly the same as if it were an interface.
// The difference is that the liftUp and land methods are implemented
// in the abstract and the code is shared among the different classes that extend from it.