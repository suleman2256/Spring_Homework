package ru.ibs.SpringFrameworkHW.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.SpringFrameworkHW.entities.Car;
import ru.ibs.SpringFrameworkHW.entities.Engine;
import ru.ibs.SpringFrameworkHW.entities.SteeringWheel;
import ru.ibs.SpringFrameworkHW.repositories.CarRepository;
import ru.ibs.SpringFrameworkHW.services.interfaces.CarService;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public void addCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public List<Car> findCarAll() {
        return (List<Car>) carRepository.findAll();
    }

    @Override
    public Car findCarById(Long id) {
        return carRepository.findById(id).get();
    }

    @Override
    public Car updateById(Long id, String manufactureName, String modelName, Engine engine, SteeringWheel steeringWheel) {
        Car car = carRepository.findById(id).get();
        car.setManufactureName(manufactureName);
        car.setModelName(modelName);
        car.setEngine(engine);
        car.setSteeringWheel(steeringWheel);
        carRepository.save(car);
        return car;
    }

    @Override
    public void delete(Long id) {
        carRepository.delete(findCarById(id));
    }
}
