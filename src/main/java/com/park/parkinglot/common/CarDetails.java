/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.park.parkinglot.common;

import java.io.Serializable;

/**
 *
 * @author Albu Catalina
 */
//this class will remain without any annotations (POJO -plain old java object)

public class CarDetails implements Serializable {
    
    private Integer id;
    private String licensePlate;
    private String parkingSpot;
    private String userName;

    public CarDetails(Integer id, String licensePlate, String parkingSpot, String userName) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.parkingSpot = parkingSpot;
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public String getUserName() {
        return userName;
    }
    
    
}
