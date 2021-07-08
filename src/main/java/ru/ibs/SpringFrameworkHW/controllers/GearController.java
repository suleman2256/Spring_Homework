package ru.ibs.SpringFrameworkHW.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.ibs.SpringFrameworkHW.entities.Car;
import ru.ibs.SpringFrameworkHW.entities.Engine;
import ru.ibs.SpringFrameworkHW.entities.Gear;
import ru.ibs.SpringFrameworkHW.services.interfaces.GearService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/gear", consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE )
public class GearController {

    @Autowired
    GearService gearService;

    @PostMapping("create")
    public Gear create(@RequestBody Gear gear) {
        gearService.addGear(gear);
        return gear;
    }

    @GetMapping("read/{id}")
    public Gear readByID(@PathVariable Long id){
        return gearService.findCarById(id);
    }

    @GetMapping("read")
    public List<Gear> read(){
        return gearService.findGearAll();
    }

    @PostMapping("update/{id}")
    public Gear updateById(@PathVariable Long id,@RequestBody Gear gear){
        if (id == null)
            throw new RuntimeException("Null id!");
        Long gearSize = gear.getGearSize();
        Engine engine = gear.getEngine();
        final Gear updatedGear = gearService.updateById(id,gearSize,engine);
        return updatedGear;
    }

    @PostMapping("delete/{id}")
    public Gear deleteById(@PathVariable Long id) {
        Gear gear = gearService.findCarById(id);
        gearService.delete(id);
        return gear;
    }
}
