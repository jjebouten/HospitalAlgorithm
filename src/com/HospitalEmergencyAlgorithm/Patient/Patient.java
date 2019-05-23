package com.HospitalEmergencyAlgorithm.Patient;

public class Patient {
    private PatientType patientType;

    public Patient(PatientType patientType) {
        this.patientType = patientType;
    }

    public PatientType getPatientType() {
        return patientType;
    }
}
