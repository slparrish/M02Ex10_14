// Scott Parrish
// Ex 10.14
// 11/06/2025
// MyDate.java Class to work with dates.
public class MyDate {
    private int year = 1970;
    private int month = 0;      // 12 months 0-11 with 0 representing January
    private int day = 1;

    public MyDate() {
    }

    public MyDate(long epoch) {

    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public static long getCurrentEpoch() {
        long result = System.currentTimeMillis() / 1000;
        return result;
    }

    @Override
    public String toString() {
        return "Year: " + getYear() + " Month: " + getMonth() + " Day: " + getDay();
    }
}
