package hello;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.*;

public class Time {
    private String lTime() {
        LocalTime currentTime = new LocalTime();
        int cutIndex = StringUtils.ordinalIndexOf(currentTime.toString(), ":", 2);
        return currentTime.toString().substring(0, cutIndex);
    }

    private String lDate() {
        LocalDate currentDate = new LocalDate();
        return currentDate.toString();
    }

    public String lDateTime() {
        return this.lTime() + "//" + this.lDate();
    }
}
