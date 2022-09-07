package com.hospitalManagement.models;

import java.util.Map;
import java.util.TreeMap;

public class LuminariesHospital {
    private static Map<String,Patient> patientDB = new TreeMap<>();

    public static Map<String, Patient> getPatientDB() {
        return patientDB;
    }

    public static void setPatientDB(Map<String, Patient> patientDB) {
        LuminariesHospital.patientDB = patientDB;
    }
}
