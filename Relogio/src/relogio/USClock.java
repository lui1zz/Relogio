package relogio;
public non-sealed class USClock extends Clock {

    private String periedIndicator;

    public String getPeriodIndicator() {
        return periedIndicator;
    }

    public void setAfterMidDay(){
        this.periedIndicator = "PM";
    }

    public void setBeforeMidDay(){
        this.periedIndicator = "AM";
    }

    public void setHour(int hour){
        setBeforeMidDay();
        if ((hour >= 12) && (hour <=23)){
            setAfterMidDay();
            this.hour =  hour - 12;
        }else if (hour >= 24) {
       
            this.hour =  0;
        }else {
            this.hour = hour;
        }
    }

    @Override
    public Clock convert(final Clock clock) {
        this.second = clock.getSeconds();
        this.minute = clock.getMinutes();
        switch (clock){        
            case USClock usClock -> {      
                this.hour = usClock.getHours();
                this.periedIndicator = usClock.getPeriodIndicator();
            }
            case BRLClock brlClock -> this.setHour(brlClock.getHours());
        }
        return this;
    }

    @Override
    public String getTime(){
        return super.getTime() + " "+this.periedIndicator;
    }
}
