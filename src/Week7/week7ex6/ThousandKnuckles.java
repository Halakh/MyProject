package week7ex6;

public class ThousandKnuckles  implements Handshake{
    @Override
    public String getName() {
        return "ThousandKnuckles";
    }

    @Override
    public Integer number(Integer digit) {
        return 9;
    }
    @Override
    public Boolean isHandshake(Integer digit) {
        if (!digit.equals(9)) {
            return false;
        }
        return true;
    }
}


