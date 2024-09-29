package org.example.javattd28.rapido;

public class Driver {
    public String name;
    public String mobileNumber;
    public Vehicle vehicle;
    public  Insurance insurance;

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", vehicle=" + vehicle +
                ", insurance=" + insurance +
                '}';
    }
}
