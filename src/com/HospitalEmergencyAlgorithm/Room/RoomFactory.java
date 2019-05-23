package com.HospitalEmergencyAlgorithm.Room;

import java.util.ArrayList;

public class RoomFactory {
    private static ArrayList<Room> rooms = new ArrayList<>();

    public static ArrayList<Room> createRooms(Integer amount) {
        Integer created = 0;
        while (created < amount) {
            rooms.add(new Room(null,null));
            created++;
        }
        return rooms;
    }
}
