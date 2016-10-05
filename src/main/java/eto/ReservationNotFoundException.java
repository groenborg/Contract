package eto;

public class InvalidReservationException extends Exception {

    /**
     * When trying to view a Reservation but it's not found
     * @param message
     */
    public InvalidReservationException(String message){
        super(message);
    }

}
