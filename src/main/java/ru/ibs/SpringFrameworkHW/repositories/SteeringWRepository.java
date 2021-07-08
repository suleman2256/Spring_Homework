package ru.ibs.SpringFrameworkHW.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.ibs.SpringFrameworkHW.entities.SteeringWheel;

@Repository
public interface SteeringWRepository extends CrudRepository<SteeringWheel, Long> {
}
