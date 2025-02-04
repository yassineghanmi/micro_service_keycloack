package tn.yassine.demo_api.service;

import tn.yassine.demo_api.entity.Cars;

import java.util.List;
import java.util.Optional;

public interface CarsService {
    public List<Cars> getAllCars();
    public Cars createCar(Cars cars);
}
