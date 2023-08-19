package com.user.service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "micro_users")
public class User {

    @Id
    @Column(name = "user_Id")
    private String userId;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_emailId")
    private String email;

    @Column(name = "about_user")
    private String about;

    @Transient
    private List<Rating> rating = new ArrayList<>();
}
