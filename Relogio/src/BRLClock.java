public non-sealed class BRLClock extends Clock {

    @Override
    public Clock convert(final Clock clock) {
        this.second = clock.getSeconds();
        this.minute = clock.getMinutes();
        switch (clock){        
            case USClock usClock -> {      
                this.hour = (usClock.getPeriodIndicator().equals("PM")) ? usClock.getHours() + 12 : usClock.getHours();
            }
            case BRLClock brlClock -> {
                this.hour = brlClock.getHours();
            }
        }
        return this;
    }

     
}