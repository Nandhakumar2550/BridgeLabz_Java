package inbuild.level1;
import java.time.ZonedDateTime;
import java.time.ZoneId;
public class TimeZoneDisplay {
    public static void displayTime(String zone) {

        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zone));
        System.out.println(zone + " : " + time);
    }

    public static void main(String[] args) {

        displayTime("GMT");
        displayTime("Asia/Kolkata");
        displayTime("America/Los_Angeles");
    }
}
