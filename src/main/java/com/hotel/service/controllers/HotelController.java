package com.hotel.service.controllers;

import com.hotel.service.entities.Hotel;
import com.hotel.service.services.HotelService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    //create
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        Hotel hotel1 = hotelService.create(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);

        // this is alternate way
        //return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
    }

    //get single

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getSingle(@PathVariable String hotelId){
        Hotel hotel = hotelService.get(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(hotel);
    }

    //get all
    @GetMapping
    public ResponseEntity<List<Hotel>> getAll(){
        List<Hotel> allHotel = hotelService.getAll();
        return ResponseEntity.ok(allHotel);
    }

}
