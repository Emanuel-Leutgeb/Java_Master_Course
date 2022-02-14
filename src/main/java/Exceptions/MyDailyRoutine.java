package Exceptions;

public class MyDailyRoutine {
    public static void whatTimeIsIt(int hour, int minute) throws TimeStampExceptions {
        if (hour == 0 && minute == 0) {
            throw new TimeStampExceptions("Sleeping");
        } else if (hour == 5 && minute == 30) {
            throw new TimeStampExceptions(hour, minute, "Wake up");
        } else if (hour == 5 && minute == 50) {
            throw new TimeStampExceptions(hour, minute, "Morning routine");
        } else if (hour == 6 && minute == 20) {
            throw new TimeStampExceptions(hour, minute, "Drive to train-station");
        } else if (hour == 8 && minute == 0) {
            throw new TimeStampExceptions(hour, minute, "Start working in Coders.bay");
        } else if (hour == 9 && minute == 0) {
            throw new TimeStampExceptions(hour, minute, "Get some coffee and breakfast");
        } else if (hour == 10 && minute == 30) {
            throw new TimeStampExceptions(hour, minute, "Go out and get some fresh air");
        } else if (hour == 12 && minute == 0) {
            throw new TimeStampExceptions(hour, minute, "Lunch time");
        } else if (hour == 12 && minute == 30) {
            throw new TimeStampExceptions(hour, minute, "Back to work");
        } else if (hour == 14 && minute == 0) {
            throw new TimeStampExceptions(hour, minute, "Go out and get some fresh air");
        } else if (hour == 15 && minute == 30) {
            throw new TimeStampExceptions(hour, minute, "Go back to the bus-station");
        } else if (hour == 17 && minute == 0) {
            throw new TimeStampExceptions(hour, minute, "Drive home from train-station");
        } else if (hour == 17 && minute == 30) {
            throw new TimeStampExceptions(hour, minute, "Chill out");
        } else if (hour == 18 && minute == 30) {
            throw new TimeStampExceptions(hour, minute, "Make some dinner");
        } else if (hour == 20 && minute == 0) {
            throw new TimeStampExceptions(hour, minute, "Time for family");
        } else if (hour == 22 && minute == 0) {
            throw new TimeStampExceptions(hour, minute, "Go to bed");
        } else if (hour == 23 && minute == 59) {
            throw new TimeStampExceptions("Sleeping");
        }
    }
}
