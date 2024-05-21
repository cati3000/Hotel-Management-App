package org.example.hotelapp.Service;

import org.example.hotelapp.Model.Room;
import org.example.hotelapp.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> findByHotelId(Long hotelId) {
        return roomRepository.findAll().stream()
                .filter(room -> room.getHotel().getId().equals(hotelId))
                .collect(Collectors.toList());
    }

    public Room findById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }
}
