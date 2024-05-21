package org.example.hotelapp;

import javax.annotation.PostConstruct;
import org.example.hotelapp.Model.Hotel;
import org.example.hotelapp.Repository.HotelRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class DataInitializer {

    @Autowired
    private HotelRepository hotelRepository;

    @PostConstruct
    public void init() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Hotel>> typeReference = new TypeReference<>() {};
        InputStream inputStream = getClass().getResourceAsStream("/static/hotels.json");
        //System.out.println("data" + inputStream);
        List<Hotel> hotels = objectMapper.readValue(inputStream, typeReference);
        hotelRepository.saveAll(hotels);
    }
}
