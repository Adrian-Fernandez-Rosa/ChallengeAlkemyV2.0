package com.alkemychallengev2.disney.service.impl;


import com.alkemychallengev2.disney.repository.PersonajeRepository;
import com.alkemychallengev2.disney.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeServiceImpl implements PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;




}
