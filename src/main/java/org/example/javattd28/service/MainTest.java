package org.example.javattd28.service;

import org.example.javattd28.enumTest.VehicleTypeEnum;
import org.example.javattd28.rapido.*;

import java.util.Date;
import java.util.Locale;

public class MainTest {
    public static void main(String[] args) {
        User user =new User();
        user.name="nani";
        user.gender="female/male";
        user.emaill="naninaga196@gmail.com";
        user.mobileNumber="6281825284";
        user.userId="628182";


        Location fromlocation =new Location();
        fromlocation.latitude="NEOTERIC@OFFICE ";
        fromlocation.longitude="NEO";


        Insurance driverInsurance =new Insurance();
        driverInsurance.insuranceType="Accident";
        driverInsurance.insuranceId="dfgh85245nbv";

        Insurance vehicleInsurance =new Insurance();
        vehicleInsurance.insuranceId="445555";
        vehicleInsurance.insuranceType="Accident";


        Driver driver =new Driver();
        driver.name="naga";
        driver.mobileNumber="6255588759";
        driver.insurance=driverInsurance;


         Vehicle vehicle =new Vehicle();
         vehicle.vehicleNumber="TG D 02 2922";
         vehicle.vehicleType=VehicleTypeEnum.bike;
         vehicle.insurance=vehicleInsurance;
         vehicle.driver=driver;

         driver.vehicle=vehicle;

         Location toLocation =new Location();
         toLocation.latitude="Anukurahos";
         toLocation.longitude="neo";

         Task task=new Task();
         task.fromLocation=fromlocation;
         task.toLocaton=toLocation;
         task.userId=user;

         JobTaskMapping jobTaskMapping=new JobTaskMapping();
         jobTaskMapping.vehicle=vehicle;
         jobTaskMapping.startTime=new Date();
         jobTaskMapping.endTime=new Date(new Date().getTime()+60000);
         jobTaskMapping.task=task;

        System.out.println(jobTaskMapping.vehicle.driver.insurance.insuranceId);

        System.out.println(jobTaskMapping.vehicle.insurance.insuranceId);

        System.out.println(jobTaskMapping.task.fromLocation);
        System.out.println(jobTaskMapping.task.toLocaton);

        System.out.println(jobTaskMapping.vehicle.vehicleType);

    }
}
