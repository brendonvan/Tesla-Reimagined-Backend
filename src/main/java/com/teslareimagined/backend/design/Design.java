package com.teslareimagined.backend.design;


import javax.persistence.*;

@Entity
@Table(name = "design")
public class Design {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int range;
    private int top_speed;
    private double zero_to_sixty;
    private String motor_options;
    private String paint_options;
    private String wheel_options;
    private String interior_options;
    private boolean enhanced_autopilot;
    private boolean full_autopilot;

    public Design() {}

    public Design(String name, int range, int top_speed, double zero_to_sixty, String motor_options, String paint_options, String wheel_options, String interior_options, boolean enhanced_autopilot, boolean full_autopilot) {
        this.name = name;
        this.range = range;
        this.top_speed = top_speed;
        this.zero_to_sixty = zero_to_sixty;
        this.motor_options = motor_options;
        this.paint_options = paint_options;
        this.wheel_options = wheel_options;
        this.interior_options = interior_options;
        this.enhanced_autopilot = enhanced_autopilot;
        this.full_autopilot = full_autopilot;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getTop_speed() {
        return top_speed;
    }

    public void setTop_speed(int top_speed) {
        this.top_speed = top_speed;
    }

    public double getZero_to_sixty() {
        return zero_to_sixty;
    }

    public void setZero_to_sixty(double zero_to_sixty) {
        this.zero_to_sixty = zero_to_sixty;
    }

    public String getMotor_options() {
        return motor_options;
    }

    public void setMotor_options(String motor_options) {
        this.motor_options = motor_options;
    }

    public String getPaint_options() {
        return paint_options;
    }

    public void setPaint_options(String paint_options) {
        this.paint_options = paint_options;
    }

    public String getWheel_options() {
        return wheel_options;
    }

    public void setWheel_options(String wheel_options) {
        this.wheel_options = wheel_options;
    }

    public String getInterior_options() {
        return interior_options;
    }

    public void setInterior_options(String interior_options) {
        this.interior_options = interior_options;
    }

    public boolean isEnhanced_autopilot() {
        return enhanced_autopilot;
    }

    public void setEnhanced_autopilot(boolean enhanced_autopilot) {
        this.enhanced_autopilot = enhanced_autopilot;
    }

    public boolean isFull_autopilot() {
        return full_autopilot;
    }

    public void setFull_autopilot(boolean full_autopilot) {
        this.full_autopilot = full_autopilot;
    }
}
