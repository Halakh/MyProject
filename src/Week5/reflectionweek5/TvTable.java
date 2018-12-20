package reflectionweek5;

import week5ex6.Furniture;

import java.util.ArrayList;
import java.util.List;

public class TvTable implements Furniture {
        public List<String> parts = new ArrayList<>();
        public void add(String part){
            parts.add(part);
        }

        @Override
        public String toString() {
            return "TvTable{" +
                    "parts=" + parts +
                    '}';
        }
        public List<String> getParts(){
            return parts;
        }
    }


