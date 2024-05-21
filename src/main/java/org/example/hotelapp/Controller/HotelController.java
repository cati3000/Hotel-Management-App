package org.example.hotelapp.Controller;

import org.example.hotelapp.Model.Hotel;
import org.example.hotelapp.Service.DistanceService;
import org.example.hotelapp.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/hotels")
public class HotelController {

    //@Autowired
    private HotelService hotelService;

    @GetMapping("/all")
    public List<Hotel> getAllHotels() {
        return hotelService.findAll();
    }

    @GetMapping("/{id}")
    public Hotel getHotelById(@PathVariable Long id) {
        return hotelService.findById(id);
    }
}
