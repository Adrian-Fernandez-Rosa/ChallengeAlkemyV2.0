package com.alkemychallengev2.disney.controllers;

import com.alkemychallengev2.disney.dto.request.PeliculaRequest;
import com.alkemychallengev2.disney.dto.response.PeliculaResponse;

import com.alkemychallengev2.disney.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/movies")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PeliculaResponse> save (@Valid @RequestBody PeliculaRequest request){
    // save Pelicula

        peliculaService.save(request);
        return null;
    }
}
