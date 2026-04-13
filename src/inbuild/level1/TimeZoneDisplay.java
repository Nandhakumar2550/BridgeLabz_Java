package inbuild.level1;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZoneDisplay {
    public static void displayTime(String zone) {

        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zone));
        // Gets current date and time for the given time zone

        System.out.println(zone + " : " + time);
        // Displays time along with zone name
    }

    public static void main(String[] args) {

        displayTime("GMT");
        // Displays time in GMT zone

        displayTime("Asia/Kolkata");
        // Displays time in Indian Standard Time

        displayTime("America/Los_Angeles");
        // Displays time in Pacific Time (USA)
    }
}