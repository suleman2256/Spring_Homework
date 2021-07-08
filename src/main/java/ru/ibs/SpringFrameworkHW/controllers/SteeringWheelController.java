package ru.ibs.SpringFrameworkHW.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.ibs.SpringFrameworkHW.entities.SteeringWheel;
import ru.ibs.SpringFrameworkHW.services.interfaces.SteeringWService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/steeringWheel", consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE )
public class SteeringWheelController {

    @Autowired
    SteeringWService steeringWService;

    @PostMapping("create")
    public SteeringWheel create(@RequestBody SteeringWheel steeringWheel) {
        steeringWService.addSteeringWheel(steeringWheel);
        return steeringWheel;
    }

    @GetMapping("read/{id}")
    public SteeringWheel readByID(@PathVariable Long id){
        return steeringWService.findSteeringWheelById(id);
    }

    @GetMapping("read")
    public List<SteeringWheel> read(){
        return steeringWService.findSteeringWheelAll();
    }

    @PostMapping("update/{id}")
    public void updateById(@PathVariable Long id, @RequestBody SteeringWheel steeringWheel){
        steeringWService.addSteeringWheel(steeringWheel);
    }

    @PostMapping("delete/{id}")
    public SteeringWheel deleteById(@PathVariable Long id) {
        SteeringWheel steeringWheel = steeringWService.findSteeringWheelById(id);
        steeringWService.delete(id);
        return steeringWheel;
    }
}
