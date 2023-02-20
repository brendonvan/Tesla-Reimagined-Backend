package com.teslareimagined.backend.design;

import java.util.List;
import java.util.Optional;

public interface IDesignService {

    List<Design> find();
    Optional<Design> findId(Long id);
    Design create(Design design);
    Design update(Long id, String name, int range, int top_speed, double zero_to_sixty, String motor_options, String paint_options, String wheel_options, String interior_options, boolean enhanced_autopilot, boolean full_autopilot);
    void delete(Long id);
}
