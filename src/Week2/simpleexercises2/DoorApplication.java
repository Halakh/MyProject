package simpleexercises2;

public class DoorApplication {
    public static void main(String [] args) {
        Integer doorNumber = 2;
        Door door = new Door(doorNumber);
        Key key = new Key();
        key.open(door);


    }
}
