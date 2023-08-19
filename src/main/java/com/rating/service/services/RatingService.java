package com.rating.service.services;

import com.rating.service.entities.Rating;

import java.util.List;

public interface RatingService {
    //create
    public Rating create(Rating rating);

    //get all rating
    public List<Rating> getAllRating();

    //get all rating by userId
    public List<Rating> getRatingByUserId(String userId);

    //get all rating by hotelId
    public List<Rating> getRatingByHotelId(String hotelId);
}
