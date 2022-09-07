package com.hospitalManagement.models;

import com.hospitalManagement.enums.HealthProfessionalType;

public class Nurse extends HealthProfessional{
    public Nurse(String name) {
        super(name);
    }

    @Override
    public HealthProfessionalType getHealthProfessionalType() {
        return HealthProfessionalType.NURSE;
    }
}
