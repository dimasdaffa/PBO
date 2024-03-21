package week3;

public class clock_display {
    private number_display hours;
    private number_display minutes;
    private String displayString;

    public clock_display() {
        hours = new number_display(24);
        minutes = new number_display(60);
        updateDisplay();
    }

    public clock_display(int hour, int minute) {
        hours = new number_display(24);
        minutes = new number_display(60);
        setTime(hour, minute);
    }

    public void timeTick() {
        minutes.increment();
        if (minutes.getValue() == 0) {
            hours.increment();
        }
        updateDisplay();
    }

    public void setTime(int hour, int minute) {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    public String getTime() {
        return displayString;
    }

    public void updateDisplay() {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
}
