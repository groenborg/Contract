package eto;

public class FerryNotOnRouteException extends Exception{

    /**
     * Thrown when trying to remove a ferry from a route where the ferry isn't added
     * @param message
     */
    public FerryNotOnRouteException(String message){
        super(message);
    }

}
