package contract;

import java.util.Collection;
import java.util.Date;

/**
 * Created by simon on 05/10/2016.
 */
public interface AdminstratorContract {

    /**
     * Find a schedule for a spefic ferryLine
     *
     * @param ferryLineInfo
     * @param date
     * @return Schedule
     */
    public Schedule findSchedule(FerryLineInfo ferryLineInfo, Date date);

    /**
     * Update a schedule
     *
     * @param departureTimes
     * @param id
     * @return
     */
    public Schedule updateSchedule(Collection<DepartureTime> departureTimes, Number id);

    /**
     * Delete a schedule from the system
     *
     * @param id
     * @return
     */
    public Number deleteSchedule(Number id);

    /**
     * Create a new ferry in the system
     *
     * @param ferry
     * @param ferryConfiguration
     * @return
     */
    public Ferry createFerry(Ferry ferry, FerryConfig[] ferryConfiguration);

    /***
     * View a ferry
     * @param serialNumber
     * @return
     */
    public Ferry viewFerry(Number serialNumber);

    /**
     * Update a ferry
     *
     * @param SerialNumber
     * @param lendState
     * @param dockState
     * @return
     */
    public Ferry updateFerry(Number SerialNumber, boolean lendState, boolean dockState);

    /**
     * Delete a ferry
     *
     * @param serialNumber
     * @return
     */
    public Ferry deleteFerry(Number serialNumber);

    /**
     * Add a ferry
     *
     * @param routeId
     * @param serialNumber
     * @return
     */
    public Ferry addFerry(Number routeId, Number serialNumber);


    /**
     * Remove a ferry from a Route
     *
     * @param routeId
     * @param serialNumber
     * @return
     */
    public Number removeFerry(Number routeId, Number serialNumber);
}
