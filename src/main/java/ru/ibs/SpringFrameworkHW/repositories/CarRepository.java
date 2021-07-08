package ru.ibs.SpringFrameworkHW.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.ibs.SpringFrameworkHW.entities.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
}
