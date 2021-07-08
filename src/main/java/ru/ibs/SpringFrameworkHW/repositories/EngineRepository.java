package ru.ibs.SpringFrameworkHW.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.ibs.SpringFrameworkHW.entities.Engine;

@Repository
public interface EngineRepository extends CrudRepository<Engine, Long> {
}
