/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract;

import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Uffe
 */
public class Schedule {
    Date date;
    Collection<DepartureTime> departureTimes;

    public Schedule(Date date, Collection<DepartureTime> departureTimes) {
        this.date = date;
        this.departureTimes = departureTimes;
    }

    public Date getDate() {
        return date;
    }

    public Collection<DepartureTime> getDepartureTimes() {
        return departureTimes;
    }
    
    
}
