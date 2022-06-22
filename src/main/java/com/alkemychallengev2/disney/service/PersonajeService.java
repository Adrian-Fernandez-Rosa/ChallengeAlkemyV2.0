package com.alkemychallengev2.disney.service;

import com.alkemychallengev2.disney.dto.request.PersonajeRequest;
import com.alkemychallengev2.disney.dto.response.PersonajeResponseDetails;

public interface PersonajeService {

    PersonajeResponseDetails save(PersonajeRequest request);

    PersonajeResponseDetails update(Long id,PersonajeRequest request);


}
