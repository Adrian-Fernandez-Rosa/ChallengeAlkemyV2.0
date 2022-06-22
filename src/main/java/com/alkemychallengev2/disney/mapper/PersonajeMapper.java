package com.alkemychallengev2.disney.mapper;

import com.alkemychallengev2.disney.dto.request.PersonajeRequest;
import com.alkemychallengev2.disney.dto.response.PersonajeResponseDetails;
import com.alkemychallengev2.disney.dto.response.PersonajeResponsePel;
import com.alkemychallengev2.disney.entities.PeliculaEntity;
import com.alkemychallengev2.disney.entities.PersonajeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonajeMapper {

    @Autowired
    private PeliculaMapper peliculaMapper;

    //new personaje entity
    public PersonajeEntity personajeDTO2Entity(PersonajeRequest request, List<PeliculaEntity> peliculas){



        return PersonajeEntity.builder()
                .nombre(request.getNombrePersonaje())
                .edad(request.getEdad())
                .imagen(request.getImagen())
                .peso(request.getPeso())
                .peliculas(null)
                .build();
        // no asocio peliculas en la creación de un personaje
    }

    public PersonajeResponseDetails PersonajeEntity2PersonajeResponse(PersonajeEntity personaje, boolean loadPeliculas){
           PersonajeResponseDetails response = new PersonajeResponseDetails();
           response.setId(personaje.getId());
           response.setEdad(personaje.getEdad());
           response.setHistoria(personaje.getHistoria());
           if (loadPeliculas){
           //    response.setPeliculas(personaje.getPeliculas());
           }

           return null;
    }
}
