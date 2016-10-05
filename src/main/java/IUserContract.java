/**
 * Created by geera on 05-Oct-16.
 */
import eto.*;
import contract.*;
import java.util.*;
public interface IUserContract
{
    /**
     *
     * @param date Date object with Unix Timestamp
     * @param ferryLineInfo Info about the route.
     * @return Returns a collection of DepartureTime
     * @throws InvalidDateException
     * @throws InvalidRouteException
     */
    Collection<DepartureTime> GetAllDepartures(Date date, FerryLineInfo ferryLineInfo) throws InvalidDateException, InvalidRouteException;

    /**
     *
     * @param personInfo info about reserving person.
     * @param ferryLineInfo info about route
     * @param departureTimes info about departure time
     * @param vehicle info about vehicle size
     * @param vehiclePassengers number of passengers in vehicle including reserver
     * @param walkOns number of walkon passengers on besides passengers in vehicle, if any
     * @return Returns the reservation and info.
     * @throws NoVacanciesException
     * @throws InvalidDateException
     */
    Reservation CreateReservation(PersonInfo personInfo, FerryLineInfo ferryLineInfo, DepartureTime departureTimes, Vehicle vehicle, Number vehiclePassengers, Number walkOns) throws NoVacanciesException, InvalidDateException;

    /**
     *
     * @param reservationId The id of the reservation
     * @param email The email of the reservation
     * @return Returns number of deleted reservation or -1 if none.
     * @throws InvalidReservationIdException
     * @throws InvalidEmailException
     * @throws InvalidReservationException
     */
    Number DeleteReservation(Number reservationId, String email) throws InvalidReservationIdException, InvalidEmailException, InvalidReservationException;

    /**
     *
     * @param reservationId The id of the reservation
     * @param email The email of the reservation
     * @return Returns the reservaton information if found
     * @throws InvalidReservationIdException
     * @throws InvalidEmailException
     * @throws InvalidReservationException
     */
    Reservation ViewReservation(Number reservationId, String email) throws InvalidReservationIdException, InvalidEmailException, InvalidReservationException;

}
