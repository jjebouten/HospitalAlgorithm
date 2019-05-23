package com.HospitalEmergencyAlgorithm;

import com.HospitalEmergencyAlgorithm.Patient.Patient;
import com.HospitalEmergencyAlgorithm.Patient.PatientType;
import com.HospitalEmergencyAlgorithm.Room.Room;

import java.util.ArrayList;

public class EmergencyAlgorithm {


    public void FillRooms(ArrayList<Patient> patientList, ArrayList<Room> roomList) {
        System.out.println("START");
        System.out.println("Amount of patients comming in " + patientList.size());
        System.out.println("Amount of rooms available " + roomList.size());

        patientLoop:
        for (Patient patient : patientList) {
            PatientType currectPatient = patient.getPatientType();


            roomLoop:
            for (Room currentRoom : roomList) {
                if (roomHasBothBedsFull(currentRoom)) {
                    continue roomLoop;
                }
                if (currectPatient.name().equals("WOMAN")) {
                    setPatientinEmptyBed(currentRoom, currectPatient);
                    continue patientLoop;
                }
                if (currectPatient.name().equals("CHILD")) {
                    if (roomHasBothBedsEmpty(currentRoom)) {
                        setPatientinEmptyBed(currentRoom, currectPatient);
                        continue patientLoop;
                    }
                    if (roomHasAManInBedOne(currentRoom)) {
                        continue roomLoop;
                    }
                }
                if (currectPatient.name().equals("MAN")) {
                    if (roomHasBothBedsEmpty(currentRoom)) {
                        setPatientinEmptyBed(currentRoom, currectPatient);
                        continue patientLoop;

                    }

                    if (roomHasAChildInBedOne(currentRoom)) {
                        continue roomLoop;
                    }
                }
            }
        }
        printRoomList(roomList);
    }

    private void printRoomList(ArrayList<Room> roomList) {
        for (int i = 0; i < roomList.size(); i++) {
            System.out.println("Room Number: " + i);
            printRoom(roomList.get(i));
        }
    }

    private void setPatientinEmptyBed(Room currentRoom, PatientType currectPatient) {
        if (currentRoom.getBedOne() == null) {
            currentRoom.setBedOne(currectPatient);
        } else {
            currentRoom.setBedTwo(currectPatient);
        }
    }

    private boolean roomHasAManInBedOne(Room room) {
        if (room.getBedOne().name() == "MAN") {
            return true;
        }
        return false;
    }

    private boolean roomHasAChildInBedOne(Room room) {
        if (room.getBedOne().name() == "CHILD") {
            return true;
        }
        return false;
    }

    private boolean roomHasBothBedsEmpty(Room room) {
        if (room.getBedOne() == null && room.getBedTwo() == null) {
            return true;
        }
        return false;
    }

    private boolean roomHasBothBedsFull(Room room) {
        if (room.getBedOne() != null && room.getBedTwo() != null) {
            return true;
        }
        return false;
    }

    private void printRoom(Room room) {
        System.out.println("Bed one has " + room.getBedOne());
        System.out.println("Bed Two has " + room.getBedTwo());
    }
}