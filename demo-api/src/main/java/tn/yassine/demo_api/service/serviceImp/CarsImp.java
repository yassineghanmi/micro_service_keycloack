package tn.yassine.demo_api.service.serviceImp;

import lombok.AllArgsConstructor;
import tn.yassine.demo_api.entity.Cars;
import tn.yassine.demo_api.repository.CarsRepository;
import tn.yassine.demo_api.service.CarsService;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class CarsImp implements CarsService {

    private CarsRepository carsRepository;

    @Override
    public List<Cars> getAllCars() {
        return carsRepository.findAll();
    }

    @Override
    public Cars createCar(Cars car) {
        return carsRepository.save(car);
    }
}
