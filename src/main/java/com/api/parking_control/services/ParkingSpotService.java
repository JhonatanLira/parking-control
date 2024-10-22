package com.api.parking_control.services;

import com.api.parking_control.controllers.ParkingSpotController;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    final ParkingSpotController parkingSpotController;

    public ParkingSpotService(ParkingSpotController parkingSpotController) {
        this.parkingSpotController = parkingSpotController;
    }

}
