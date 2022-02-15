package Games.Premierleague;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Import {
    public static Controller importCSV() throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader("premierLeague.csv")
        );
        String currentLine = reader.readLine();

        ArrayList<Team> teams = new ArrayList<Team>();
        ArrayList<Game> games = new ArrayList<Game>();
        HashSet<String> teamNames = new HashSet<String>();

        while (currentLine != null) {
            String[] line = currentLine.split(";");

            //Home Team
            if (!teamNames.contains(line[1])) {
                teams.add(new Team(line[1]));
                teamNames.add(line[1]);
            }

            //Guest Team
            if (!teamNames.contains(line[2])) {
                teams.add(new Team(line[2]));
                teamNames.add(line[2]);
            }

            Team homeTeam = null;
            Team guestTeam = null;
            for (Team team : teams) {
                if (Objects.equals(team.getName(), line[1])) {
                    homeTeam = team;
                }
                if (Objects.equals(team.getName(), line[2])) {
                    guestTeam = team;
                }
            }

            //
            games.add(new Game(Integer.parseInt(line[0]), homeTeam, guestTeam, Integer.parseInt(line[3]), Integer.parseInt(line[4])));

            //Next Line
            currentLine = reader.readLine();
        }
        reader.close();

        return new Controller(games, teams);
    }
}