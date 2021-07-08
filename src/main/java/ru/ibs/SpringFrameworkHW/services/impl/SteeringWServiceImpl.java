package ru.ibs.SpringFrameworkHW.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.SpringFrameworkHW.entities.SteeringWheel;
import ru.ibs.SpringFrameworkHW.repositories.SteeringWRepository;
import ru.ibs.SpringFrameworkHW.services.interfaces.SteeringWService;

import java.util.List;

@Service
public class SteeringWServiceImpl implements SteeringWService {

    @Autowired
    SteeringWRepository steeringWRepository;

    @Override
    public SteeringWheel findSteeringWheelById(Long swId) {
        return steeringWRepository.findById(swId).get();
    }

    @Override
    public List<SteeringWheel> findSteeringWheelAll() {
        return (List<SteeringWheel>) steeringWRepository.findAll();
    }

    @Override
    public void addSteeringWheel(SteeringWheel steeringWheel) {
        steeringWRepository.save(steeringWheel);
    }

    @Override
    public SteeringWheel updateById(Long swId, String type) {
        SteeringWheel steeringWheel = steeringWRepository.findById(swId).get();
        steeringWheel.setType(type);
        steeringWRepository.save(steeringWheel);
        return steeringWheel;
    }

    @Override
    public void delete(Long swId) {
        steeringWRepository.delete(findSteeringWheelById(swId));
    }
}
