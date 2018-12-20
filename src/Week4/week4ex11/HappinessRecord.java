package week4ex11;
import java.util.Objects;
public class HappinessRecord {
    private String country;
    private Integer rank;
    private Double score;
    public HappinessRecord(String country, Integer rank, Double score) {
        this.country = country;
        this.rank = rank;
        this.score = score;
    }
    @Override
    public String toString() {
        return "country"+country + "rank" +rank + "score: "+score;
    }
    public String getCountry() {
        return country;
    }

    public Integer getRank() {
        return rank;
    }

    public Double getScore() {
        return score;
    }
}
