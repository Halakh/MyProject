package reflectionweek5;

import week5ex6.*;

import java.util.Arrays;
import java.util.List;

public class TvTableBuilder {
        public TvTable build() {
            TvTable tvTable = new TvTable();
            List<Step> steps = getSteps();
            for (Step step : steps) {
                step.perform(tvTable);
            }
            return tvTable;
        }

        private List<Step> getSteps() {
            //we create objects from classes
            return Arrays.asList(new AddLeg(), new AddLeg(),
                    new AddLeg(), new AddLeg(), new AddTop(),
                    new AddShelf());
        }

    }

