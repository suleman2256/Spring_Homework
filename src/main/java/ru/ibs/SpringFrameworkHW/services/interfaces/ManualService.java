package ru.ibs.SpringFrameworkHW.services.interfaces;

import ru.ibs.SpringFrameworkHW.entities.Engine;
import ru.ibs.SpringFrameworkHW.entities.Manual;

import java.util.List;

public interface ManualService {

    Manual findManualById(Long manualId);

    List<Manual> findManualAll();

    void addManual(Manual manual);

    void delete(Long manualId);
}
