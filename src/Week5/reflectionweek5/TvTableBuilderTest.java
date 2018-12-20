package reflectionweek5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TvTableBuilderTest {
    private TvTableBuilder builder= new TvTableBuilder();
    @Test
    void build() {
        String parts ="leg, leg, leg, leg, top, shelf";
        String[] split = parts.split(", ");
        List<String> steps = Arrays.asList(split);
        TvTable tvTable = builder.build();
        List<String> tvTableParts = tvTable.getParts();
        Assertions.assertEquals(steps,tvTableParts);

    }

}
