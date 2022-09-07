package com.hospitalManagement.services;

import com.hospitalManagement.exception.HospitalException;
import com.hospitalManagement.models.LuminariesHospital;
import com.hospitalManagement.models.Patient;

public class PatientServiceImpl implements PatientService {
    @Override
    public void register(Patient newPatient) throws HospitalException {
       // LuminariesHospital.getPatientDB().put(newPatient.getPatientId(),newPatient.getPatientId())
    }
}
