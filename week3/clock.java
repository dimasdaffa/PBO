package week3;

public class clock {
    public static void main(String[] args) {
        clock_display clockDisplay = new clock_display(0,7);

        clockDisplay.timeTick();
        System.out.println("Waktu saat ini " + clockDisplay.getTime());
    }


}