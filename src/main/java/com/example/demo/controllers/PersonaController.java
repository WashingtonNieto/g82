package com.example.demo.controllers;


import com.example.demo.models.Persona;
import com.example.demo.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/persona")

public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/all")
    public List<Persona> getAll() {
        return personaService.getAll();
    }

    @GetMapping("/{id}")
    public Persona getById(@PathVariable Integer id) {
        return personaService.getById(id).orElse(null);
    }

    @PutMapping("/update")
    public ResponseEntity<Persona> update(@RequestBody Persona persona) {
        Persona p = personaService.update(persona);

        //En nuestro caso no se necesita la siguiente validacion
        //porque nunca va a ser null --- solo informativo

        //if(p == null)
        //    return new ResponseEntity(null, HttpStatus.NO_CONTENT);

        //para la modificacion

        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Persona> save(@RequestBody Persona persona) {
        Persona p = personaService.save(persona);
        return new ResponseEntity(p, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        personaService.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
