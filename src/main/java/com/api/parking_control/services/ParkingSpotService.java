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
/*
    public boolean existByLicensePlateCar(String licensePlateCar) {
        return parkingSpotRepository.existByLicensePlateCar(licensePlateCar);
    }


    public boolean existByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepository.existByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existByApartmentAndBlock(String apartment, String block) {
        return parkingSpotRepository.existByApartmentAndBlock(apartment,block);
    }

 */
}
