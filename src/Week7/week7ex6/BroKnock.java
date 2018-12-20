package week7ex6;

public class BroKnock implements Handshake{
    @Override
    public String getName() {
        return "BroKnock";
    }
    @Override
    public Integer number(Integer digit) {
        return 6;
    }

    @Override
    public Boolean isHandshake(Integer digit) {
        if (!digit.equals(6)) {
            return false;
        }
        return true;
    }
}

