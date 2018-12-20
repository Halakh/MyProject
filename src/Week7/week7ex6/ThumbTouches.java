package week7ex6;

public class ThumbTouches implements Handshake{
    @Override
    public String getName() {
        return "ThumbTouches";
    }

    @Override
    public Integer number(Integer digit) {
        return 2;
    }

    @Override
    public Boolean isHandshake(Integer digit) {
        if (!digit.equals(2)) {
            return false;
        }
        return true;
    }
}
