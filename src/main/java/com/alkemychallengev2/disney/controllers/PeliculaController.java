package com.alkemychallengev2.disney.controllers;




import com.alkemychallengev2.disney.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/movies")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;


}
