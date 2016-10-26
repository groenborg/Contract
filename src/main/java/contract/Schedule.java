package contract;

import java.util.Collection;
import java.util.Date;


public class Schedule {
    Date date;
    Collection<DepartureTime> departureTimes;

    public Schedule(Date date, Collection<DepartureTime> departureTimes) {
        this.date = date;
        this.departureTimes = departureTimes;
    }

    /**
     * returns the date of the schedule
     * @return 
     */
    public Date getDate() {
        return date;
    }

    /**
     * Returns a list of departureTimes for the specific schedules
     * @return 
     */
    public Collection<DepartureTime> getDepartureTimes() {
        return departureTimes;
    }


}