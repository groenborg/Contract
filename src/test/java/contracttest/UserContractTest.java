package contracttest;

import contract.*;
import eto.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import static contracttest.UserContractHolder.contract;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;


public class UserContractTest {


    private Collection<DepartureTime> departures;
    private Reservation reservation;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getAllValidDepartures() throws Exception {
        assumeThat(contract, not(nullValue()));

        FerryLineInfo validInfo = new FerryLineInfo("valid", "valid");
        Date validDate = Calendar.getInstance().getTime();

        departures = contract.getAllDepartures(validDate, validInfo);
        assertThat(departures, is(not(hasSize(0))));
    }


    @Test(expected = InvalidRouteException.class)
    public void getAllDeparturesInvalidRoute() throws Exception {
        assumeThat(contract, not(nullValue()));

        FerryLineInfo validInfo = new FerryLineInfo("invalid", "invalid");
        Date validDate = Calendar.getInstance().getTime();
        departures = contract.getAllDepartures(validDate, validInfo);
    }

    @Test(expected = InvalidDateException.class)
    public void getAllDeparturesInvalidDate() throws Exception {
        assumeThat(contract, not(nullValue()));

        FerryLineInfo validInfo = new FerryLineInfo("valid", "valid");
        departures = contract.getAllDepartures(null, validInfo);
    }


    @Test
    public void createValidReservation() throws Exception {
        assumeThat(contract, not(nullValue()));

        PersonInfo personInfo = new PersonInfo("John", "doe", "something@mail.com", "addresss", "tlf");
        FerryLineInfo ferryLineInfo = new FerryLineInfo("WishIsland", "piratebay");
        DepartureTime time = new DepartureTime(Calendar.getInstance().getTime());
        Vehicle vehicle = new Vehicle(VehicleType.BIKE, 2, 2, 2);

        reservation = contract.createReservation(personInfo, ferryLineInfo, time, vehicle, 2, 0);
        assertThat(reservation, is(not(nullValue())));
    }

    @Test(expected = NoVacanciesException.class)
    public void createDoubleReservation() throws Exception {
        assumeThat(contract, not(nullValue()));

        PersonInfo personInfo = new PersonInfo("John", "doe", "something@mail.com", "addresss", "tlf");
        FerryLineInfo ferryLineInfo = new FerryLineInfo("WishIsland", "piratebay");
        DepartureTime time = new DepartureTime(Calendar.getInstance().getTime());
        Vehicle vehicle = new Vehicle(VehicleType.BIKE, 2, 2, 2);

        reservation = contract.createReservation(personInfo, ferryLineInfo, time, vehicle, 2, 0);
        reservation = contract.createReservation(personInfo, ferryLineInfo, time, vehicle, 2, 0);
    }

    @Test(expected = InvalidDateException.class)
    public void createInvalidDateReservation() throws Exception {
        assumeThat(contract, not(nullValue()));

        PersonInfo personInfo = new PersonInfo("John", "doe", "something@mail.com", "addresss", "tlf");
        FerryLineInfo ferryLineInfo = new FerryLineInfo("WishIsland", "piratebay");
        Vehicle vehicle = new Vehicle(VehicleType.BIKE, 2, 2, 2);

        reservation = contract.createReservation(personInfo, ferryLineInfo, null, vehicle, 2, 0);
    }


    @Test
    public void deleteValidReservation() throws Exception {
        assumeThat(contract, not(nullValue()));

        Number reservationID = 232378987;
        String email = "something@gmail.com";

        Number number = contract.deleteReservation(reservationID, email);
        assertThat(number, is(equalTo(reservationID)));
    }

    @Test(expected = InvalidReservationIdException.class)
    public void deleteInvalidIdReservation() throws Exception {
        assumeThat(contract, not(nullValue()));

        Number reservationID = 123;
        String email = "something@gmail.com";

        contract.deleteReservation(reservationID, email);
    }

    @Test(expected = InvalidEmailException.class)
    public void deleteInvalidEmailReservation() throws Exception {
        assumeThat(contract, not(nullValue()));
        contract.deleteReservation(123, "argh");
    }


    @Test
    public void viewReservation() throws Exception {
        assumeThat(contract, not(nullValue()));

        Number reservationId = 90849034;
        String email = "blabbla@gmail.com";

        reservation = contract.ViewReservation(reservationId, email);
        assertThat(reservation, not(nullValue()));
    }

    @Test(expected = InvalidReservationIdException.class)
    public void viewInvalidReservation() throws Exception {
        assumeThat(contract, not(nullValue()));

        Number reservationId = 78;
        String email = "blabbla@gmail.com";

        reservation = contract.ViewReservation(reservationId, email);
    }

}