package org.example.Models;

import java.util.Date;

public abstract class Car implements ActionsCar {

    private Integer id;
    private String name;
    private String color;
    private Double weight;
    private String carPlate;
    private Date dateInscription;

    public Car() {
    }

    public Car(Integer id, String name, String color, Double weight, String carPlate, Date dateInscription) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.carPlate = carPlate;
        this.dateInscription = dateInscription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }
}
