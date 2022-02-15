package Games.Premierleague;

public class Game {
    private int round;
    private Team homeTeam;
    private Team guestTeam;
    private int homeGoals;
    private int guestGoals;

    public Game(int round, Team homeTeam, Team guestTeam, int homeGoals, int guestGoals) {
        this.round = round;
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
        this.homeGoals = homeGoals;
        this.guestGoals = guestGoals;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getGuestTeam() {
        return guestTeam;
    }

    public void setGuestTeam(Team guestTeam) {
        this.guestTeam = guestTeam;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getGuestGoals() {
        return guestGoals;
    }

    public void setGuestGoals(int guestGoals) {
        this.guestGoals = guestGoals;
    }

    @Override
    public String toString() {
        return "Round = " + round +
                ", " + homeTeam.getName() +
                ", " + guestTeam.getName() +
                ", Home Goals = " + homeGoals +
                ", Guest Goals = " + guestGoals;
    }
}
