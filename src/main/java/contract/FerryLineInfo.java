/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract;

import java.util.Collection;

/**
 *
 * @author Uffe
 */
public class FerryLineInfo {
    String startDestination;
    String endDestination;
    Collection<Ferry> ferries;
    

    public FerryLineInfo(String startDestination, String endDestination) {
        this.startDestination = startDestination;
        this.endDestination = endDestination;
    }

    public String getStartDestination() {
        return startDestination;
    }

    public String getEndDestination() {
        return endDestination;
    }

    
}
