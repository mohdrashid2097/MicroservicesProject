package com.hotel.service.services;

import com.hotel.service.entities.Hotel;

import java.util.List;

public interface HotelService {

    //create
    public Hotel create(Hotel hotel);

    //getAll
    public List<Hotel> getAll();

    //get single
    public Hotel get(String id);
}
