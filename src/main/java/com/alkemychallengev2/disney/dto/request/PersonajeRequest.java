package com.alkemychallengev2.disney.dto.request;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonajeRequest {

    @NotEmpty(message = "El nombre del personaje no puede estar vacío")
    @NotNull(message = "El nombre del personaje no puede estar nulo")
    private String nombrePersonaje;

    @NotNull(message = "La edad estar nulo")
    @NotEmpty(message = "La edad esta vacía")
    private Integer edad;

    @NotNull (message = "El peso no puede estar vacío")
    private Double peso;

    private Set<PeliculaRequest> Peliculas;

    private String imagen;
}
