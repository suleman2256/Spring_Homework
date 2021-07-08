package ru.ibs.SpringFrameworkHW.services.interfaces;

import ru.ibs.SpringFrameworkHW.entities.Car;
import ru.ibs.SpringFrameworkHW.entities.Engine;
import ru.ibs.SpringFrameworkHW.entities.SteeringWheel;

import java.util.List;

public interface CarService {

    void addCar(Car car);

    List<Car> findCarAll();

    Car findCarById(Long id);

    void delete(Long id);
}
