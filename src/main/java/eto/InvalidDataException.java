package eto;

public class InvalidDataException extends Exception{

    /**
     * Invalid data input
     * @param message
     */
    public InvalidDataException(String message) {
        super(message);
    }

}
