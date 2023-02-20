package com.teslareimagined.backend.design;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// This is where you set all methods that manage the designs
@Service
public class DesignService implements IDesignService {
    @Autowired
    private DesignRepository repository;

    @Override
    public List<Design> find() {
        return repository.findAllByOrderByIdAsc();
    }

    @Override
    public Optional<Design> findId(Long id) {
        return repository.findById(id);
    }

    @Override
    public Design create(Design design) {
        return repository.save(design);
    }

    @Override
    public Design update(Long id, String name, int range, int top_speed, double zero_to_sixty, String motor_options, String paint_options, String wheel_options, String interior_options, boolean enhanced_autopilot, boolean full_autopilot) {
        return repository.findById(id).map(existingDesign -> {
            existingDesign.setName(name);
            existingDesign.setRange(range);
            existingDesign.setTop_speed(top_speed);
            existingDesign.setZero_to_sixty(zero_to_sixty);
            existingDesign.setMotor_options(motor_options);
            existingDesign.setPaint_options(paint_options);
            existingDesign.setWheel_options(wheel_options);
            existingDesign.setInterior_options(interior_options);
            existingDesign.setEnhanced_autopilot(enhanced_autopilot);
            existingDesign.setFull_autopilot(full_autopilot);
            return repository.save(existingDesign);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
