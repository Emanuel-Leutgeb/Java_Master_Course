public class AssignmentAndLogicalOperator {

    //Characteristics of a number
    public static void CharacteristicsOfANumber() {
        int luckyNumber = 70;
        System.out.printf("My lucky number is %d \n", luckyNumber);

        System.out.println("Please enter a integer number.");
        int userNumber = Scanning.scan.nextInt();

        if (userNumber == luckyNumber) {
            System.out.printf("Your number %d is my lucky number \n", userNumber);
        }

        if (userNumber % 10 == 0) {
            System.out.printf("Your number %d is a round number \n", userNumber);
        }

        if (userNumber % 2 == 0) {
            System.out.printf("Your number %d is a even number \n", userNumber);
        }

        int length = String.valueOf(userNumber).length();
        if (length == 2) {
            System.out.printf("Your number %d has two digits \n", userNumber);
        }
    }

    //free time or work time?
    public static void freeTimeOrWorkTime() {
        System.out.println("Look if you are in working time or not.");

        System.out.println("Please enter a whole hour number.");
        int userTime = Scanning.scan.nextInt();

        if (userTime < 0 || userTime > 24) {
            System.out.println("No correct input!");
        } else if (userTime >= 12 & userTime <= 13) {
            System.out.println("It's lunch time");
        } else if (userTime >= 8 & userTime <= 16) {
            System.out.println("It's working time");
        } else {
            System.out.println("It's free time");
        }

    }

    //Translating grades
    public static void translatingGrades() {
        System.out.println("Please enter your grade.");
        int userGrade = Scanning.scan.nextInt();

        if (userGrade == 1) {
            System.out.println("Very good");
        } else if (userGrade == 2) {
            System.out.println("Good");
        } else if (userGrade == 3) {
            System.out.println("Satisfactory");
        } else if (userGrade == 4) {
            System.out.println("Sufficient");
        } else if (userGrade == 5) {
            System.out.println("Not Sufficient");
        } else {
            System.out.println("No correct input!");
        }
    }
}
