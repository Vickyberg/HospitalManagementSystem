package com.hospitalManagement.models;

import com.hospitalManagement.enums.HealthProfessionalType;

import java.util.Map;
import java.util.TreeMap;

public abstract class HealthProfessional {


    private int professionalId;
    private  String firstName;
    private String lastName;
    private HealthProfessionalType healthProfessionalType;


    public HealthProfessional(String name) {
        this.firstName = name;
    }

    public abstract HealthProfessionalType getHealthProfessionalType();

    public int getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(int professionalId) {
        this.professionalId = professionalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<String, Patient> getPatients() {
        return LuminariesHospital.getPatientDB();
    }


}
