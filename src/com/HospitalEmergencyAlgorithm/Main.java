package com.HospitalEmergencyAlgorithm;

import com.HospitalEmergencyAlgorithm.Patient.PatientFactory;
import com.HospitalEmergencyAlgorithm.Room.RoomFactory;

public class Main {

    private static int AmountOfRoomsInHospital = 50;
    private static int AmountOfPatients = 30;

    public static void main(String[] args) {
        PatientFactory patientFactory = new PatientFactory();
        RoomFactory roomFactory = new RoomFactory();
        EmergencyAlgorithm emergencyAlgorithm = new EmergencyAlgorithm();
        emergencyAlgorithm.FillRooms(patientFactory.createRandomPatients(AmountOfPatients), roomFactory.createRooms(AmountOfRoomsInHospital));
    }
}
