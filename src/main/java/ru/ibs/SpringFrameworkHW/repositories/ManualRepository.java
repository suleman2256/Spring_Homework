package ru.ibs.SpringFrameworkHW.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.ibs.SpringFrameworkHW.entities.Manual;

@Repository
public interface ManualRepository extends CrudRepository<Manual, Long> {
}
