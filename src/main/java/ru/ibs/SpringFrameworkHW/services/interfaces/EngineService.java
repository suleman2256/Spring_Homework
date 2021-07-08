package ru.ibs.SpringFrameworkHW.services.interfaces;

import ru.ibs.SpringFrameworkHW.entities.*;

import java.util.List;

public interface EngineService {



    List<Engine> findEngineAll();

    Engine findEngineById(Long engineId);

    void addEngine(Engine engine);

    void delete(Long engineId);
}
