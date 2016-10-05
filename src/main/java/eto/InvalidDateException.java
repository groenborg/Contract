package eto;

public class InvalidDateException extends Exception{

    /**
     * Using wrong dateFormat
     * @param message
     */
    public InvalidDateException(String message) {
        super(message);
    }

}