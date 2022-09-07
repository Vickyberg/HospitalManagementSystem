package com.hospitalManagement.models;

import com.hospitalManagement.enums.HealthProfessionalType;

public class Pharmacist extends HealthProfessional{
    public Pharmacist(String name) {
        super(name);
    }

    @Override
    public HealthProfessionalType getHealthProfessionalType() {
        return HealthProfessionalType.PHARMACIST;
    }
}
