package org.example.Models;

import org.example.Models.Car;

import java.util.Date;

public class Truck extends Car  {

    private Integer numberOfWheels;
     private Boolean trailer;

    @Override
    public void startMotor() {

    }

    @Override
    public void stopMotor() {

    }

    @Override
    public void speedUp() {

    }

    @Override
    public void brake() {

    }

    public Truck() {
    }

    public Truck(Integer id, String name, String color, Double weight, String carPlate, Date dateInscription, Integer numberOfWheels, Boolean trailer) {
        super(id, name, color, weight, carPlate, dateInscription);
        this.numberOfWheels = numberOfWheels;
        this.trailer = trailer;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Boolean getTrailer() {
        return trailer;
    }

    public void setTrailer(Boolean trailer) {
        this.trailer = trailer;
    }
}
