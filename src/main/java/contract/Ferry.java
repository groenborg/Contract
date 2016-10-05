package contract;

import java.util.Collection;

/**
 * Created by simon on 05/10/2016.
 */
public class Ferry {
    String serialNumber;
    String name;
    boolean docked_state;
    boolean lent_state;
    Collection<FerryLineInfo> ferryLineInfo;

    public Ferry(String serialNumber, String name, boolean docked_state, boolean lent_state, Collection<FerryLineInfo> ferryLineInfo) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.docked_state = docked_state;
        this.lent_state = lent_state;
        this.ferryLineInfo = ferryLineInfo;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public boolean isDocked_state() {
        return docked_state;
    }

    public boolean isLent_state() {
        return lent_state;
    }

    public Collection<FerryLineInfo> getFerryLineInfo() {
        return ferryLineInfo;
    }

}
