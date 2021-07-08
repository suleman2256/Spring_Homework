package ru.ibs.SpringFrameworkHW.services.interfaces;

import ru.ibs.SpringFrameworkHW.entities.*;

import java.util.List;

public interface EngineService {

    List<Engine> findEngineAll();

    Engine findEngineById(Long engineId);

    void addEngine(Engine engine);

    Engine updateById(Long engineId, String type, List<Gear> gears, List<Manual> manuals);

    void delete(Long engineId);
}
