package eto;

public class InvalidDepartureTimeException extends Exception {

    /**
     * When DepartureTime is invalid
     * @param message
     */
    public InvalidDepartureTimeException(String message){
        super(message);
    }

}
