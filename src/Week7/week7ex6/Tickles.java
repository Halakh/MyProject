package week7ex6;

public class Tickles implements Handshake{
    @Override
    public String getName() {
        return "Tickles";
    }

    @Override
    public Integer number(Integer digit) {
        return 5;
    }

    @Override
    public Boolean isHandshake(Integer digit) {
        if (!digit.equals(5)) {
            return false;
        }
        return true;
    }
}
