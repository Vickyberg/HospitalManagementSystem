package com.hospitalManagement.models;

import com.hospitalManagement.enums.Gender;

public class Patient {
    private  String  patientId;
    private String firstName;
    private  String secondName;
    private Gender gender;

    public Patient(String id){
        patientId = id;
    }

    public Patient(String id, String firstName){
        patientId = id;
        this.firstName = firstName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
