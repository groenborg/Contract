package contract;

import java.util.Date;
import java.util.List;

/**
 * Created by simon on 05/10/2016.
 */
public interface Contract {

    /**
     * The getDepartureTimes method should return a list with all departureTime
     * objects available.
     *
     * @return List<DepartureTime> departureTimes.
     */
    public List getDepartureTimes();

    /**
     * Should return all ferries available
     *
     * @return List<Ferry>.
     */
    public List getFerries();

    /**
     * should return all reservations available
     *
     * @return List<Reservation>.
     */
    public List getReservations();

    /**
     * should return all persons available
     *
     * @return List<Person>.
     */
    public List getPersons();

    /**
     * should return all tickets available
     *
     * @return List<Ticket>.
     */
    public List getTickets();


    /**
     * Should return a PersonInfo that has a matching email as the parameter.
     *
     * @param email
     * @return PersonInfo
     */
    public PersonInfo getPerson(String email);

    /**
     * Should return a Ticket that has a matching id as the parameter.
     *
     * @param ticket_id
     * @return Ticket
     */
    public Ticket getTicket(String ticket_id);

    /**
     * Should return a Ferry that has a matching id as the parameter.
     *
     * @param ferry_id
     * @return Ferry
     */
    public Ferry getFerry(String ferry_id);

    /**
     * Should return a Reservation that has a matching id as the parameter.
     *
     * @param reservation_id
     * @return Reservation
     */
    public Reservation getReservation(String reservation_id);


    /**
     * Should add a Ferry, in case of the need to rent a ferry, and return
     * the id of the added ferry.
     *
     * @param name
     * @param docked_state
     * @param lent_state
     * @param shipSize     (Must be "small", "medium" or "large")
     * @return String
     */
    public String createFerry(String name, boolean docked_state, boolean lent_state, String shipSize);

    /**
     * Should add a PersonInfo, and return the id of the added person.
     *
     * @param name
     * @param address
     * @param email
     * @param phone
     * @param password
     * @return String
     */
    public String createPerson(String name, String address, String email, String phone, String password);

    /**
     * Should add a Reservation, and return the id of the added reservation.
     *
     * @param email
     * @param ticketIDout
     * @param ticketIDreturn
     * @param price
     * @return String
     */
    public String createReservation(String email, String ticketIDout, String ticketIDreturn, int price);

    /**
     * Should add a Ticket, and return the id of the added ticket.
     *
     * @param email
     * @param datetime
     * @param vehicleType
     * @param duration_in_minutes
     * @param numberOfPassengers
     * @return String
     */
    public String createTicket(String email, Date datetime, int duration_in_minutes, String vehicleType, int numberOfPassengers);


    /**
     * Should delete the Reservation with the given id, and return the id of the
     * deleted reservation
     *
     * @param reservation_id
     * @return String
     */
    public String deleteReservation(String reservation_id);

    /**
     * Should delete the Ferry with the given id, and return the id of the
     * deleted ferry
     *
     * @param ferry_id
     * @return String
     */
    public String deleteFerry(String ferry_id);

    /**
     * Should delete the PersonInfo with the given email, and return the email of the
     * deleted PersonInfo
     *
     * @param email
     * @return String
     */
    public String deletePerson(String email);

}
