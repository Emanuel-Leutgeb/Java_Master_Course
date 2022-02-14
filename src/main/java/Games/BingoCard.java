package Games;

import java.util.Random;
import java.util.stream.IntStream;

//Bingo card generator
public class BingoCard {
    public static void bingoCard() {
        Random rnd = new Random();

        int[] B = new int[5];
        int[] I = new int[5];
        int[] N = new int[4];
        int[] G = new int[5];
        int[] O = new int[5];

        boolean numberExist;

        //B
        for (int i = 0; i < B.length; i++) {
            int rndNumber = rnd.nextInt(15) + 1; // From 1 to 15

            numberExist = IntStream.of(B).anyMatch(x -> x == rndNumber);
            if (!numberExist) {
                B[i] = rndNumber;
            } else {
                i--;
            }
        }
        //I
        for (int i = 0; i < I.length; i++) {
            int rndNumber = rnd.nextInt(15) + 16; //von 16 bis 30

            numberExist = IntStream.of(I).anyMatch(x -> x == rndNumber);
            if (!numberExist) {
                I[i] = rndNumber;
            } else {
                i--;
            }
        }
        //N
        for (int i = 0; i < N.length; i++) {
            int rndNumber = rnd.nextInt(15) + 31; //von 31 bis 45
            numberExist = IntStream.of(N).anyMatch(x -> x == rndNumber);
            if (!numberExist) {
                N[i] = rndNumber;
            } else {
                i--;
            }

        }
        //G
        for (int i = 0; i < G.length; i++) {
            int rndNumber = rnd.nextInt(15) + 46; //von 46 bis 60

            numberExist = IntStream.of(G).anyMatch(x -> x == rndNumber);
            if (!numberExist) {
                G[i] = rndNumber;
            } else {
                i--;
            }
        }
        //O
        for (int i = 0; i < O.length; i++) {
            int rndNumber = rnd.nextInt(15) + 61; //von 61 bis 75

            numberExist = IntStream.of(O).anyMatch(x -> x == rndNumber);
            //IntStream.of(B).forEach(element -> System.out.println(element));
            if (!numberExist) {
                O[i] = rndNumber;
            } else {
                i--;
            }
        }

        //Print to Console
        int freeSpace;
        System.out.println("B\t|\tI\t|\tN\t|\tG\t|\tO\t|\n");

        for (int i = 0; i < 5; i++) {
            System.out.print(B[i]);
            System.out.print("\t|\t");
            System.out.print(I[i]);
            System.out.print("\t|\t");
            if (i == 2) {
                System.out.print(" ");
            } else {
                if (i > 2) {
                    freeSpace = i - 1;
                    System.out.print(N[freeSpace]);
                } else {
                    System.out.print(N[i]);
                }
            }
            System.out.print("\t|\t");
            System.out.print(G[i]);
            System.out.print("\t|\t");
            System.out.print(O[i]);
            System.out.print("\t|\n");
        }
    }

    public static void bingoCard2() {
        Random rnd = new Random();
        int[][] bingo = new int[5][5];
        boolean numberExist;
        int randomSelector = 1;

        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                int rndNumber = rnd.nextInt(15) + randomSelector; //always in increments of 15

                numberExist = IntStream.of(bingo[i]).anyMatch(x -> x == rndNumber);
                if (!numberExist) {
                    bingo[i][j] = rndNumber;
                } else {
                    j--;
                }
            }
            randomSelector += 15;
        }

        int freeSpace;
        for (int i = 0; i < bingo.length; i++) {
            if (i == 0) {
                System.out.println("B\t|\tI\t|\tN\t|\tG\t|\tO\t|\n");
            }
            for (int j = 0; j < bingo[i].length; j++) {
                if (i == 2 && j == 2) {
                    System.out.print(" " + "\t|\t");
                } else {
                    System.out.print(bingo[j][i] + "\t|\t");
                }
            }
            System.out.println();
        }
    }
}
