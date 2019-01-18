package week9ex5;

public class Film {
    private String title;
    private Double score;
    private Integer voteCount;
    private Integer runTime;
    private Long budget;
    private Long revenue;

    public Film(String title, Double score, Integer voteCount, Integer runTime, Long budget, Long revenue) {
        this.title = title;
        this.score = score;
        this.voteCount = voteCount;
        this.runTime = runTime;
        this.budget = budget;
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public Long getBudget() {
        return budget;
    }

    public Long getRevenue() {
        return revenue;
    }
}

//Create the Film class that has a title,
// a score,
// a vote count,
// a runtime,
// a budget and
// a revenue.
