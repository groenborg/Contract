package eto;

/**
 * Created by Skroget on 05/10/16.
 */
public class InvalidEmailException extends Exception{

    /**
     * Invalid email format submitted
     * @param message
     */
    public InvalidEmailException(String message){
        super(message);
    }

}
