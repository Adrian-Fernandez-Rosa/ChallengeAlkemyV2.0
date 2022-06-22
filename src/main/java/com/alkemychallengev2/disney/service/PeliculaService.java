package com.alkemychallengev2.disney.service;

import com.alkemychallengev2.disney.dto.request.PeliculaRequest;
import com.alkemychallengev2.disney.dto.response.PeliculaResponse;

public interface PeliculaService {

    PeliculaResponse save(PeliculaRequest request);

}
