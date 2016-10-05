package eto;

public class FerryNotFoundException extends Exception{

    /**
     * Ferry doesn't exist in system
     * @param message
     */
    public FerryNotFoundException(String message){
        super(message);
    }

}
