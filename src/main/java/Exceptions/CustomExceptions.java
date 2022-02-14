package Exceptions;

public class CustomExceptions {
    public static void myBasicDay() {
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                try {
                    MyDailyRoutine.whatTimeIsIt(hour, minute);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
