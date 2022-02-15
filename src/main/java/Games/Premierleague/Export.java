package Games.Premierleague;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Export {
    public static void exportCSV(ArrayList<Team> teams, String filename) throws IOException {

        BufferedWriter writer = new BufferedWriter(
                new FileWriter(filename + ".csv")
        );

        for (int i = 0; i < teams.size(); i++) {
            writer.write(teams.get(i).toCSVLine());
            writer.newLine();
        }

        writer.close();
    }
}