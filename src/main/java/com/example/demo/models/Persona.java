package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.StringBufferInputStream;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "personas")
public class Persona {

    @Id
    private Integer id;
    private String nombre;
    private Integer edad;
    private String correo;

}
