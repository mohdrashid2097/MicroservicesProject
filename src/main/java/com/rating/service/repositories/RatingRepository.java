package com.rating.service.repositories;

import com.rating.service.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, String> {

    // custom finder method
    public List<Rating> findByUserId(String userId);
    public List<Rating> findByHotelId(String hotelId);
}
