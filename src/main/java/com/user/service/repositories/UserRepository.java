package com.user.service.repositories;

import com.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,String> {

    //if you want to implement any custom method or query we can write here
}
