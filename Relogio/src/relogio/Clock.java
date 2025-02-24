package relogio;
public sealed abstract class Clock permits USClock, BRLClock {
    
    protected int hour;

    protected int minute;

    protected int second;

    public int getHours() {
        return hour;
    }

    public void setHour(int hour){
        if (hour >= 24){
            this.hour = 24;
            return;
        }
        this.hour = hour;
    }


    public int getMinutes() {
        return minute;
    }

    public void setMinutes( int minute){

        if (minute >= 60){
            this.minute = 60;
            return;
        }
        this.minute = minute;
    }

    public int getSeconds() {
        return second;
    }

    public void setSeconds( int second){
        if (second >= 60){
            this.second = 60;
            return;
        }
        this.second = second;
    }

    private String format(int value){
        return value<9 ? "0" + value : String.valueOf(value);
    }

    public String getTime(){
        return format(hour)+":"+format(minute)+":"+format(second);
    }

    abstract Clock convert(Clock clock);

    
}
