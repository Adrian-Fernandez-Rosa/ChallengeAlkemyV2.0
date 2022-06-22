package com.alkemychallengev2.disney.dto.response;

import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonajeResponseDetails {
    private Long id;

    private String imagen;

    private Integer edad;

    private Double peso;

    private String historia;

    private Set<PeliculaResponse> peliculas;

}
