package ru.ibs.SpringFrameworkHW.services.interfaces;

import ru.ibs.SpringFrameworkHW.entities.Engine;
import ru.ibs.SpringFrameworkHW.entities.Gear;

import java.util.List;

public interface GearService {

    Gear findCarById(Long gearId);

    List<Gear> findGearAll();

    void addGear(Gear gear);

    void delete(Long gearId);
}
