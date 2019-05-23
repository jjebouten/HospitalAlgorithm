package com.HospitalEmergencyAlgorithm.Room;

import com.HospitalEmergencyAlgorithm.Patient.PatientType;

public class Room {
    private PatientType bedOne;
    private PatientType bedTwo;

    public Room(PatientType bedOne, PatientType bedTwo) {
        this.bedOne = bedOne;
        this.bedTwo = bedTwo;
    }

    public PatientType getBedOne() {
        return bedOne;
    }

    public void setBedOne(PatientType bedOne) {
        this.bedOne = bedOne;
    }

    public PatientType getBedTwo() {
        return bedTwo;
    }

    public void setBedTwo(PatientType bedTwo) {
        this.bedTwo = bedTwo;
    }
}
