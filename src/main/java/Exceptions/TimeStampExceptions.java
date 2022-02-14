package Exceptions;

public class TimeStampExceptions extends Exception {

    public TimeStampExceptions(String message) {
        super(message);
    }

    public TimeStampExceptions(int hour, int minute, String message) {
        super(hour + ":" + minute + " - " + message);
    }
}
