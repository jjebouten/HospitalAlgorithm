package com.HospitalEmergencyAlgorithm.Patient;

import java.util.ArrayList;

public class PatientFactory {

    private static ArrayList<Patient> patients = new ArrayList<>();

    public static ArrayList<Patient> createRandomPatients(Integer amount) {
        Integer created = 0;
        while (created < amount) {
            patients.add(new Patient(PatientType.values()[(int) (Math.random() * PatientType.values().length)]));
            created++;
        }
        return patients;
    }
}
