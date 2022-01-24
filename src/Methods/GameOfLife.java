package Methods;

import Scanning.Scanning;
import java.util.Random;

//Game of Life
public class GameOfLife {
    public static void gameOfLife() throws InterruptedException {
        System.out.println("Welcome to Game of Life");
        boolean[][] playground = playgroundSetup(); // true = Life & false = Dead

        int i = 0;
        while (i < 50) {

            printPlayground(playground);
            checkLife(playground);
            Thread.sleep(1000);
            i++;
        }
    }

    private static boolean[][] playgroundSetup() {
        System.out.println("How big should be your Playground");
        int playgroundSize = Scanning.scan.nextInt();

        boolean[][] playground = new boolean[playgroundSize + 2][playgroundSize + 2];
        Random rnd = new Random();
        for (int i = 0; i < playground.length; i++) {
            for (int j = 0; j < playground.length; j++) {
                playground[i][j] = rnd.nextInt(10) < 1;
            }
        }
        return playground;
    }

    private static void printPlayground(boolean[][] playground) {
        for (int i = 0; i < playground.length; i++) {
            for (int j = 0; j < playground.length; j++) {
                if (i == 0 || j == 0 || i == playground.length - 1 || j == playground.length - 1) {
                    System.out.print("#" + "\t");
                    playground[i][j] = false;
                } else if (playground[i][j]) {
                    System.out.print("O" + "\t");
                } else {
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }

    private static void checkLife(boolean[][] playground) {
        for (int i = 0; i < playground.length; i++) {
            for (int j = 0; j < playground[i].length; j++) {

                if (i == 0 || i == playground.length - 1) {
                    break;
                }
                if (j == 0 || j == playground.length - 1) {
                    continue;
                }
                int cells = 0;

                cells += playground[i - 1][j - 1] ? 1 : 0;
                cells += playground[i - 1][j] ? 1 : 0;
                cells += playground[i - 1][j + 1] ? 1 : 0;
                cells += playground[i][j - 1] ? 1 : 0;
                cells += playground[i][j + 1] ? 1 : 0;
                cells += playground[i + 1][j - 1] ? 1 : 0;
                cells += playground[i + 1][j] ? 1 : 0;
                cells += playground[i + 1][j + 1] ? 1 : 0;

                playground[i][j] = (playground[i][j] && (cells == 2 || cells == 3)) || ((!playground[i][j]) && cells == 3);
            }
        }
    }
}
