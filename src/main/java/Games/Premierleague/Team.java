package Games.Premierleague;

public class Team {

    private String name;
    private int won;
    private int draw;
    private int lose;
    private int points;
    private final String CSV_SEPERATOR = ",";

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return name +
                ", Won = " + won +
                ", Draw = " + draw +
                ", Lose = " + lose;
    }

    public void incrementWon() {
        won++;
    }

    public void incrementDraw() {
        draw++;
    }

    public void incrementLose() {
        lose++;
    }

    public String toCSVLine() {
        return getName() + CSV_SEPERATOR +
                getWon() + CSV_SEPERATOR +
                getDraw() + CSV_SEPERATOR +
                getLose() + CSV_SEPERATOR +
                getPoints();
    }
}