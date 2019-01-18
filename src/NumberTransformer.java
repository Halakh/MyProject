import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberTransformer {
    public List<Integer>transfor(List<Integer>numbers,Function<Integer,Integer>condition){
        List<Integer>result=new ArrayList<>();
        for (Integer number : numbers) {
            Integer transformed = condition.apply(number);
            result.add(transformed);

        }
        return result;

    }
}
