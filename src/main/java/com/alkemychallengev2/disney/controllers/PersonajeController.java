package com.alkemychallengev2.disney.controllers;

import com.alkemychallengev2.disney.dto.request.PersonajeRequest;
import com.alkemychallengev2.disney.dto.response.PersonajeResponseDetails;
import com.alkemychallengev2.disney.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/characters")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PersonajeResponseDetails create(@Valid @RequestBody PersonajeRequest request){

    return null;
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public PersonajeResponseDetails update(@PathVariable Long id, @Valid @RequestBody PersonajeRequest personajeRequest){
        personajeService.update(id,personajeRequest);
        return null;
    }

}
