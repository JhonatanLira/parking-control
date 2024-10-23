package com.api.parking_control.services;

import com.api.parking_control.controllers.ParkingSpotController;
import com.api.parking_control.models.ParkingSpotModel;
import com.api.parking_control.repositories.ParkingSpotRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Transactional
    public ParkingSpotModel  save(ParkingSpotModel parkingSpotModel) {
            return parkingSpotRepository.save(parkingSpotModel);
    }
}
