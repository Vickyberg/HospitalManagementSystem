package com.hospitalManagement.services;

import com.hospitalManagement.exception.HospitalException;
import com.hospitalManagement.models.LuminariesHospital;
import com.hospitalManagement.models.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class PatientServiceTest {
    private Logger logger = Logger.getLogger(PatientServiceTest.class.getName());
    private PatientService patientService;
    private Patient olamide;

    @BeforeEach
    void setUp(){
        patientService = new PatientServiceImpl();
    }
    @Test
    void register() {
        assertTrue(LuminariesHospital.getPatientDB().isEmpty());
        olamide = new Patient("01", "Olamide");
        try {
            patientService.register(olamide);
        } catch (HospitalException e) {
            logger.log(Level.FINE, e.getMessage());
        }
        assertFalse(LuminariesHospital.getPatientDB().isEmpty());
    }

}