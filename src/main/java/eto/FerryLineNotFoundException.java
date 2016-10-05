package eto;

public class FerryLineNotFoundException extends Exception {

    /**
     * When FerryLine doesn't exist
     * @param message
     */
    public FerryLineNotFoundException(String message){
        super(message);
    }

}
