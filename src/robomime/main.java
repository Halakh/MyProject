package robomime;


import java.util.List;

public class main {
    public static void main(String[] args) {
        RoboStream roboStream=new RoboStream();
        List<String> strings = roboStream.cleanRubbish();
        System.out.println(strings);

    }
}
