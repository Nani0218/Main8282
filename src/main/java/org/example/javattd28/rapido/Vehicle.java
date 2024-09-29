package org.example.javattd28.rapido;

import org.example.javattd28.enumTest.VehicleTypeEnum;

public class Vehicle {


    public String vehicleNumber;

    public Insurance insurance;

    public VehicleTypeEnum vehicleType;

    public Driver driver;


    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", insurance=" + insurance +
                ", vehicleType=" + vehicleType +
                ", driver=" + driver +
                '}';
    }
}

