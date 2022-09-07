package com.hospitalManagement.models;

import com.hospitalManagement.enums.HealthProfessionalType;

public class Doctor extends HealthProfessional{

    public Doctor(String name){
        super(name);
    }
    @Override
    public HealthProfessionalType getHealthProfessionalType() {
        return HealthProfessionalType.DOCTOR;
    }

}
