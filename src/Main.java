// Scott Parrish
// Ex 10.14
// 11/06/2025
// Main.java Class to test and demonstrate the use of the MyDate class.
public class Main {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        System.out.println(myDate);
        long year = 1970 + (MyDate.getCurrentEpoch() / 31556926);
        System.out.println(MyDate.getCurrentEpoch());
        long month = (MyDate.getCurrentEpoch() % 31556926) / 2629743;
        long day = (MyDate.getCurrentEpoch() % 31556926) / 86400;
        System.out.println("Year: " + year + " Month: " + month + " Day: " + day);
    }
}