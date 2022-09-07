package com.hospitalManagement.services;

import com.hospitalManagement.exception.HospitalException;
import com.hospitalManagement.models.Patient;

public interface PatientService {
    void register(Patient newPatient) throws HospitalException;
}
