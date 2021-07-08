package ru.ibs.SpringFrameworkHW.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.SpringFrameworkHW.entities.Engine;
import ru.ibs.SpringFrameworkHW.entities.Gear;
import ru.ibs.SpringFrameworkHW.entities.Manual;
import ru.ibs.SpringFrameworkHW.repositories.EngineRepository;
import ru.ibs.SpringFrameworkHW.services.interfaces.EngineService;

import java.util.List;

@Service
public class EngineServiceImpl implements EngineService {

    @Autowired
    EngineRepository engineRepository;

    @Override
    public List<Engine> findEngineAll() {
        return (List<Engine>) engineRepository.findAll();
    }

    @Override
    public Engine findEngineById(Long engineId) {
        return engineRepository.findById(engineId).get();
    }

    @Override
    public void addEngine(Engine engine) {
        engineRepository.save(engine);
    }

    @Override
    public void delete(Long engineId) {
        engineRepository.delete(findEngineById(engineId));
    }
}
