package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.StringBufferInputStream;
import java.util.Date;

@Document(collection = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

    @Id
    private Integer id;
    private String identification;
    private String name;
    private Date birthDay;
    private String monthBirthDay;
    private String Address;
    private String CellPhone;
    private String email;
    private String password;
    private String zone;
    private String type;

}
