package hello;

import org.joda.time.*;

public class Time {
    public String lTime() {
        LocalTime currentTime = new LocalTime();
        return("The current local time is: " + currentTime);
    }

    public String lDate() {
        LocalDate currentDate = new LocalDate();
        return("The current local date is: " + currentDate);
    }

    public String lDateTime() {
        LocalDateTime currentFull = new LocalDateTime();
        return("The current local date and time is: " + currentFull);
    }
}
