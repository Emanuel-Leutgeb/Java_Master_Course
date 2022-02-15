package Games.Premierleague;

import Scanning.Scanning;

import java.util.ArrayList;
import java.util.Random;

public class Controller {
    private ArrayList<Game> games;
    private ArrayList<Team> teams;

    public Controller(ArrayList<Game> games, ArrayList<Team> teams) {
        this.games = games;
        this.teams = teams;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }


    public void evaluateGames() {
        for (Game game : games) {
            if (game.getHomeGoals() > game.getGuestGoals()) {
                game.getHomeTeam().incrementWon();
                game.getGuestTeam().incrementLose();
            } else if (game.getHomeGoals() == game.getGuestGoals()) {
                game.getHomeTeam().incrementDraw();
                game.getGuestTeam().incrementDraw();
            } else {
                game.getHomeTeam().incrementLose();
                game.getGuestTeam().incrementWon();
            }
        }
    }

    //Print Team Statistic
    public void printTeamStatistic() {
        for (Team team : teams) {
            System.out.println(team.toString());
        }
    }

    //Calculate Points
    public void calculatePoints() {
        for (Team team : teams) {
            team.setPoints(team.getWon() * 3 + team.getDraw());
        }
    }

    //Play Game against Computer
    public void playGame() {
        Random rnd = new Random();

        System.out.println("Hello and welcome to Premier League!");
        for (int i = 0; i < teams.size(); i++) {
            System.out.print(i + 1 + " ");
            System.out.println(teams.get(i).getName());
        }

        System.out.printf("Choose a number between 1 - %d. \n", teams.size());
        int userTeam;
        while (true) {
            userTeam = Scanning.scan.nextInt() - 1;
            if (userTeam < 0 || userTeam > teams.size()) {
                System.out.printf("Please enter a correct team-number 1 - %d.", teams.size());
            } else {
                break;
            }
        }

        System.out.println("How many goal's did you made? 0 - 5 goals");
        int userGoal;
        while (true) {
            userGoal = Scanning.scan.nextInt();
            if (userGoal < 0 || userGoal > 5) {
                System.out.println("Please enter a correct number 0 - 5 goals.");
            } else {
                break;
            }
        }

        int computerTeam;
        while (true) {
            computerTeam = rnd.nextInt(teams.size());
            if (userTeam == computerTeam) {
            } else {
                break;
            }
        }

        int computerGoal = rnd.nextInt(5);

        System.out.println(teams.get(userTeam).getName() + " vs. " + teams.get(computerTeam).getName());

        if (userGoal > computerGoal) {
            System.out.printf("You won! %s %d - %s %d", teams.get(userTeam).getName(), userGoal, teams.get(computerTeam).getName(), computerGoal);
            teams.get(userTeam).incrementWon();
            teams.get(computerTeam).incrementLose();
        } else if (userGoal == computerGoal) {
            System.out.printf("Draw! %s %d - %s %d", teams.get(userTeam).getName(), userGoal, teams.get(computerTeam).getName(), computerGoal);
            teams.get(userTeam).incrementDraw();
            teams.get(computerTeam).incrementDraw();
        } else {
            System.out.printf("You lose! %s %d - %s %d", teams.get(userTeam).getName(), userGoal, teams.get(computerTeam).getName(), computerGoal);
            teams.get(userTeam).incrementLose();
            teams.get(computerTeam).incrementWon();
        }
        calculatePoints();
    }
}