package ru.ibs.SpringFrameworkHW.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.ibs.SpringFrameworkHW.entities.Gear;

@Repository
public interface GearRepository extends CrudRepository<Gear, Long> {
}
