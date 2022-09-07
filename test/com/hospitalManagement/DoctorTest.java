package com.hospitalManagement;

import com.hospitalManagement.enums.HealthProfessionalType;
import com.hospitalManagement.models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {
    private Doctor drJoy;
    private HealthProfessional boyo;
    private Patient eden;
    @BeforeEach
    void setUp(){
        drJoy = new Doctor("Joy");
        boyo= new Nurse("Boyo");
        eden = new Patient("e1","Eden");
    }

    @Test
    void createHealthProfessionalTest(){
        assertEquals(HealthProfessionalType.DOCTOR,drJoy.getHealthProfessionalType());
        assertNotEquals(HealthProfessionalType.DOCTOR,boyo.getHealthProfessionalType());
        assertEquals(HealthProfessionalType.NURSE,boyo.getHealthProfessionalType());

        boyo = new Pharmacist("Wimp");
        assertNotEquals(HealthProfessionalType.NURSE,boyo.getHealthProfessionalType());
    }
    @Test
    void createPatient(){
         eden = new Patient("e1");
    }

    @Test
    void  getDoctorPatients(){
        assertNotNull(drJoy);
        assertNotNull(drJoy.getPatients());
        assertTrue(drJoy.getPatients().isEmpty());
        assertEquals(0,drJoy.getPatients().size());
        drJoy.getPatients().put(eden.getPatientId(),eden);
       assertFalse(drJoy.getPatients().isEmpty());
       Patient aPatient = drJoy.getPatients().get("e1");
       assertEquals(eden,aPatient);
    }

}