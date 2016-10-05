package eto;

public class FerryAlreadyOnRouteException extends Exception {

    /**
     * When adding ferry to route and it's already added
     * @param message
     */
    public FerryAlreadyOnRouteException(String message){
        super(message);
    }

}
