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
public class Vehicle {
    
    VehicleType vehicleType;
    Number height;
    Number length;
    Number limit;
    
    public Vehicle(VehicleType vehicleType, Number vehicleHeight, Number vehicleLength, Number limit) {
        this.vehicleType = vehicleType;
        this.height = vehicleHeight;
        this.length = vehicleLength;
        this.limit = limit;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Number getHeight() {
        return height;
    }

    public Number getLength() {
        return length;
    }

    public Number getLimit() {
        return limit;
    }

    
}
