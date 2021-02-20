package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@JsonIgnoreProperties({"password", "ssn"})
public class User {
    private Integer id;

    @Min(value = 2, message = "Name은 2글자 이상 입력해 주세요.")
    private String name;

    @Past
    private LocalDate joinDate;

//    @JsonIgnore
    private String password;
//    @JsonIgnore
    private String ssn;
}
