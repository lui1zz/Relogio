package relogio;
public class Main {
    public static void main(String[] args) throws Exception {
    Clock brlclock = new BRLClock();
    brlclock.setSeconds(0);
    brlclock.setMinutes(0);
    brlclock.setHour(15);


    System.out.println(brlclock.getTime());

    System.out.println(new USClock().convert(brlclock).getTime());
    }
}
