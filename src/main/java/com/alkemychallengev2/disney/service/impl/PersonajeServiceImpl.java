package com.alkemychallengev2.disney.service.impl;

import com.alkemychallengev2.disney.dto.request.PersonajeRequest;
import com.alkemychallengev2.disney.dto.response.PersonajeResponseDetails;
import com.alkemychallengev2.disney.mapper.PersonajeMapper;
import com.alkemychallengev2.disney.repository.PersonajeRepository;
import com.alkemychallengev2.disney.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeServiceImpl implements PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    @Autowired
    private PersonajeMapper PMapper;

    @Override
    public PersonajeResponseDetails save(PersonajeRequest request) {
     //   PersonajeResponseDetails personaje = personajeRepository.save(PMapper.)
        return null;
    }

    @Override
    public PersonajeResponseDetails update(Long id, PersonajeRequest request) {
        return null;
    }
}
