package eto;

/**
 * Created by Skroget on 05/10/16.
 */
public class InvalidRouteException extends Exception{

    /**
     * When trying to add a ferry to a non existing ferryline
     * @param message
     */
    public InvalidRouteException(String message) {
        super(message);
    }

}
