package ru.ibs.SpringFrameworkHW.services.interfaces;

import ru.ibs.SpringFrameworkHW.entities.SteeringWheel;

import java.util.List;

public interface SteeringWService {

    SteeringWheel findSteeringWheelById(Long swId);

    List<SteeringWheel> findSteeringWheelAll();

    void addSteeringWheel(SteeringWheel steeringWheel);

    void delete(Long swId);
}
