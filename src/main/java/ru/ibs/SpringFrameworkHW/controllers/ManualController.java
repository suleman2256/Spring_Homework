package ru.ibs.SpringFrameworkHW.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.ibs.SpringFrameworkHW.entities.Car;
import ru.ibs.SpringFrameworkHW.entities.Engine;
import ru.ibs.SpringFrameworkHW.entities.Manual;
import ru.ibs.SpringFrameworkHW.services.interfaces.ManualService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/manual", consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE )
public class ManualController {

    @Autowired
    ManualService manualService;

    @PostMapping("create")
    public Manual create(@RequestBody Manual manual) {
        manualService.addManual(manual);
        return manual;
    }

    @GetMapping("read/{id}")
    public Manual readByID(@PathVariable Long id){
        return manualService.findManualById(id);
    }

    @GetMapping("read")
    public List<Manual> read(){
        return manualService.findManualAll();
    }

    @PostMapping("update/{id}")
    public Manual updateById(@PathVariable Long id,@RequestBody Manual manual){
        if (null == id)
            throw new RuntimeException("Null id!");
        String type = manual.getType();
        List<Engine> engines = manual.getEngines();
        final Manual updatedManual = manualService.updateById(id, type, engines);
        return updatedManual;
    }

    @PostMapping("delete/{id}")
    public Manual delete(@PathVariable Long id) {
        Manual manual = manualService.findManualById(id);
        manualService.delete(id);
        return manual;
    }
}
