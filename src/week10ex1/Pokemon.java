package week10ex1;

public class Pokemon {
    private Integer number;
    private String name;
    private String firstType;
    private String secondType;
    private Integer total;
    private Integer hP;
    private Integer attack;
    private Integer defense;
    private Integer speedOfAttack;
    private Integer speedOfDefense;
    private Integer speed;
    private Integer generation;
    private Boolean isLegendary;

    public Pokemon(Integer number, String name, String firstType, String secondType, Integer total, Integer hP, Integer attack, Integer defense,
                   Integer speedOfAttack, Integer speedOfDefense, Integer speed, Integer generation, Boolean isLegendary) {
        this.number = number;
        this.name = name;
        this.firstType = firstType;
        this.secondType = secondType;
        this.total = total;
        this.hP = hP;
        this.attack = attack;
        this.defense = defense;
        this.speedOfAttack = speedOfAttack;
        this.speedOfDefense = speedOfDefense;
        this.speed = speed;
        this.generation = generation;
        this.isLegendary = isLegendary;
    }

    @Override
    public String toString() {
        return name ;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getFirstType() {
        return firstType;
    }

    public String getSecondType() {
        return secondType;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer gethP() {
        return hP;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getSpeedOfAttack() {
        return speedOfAttack;
    }

    public Integer getSpeedOfDefense() {
        return speedOfDefense;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getGeneration() {
        return generation;
    }

    public Boolean getLegendary() {
        return isLegendary;
    }


}
