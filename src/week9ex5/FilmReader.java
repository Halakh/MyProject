package week9ex5;

import Week4.week4ex9.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilmReader {
    public List<Film> getFilms(){
        return new FileReader().asStream("week9ex5/films.csv")
                .skip(1)
                .map(e-> Arrays.asList(e.split(";")))
                .map(e->new Film(e.get(8),Double.valueOf(e.get(9)),Integer.valueOf(e.get(10)),
                        Integer.valueOf(e.get(6)),Long.valueOf(e.get(0)),Long.valueOf(e.get(5))))
                .collect(Collectors.toList());

    }
}

//Create the FilmReader class. It has the method getFilms that returns a list with all the films in films.csv.
//8910605