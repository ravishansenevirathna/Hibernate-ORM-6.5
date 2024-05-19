package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : ravi
 * Created date : 5/19/2024
 * Created time : 9:21 AM
 */

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String brand;
    private String model;
    private double engCap;

    public Car(Integer id, String brand, String model, double engCap) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.engCap = engCap;
    }

    public Car(int i) {
    }

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngCap() {
        return engCap;
    }

    public void setEngCap(double engCap) {
        this.engCap = engCap;
    }
}
