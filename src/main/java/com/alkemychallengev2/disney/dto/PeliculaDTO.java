package com.alkemychallengev2.disney.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class PeliculaDTO {

    private Long id;
    private String imagen;
    private String titulo;
    private String fechaCreacion;
    private Integer calificacion;
    private Long GeneroId;
    private Set<PersonajeDTO> personajes;

}
