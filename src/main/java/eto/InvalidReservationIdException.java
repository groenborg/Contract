package eto;

/**
 * Created by Skroget on 05/10/16.
 */
public class InvalidReservationIdException extends Exception {

    /**
     * Wrong ReservationID format
     * @param message
     */
    public InvalidReservationIdException(String message){
        super(message);
    }

}
