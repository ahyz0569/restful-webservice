package com.example.restfulwebservice.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    private LocalDate joinDate;
}
