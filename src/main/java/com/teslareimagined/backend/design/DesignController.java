package com.teslareimagined.backend.design;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DesignController {
    @Autowired
    private DesignService service;

    @GetMapping("/dashboard")
    public List<Design> find() {
        return service.find();
    }

    @GetMapping("/dashboard/{id}")
    public Optional<Design> findId(@PathVariable Long id) {
        return service.findId(id);
    }

    @PostMapping("/design")
    @ResponseStatus(HttpStatus.CREATED)
    public Design create(@RequestBody Design design) {
        return service.create(design);
    }

    @PutMapping("/design/{id}")
    public Design update(@PathVariable Long id, @RequestBody Map<String, Object> payload) {
        return service.update(id, (String) payload.get("name"), (int) payload.get("range"), (int) payload.get("top_speed"), (double) payload.get("zero_to_sixty"), (String) payload.get("motor_options"), (String) payload.get("paint_options"), (String) payload.get("wheel_options"), (String) payload.get("interior_options"), (boolean) payload.get("enhanced_autopilot"), (boolean) payload.get("full_autopilot") );
    }

    @DeleteMapping("/design/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping({"/", "/status" })
    public String getStatus() {
        return "Application is running";
    }
}
