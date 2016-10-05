/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract;

/**
 *
 * @author Uffe
 */
public class FerryConfig {
    int personLimit;
    int carLimit;
    int lorryLimit;
    int machineLimit;

    public FerryConfig(int personLimit, int carLimit, int lorryLimit, int machineLimit) {
        this.personLimit = personLimit;
        this.carLimit = carLimit;
        this.lorryLimit = lorryLimit;
        this.machineLimit = machineLimit;
    }

    public int getPersonLimit() {
        return personLimit;
    }

    public int getCarLimit() {
        return carLimit;
    }

    public int getLorryLimit() {
        return lorryLimit;
    }

    public int getMachineLimit() {
        return machineLimit;
    }
    
}
