package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "pass_word")
    private String passWord;

    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private java.sql.Date dateOfBirth;

    @Column(name = "mail")
    private String mail;

    @Column(name = "user_type")
    private String userType;

    @Column(name = "location_id")
    private Integer locationId;
}
