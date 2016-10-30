package contracttest;

import contract.DepartureTime;
import contract.UserContract;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Collection;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;


public class UserContractTest {

    private UserContract user;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getAllDepartures() throws Exception{

        Collection<DepartureTime> departures = user.getAllDepartures(null, null);
        assertThat(departures, is(not(hasSize(0))));
    }

    @Test
    public void createReservation() throws Exception {

    }

    @Test
    public void deleteReservation() throws Exception {

    }

    @Test
    public void viewReservation() throws Exception {

    }

}