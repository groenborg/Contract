package eto;

public class DuplicateFerryException extends Exception {

    /**
     * When creating a ferry and duplicate alreade exists
     * @param message
     */
    public DuplicateFerryException(String message){
        super(message);
    }

}
