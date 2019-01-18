package week9ex5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilmSummarizerTest {
    FilmReader reader = new FilmReader();
    List<Film> films= reader.getFilms();
    FilmSummarizer summarizer = new FilmSummarizer();


    @Test
    void highestRating() {


    }

    @Test
    void getThreeLongestHighestRating() {
    }

    @Test
    void getFourMostExpensive() {
    }

    @Test
    void getFourMostExpensiveShorterthan90() {
    }

    @Test
    void getMostRatedWithCertainBudget() {
    }
}