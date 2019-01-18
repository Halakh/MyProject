package week9ex5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummarizer {
    private FilmReader reader = new FilmReader();


    public List<Film> highestRating() {
        return reader.getFilms().stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());

    }

    public List<Film> getThreeLongestHighestRating() {
        return reader.getFilms().stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .filter(f -> f.getRunTime() > 180)
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Film> getFourMostExpensive() {
        return reader.getFilms().stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());

    }

    public List<Film> getFourMostExpensiveShorterthan90() {
        return reader.getFilms().stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .filter(f -> f.getRunTime() < 90)
                .limit(4)
                .collect(Collectors.toList());

    }

    public List<Film> getMostRatedWithCertainBudget() {
        return reader.getFilms().stream()
                .filter(f -> f.getScore() > 7.0)
                .filter(f -> f.getBudget() >= 50000 && f.getBudget() <= 500000)
                .sorted(Comparator.comparing(Film::getBudget))
                .limit(4)
                .collect(Collectors.toList());
    }
}





