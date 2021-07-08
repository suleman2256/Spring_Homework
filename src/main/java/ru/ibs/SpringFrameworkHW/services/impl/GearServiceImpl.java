package ru.ibs.SpringFrameworkHW.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.SpringFrameworkHW.entities.Engine;
import ru.ibs.SpringFrameworkHW.entities.Gear;
import ru.ibs.SpringFrameworkHW.repositories.GearRepository;
import ru.ibs.SpringFrameworkHW.services.interfaces.GearService;

import java.util.List;

@Service
public class GearServiceImpl implements GearService {

    @Autowired
    GearRepository gearRepository;

    @Override
    public Gear findCarById(Long gearId) {
        return gearRepository.findById(gearId).get();
    }

    @Override
    public List<Gear> findGearAll() {
        return (List<Gear>) gearRepository.findAll();
    }

    @Override
    public void addGear(Gear gear) {
        gearRepository.save(gear);
    }


    @Override
    public Gear updateById(Long gearId, Long gearSize, Engine engine) {
        Gear gear = gearRepository.findById(gearId).get();
        gear.setGearSize(gearSize);
        gear.setEngine(engine);
        gearRepository.save(gear);
        return gear;
    }

    @Override
    public void delete(Long gearId) {
        gearRepository.delete(findCarById(gearId));
    }
}
