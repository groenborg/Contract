package eto;

public class ScheduleIdNotFoundException extends Exception {

    /**
     * When Schedule doesn't exists
     * @param message
     */
    public ScheduleIdNotFoundException(String message){
        super(message);
    }

}
