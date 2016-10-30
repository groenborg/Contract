package contract;

import eto.*;

import java.util.Collection;
import java.util.Date;

public interface AdministratorContract {

    /***
     * Find a schedule for a specific ferryLine - Creates if none found
     * @param ferryLineInfo info for FerryLine
     * @param date a Date
     * @return Schedule
     * @throws FerryLineNotFoundException If Schedule is not found
     * @throws InvalidDateException If the date is Invalid
     */
    public Schedule findSchedule(FerryLineInfo ferryLineInfo, Date date) throws FerryLineNotFoundException, InvalidDateException;

    /**
     * Update a Schedule
     *
     * @param departureTimes dto
     * @param scheduleId     ID for schedule
     * @return Schedule
     * @throws ScheduleIdNotFoundException   If schedule is not found
     * @throws InvalidDepartureTimeException If departure is invalid
     */
    public Schedule updateSchedule(Collection<DepartureTime> departureTimes, Number scheduleId) throws ScheduleIdNotFoundException, InvalidDepartureTimeException;

    /**
     * Delete a Schedule from the system
     *
     * @param id ID for a schedule
     * @return Number
     * @throws ScheduleIdNotFoundException If no schedule is not found
     */
    public Number deleteSchedule(Number id) throws ScheduleIdNotFoundException;

    /**
     * Create a new Ferry
     *
     * @param ferry              dto
     * @param ferryConfiguration dto
     * @return Ferry
     * @throws DuplicateFerryException is ferry already exists
     * @throws InvalidDateException    If date is invalid
     */
    public Ferry createFerry(Ferry ferry, FerryConfig[] ferryConfiguration) throws DuplicateFerryException, InvalidDateException;

    /**
     * View a Ferry
     *
     * @param serialNumber for a ferry
     * @return Ferry
     * @throws FerryNotFoundException If ferry does not exist
     */
    public Ferry viewFerry(Number serialNumber) throws FerryNotFoundException;

    /**
     * Update a Ferry
     *
     * @param SerialNumber for ferry
     * @param lendState    owned or lend
     * @param dockState    docked
     * @return Ferry
     * @throws FerryNotFoundException If ferry does not exist
     */
    public Ferry updateFerry(Number SerialNumber, boolean lendState, boolean dockState) throws FerryNotFoundException;

    /**
     * Delete a Ferry
     *
     * @param serialNumber for ferry
     * @return Ferry
     * @throws FerryNotFoundException If ferry does not exist
     */
    public Ferry deleteFerry(Number serialNumber) throws FerryNotFoundException;

    /**
     * Add a FerryToARoute
     *
     * @param routeId      ID of route
     * @param serialNumber ID of Ferry
     * @return Ferry
     * @throws FerryNotFoundException       If no ferry found
     * @throws InvalidRouteException        If invalid route
     * @throws FerryAlreadyOnRouteException If ferry already on route
     */
    public Ferry addFerryToRoute(Number routeId, Number serialNumber) throws FerryNotFoundException, InvalidRouteException, FerryAlreadyOnRouteException;


    /**
     * Removes a Ferry from a Route
     *
     * @param routeId      ID for route
     * @param serialNumber ID for ferry
     * @return Ferry
     * @throws FerryNotFoundException   If no ferry found
     * @throws InvalidRouteException    If route does not exist
     * @throws FerryNotOnRouteException If ferry not on this route
     */
    public Number removeFerryFromRoute(Number routeId, Number serialNumber) throws FerryNotFoundException, InvalidRouteException, FerryNotOnRouteException;
}
