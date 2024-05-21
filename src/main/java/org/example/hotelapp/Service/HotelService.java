package org.example.hotelapp.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.hotelapp.Model.Hotel;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class HotelService {

    private final List<Hotel> hotels;

    public HotelService() {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Hotel>> typeReference = new TypeReference<>() {};
        try (InputStream inputStream = getClass().getResourceAsStream("/static/hotels.json")) {
            hotels = objectMapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            throw new RuntimeException("NU SE POATE BRUH", e);
        }
    }

    public List<Hotel> findAll() {
        return hotels;
    }

    public Hotel findById(Long id) {
        return hotels.stream()
                .filter(hotel -> hotel.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}