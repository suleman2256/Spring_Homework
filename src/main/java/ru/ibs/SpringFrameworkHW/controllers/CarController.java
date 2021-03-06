package ru.ibs.SpringFrameworkHW.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.ibs.SpringFrameworkHW.entities.Car;
import ru.ibs.SpringFrameworkHW.entities.Engine;
import ru.ibs.SpringFrameworkHW.entities.SteeringWheel;
import ru.ibs.SpringFrameworkHW.services.interfaces.CarService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/car", consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE )
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping("create")
    public Car create(@RequestBody Car car) {
        carService.addCar(car);
        return car;
    }

    @GetMapping("read/{id}")
    public Car readByID(@PathVariable Long id){
        return carService.findCarById(id);
    }

    @GetMapping("read")
    public List<Car> readAll(){
        return carService.findCarAll();
    }

    @PostMapping("update/{id}")
    public void updateById(@PathVariable Long id,@RequestBody Car car){
        carService.addCar(car);
    }

    @PostMapping("delete/{id}")
    public Car delete(@PathVariable Long id) {
        Car car = carService.findCarById(id);
        carService.delete(id);
        return car;
    }

}
