package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : ravi
 * Created date : 5/19/2024
 * Created time : 9:21 AM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String brand;
    private String model;
    private double engCap;




}
