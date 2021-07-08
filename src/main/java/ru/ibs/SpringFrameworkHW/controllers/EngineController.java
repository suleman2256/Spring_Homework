package ru.ibs.SpringFrameworkHW.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.ibs.SpringFrameworkHW.entities.Car;
import ru.ibs.SpringFrameworkHW.entities.Engine;
import ru.ibs.SpringFrameworkHW.entities.Gear;
import ru.ibs.SpringFrameworkHW.entities.Manual;
import ru.ibs.SpringFrameworkHW.services.interfaces.EngineService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/engine", consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE )
public class EngineController {

    @Autowired
    EngineService engineService;

    @PostMapping("create")
    public Engine create(@RequestBody Engine engine) {
        engineService.addEngine(engine);
        return engine;
    }

    @GetMapping("read/{id}")
    public Engine readByID(@PathVariable Long id){
        return engineService.findEngineById(id);
    }

    @GetMapping("read")
    public List<Engine> read(){
        return engineService.findEngineAll();
    }

    @PostMapping("update/{id}")
    public void updateById(@PathVariable Long id,@RequestBody Engine engine) {
        engineService.addEngine(engine);
    }

    @PostMapping("delete/{id}")
    public Engine deleteById(@PathVariable Long id) {
        Engine engine = engineService.findEngineById(id);
        engineService.delete(id);
        return engine;
    }
}
