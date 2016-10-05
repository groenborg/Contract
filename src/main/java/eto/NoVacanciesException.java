package eto;

/**
 * Created by Skroget on 05/10/16.
 */
public class NoVacanciesException extends Exception {

    /**
     * No available reservation slots
     * @param message
     */
    public NoVacanciesException(String message) {

        super(message);
    }

}
