package com.aquam.unit_4;

public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59)   // (minutes < 0 || !(seconds >=0 && seconds <= 59))
            return INVALID_VALUE_MESSAGE;


        long hours = minutes / 60;
        minutes = minutes % 60;

        String hourString = hours + "h ";
        if (hours < 10)
            hourString = "0" + hourString;
        String minuteString = minutes + "m ";
        if (minutes < 10)
            minuteString = "0" + minuteString;
        String secondString = seconds + "s ";
        if (seconds < 10)
            secondString = "0" + secondString;

        return hourString + minuteString + secondString;
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0)   // (minutes < 0 || !(seconds >=0 && seconds <= 59))
            return INVALID_VALUE_MESSAGE;

        long minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);
    }
}
