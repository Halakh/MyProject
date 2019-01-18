package week8ex4;

import java.util.function.Function;

public class PowerLevelScouter {
    public Integer getAscciValue(String name, Function<String, Integer> condition) {
        Integer result = 0;
        String[] split = name.split("");
        for (String letter : split) {
            result += condition.apply(letter);

        }
        return result;
    }

    public Integer scout(String name) {
        return getAscciValue(name, n -> (int) n.charAt(0));
    }

    public Integer scoutEnhanced(String name) {
        return getAscciValue(name.toLowerCase(), n -> (int) n.charAt(0));
    }

}
