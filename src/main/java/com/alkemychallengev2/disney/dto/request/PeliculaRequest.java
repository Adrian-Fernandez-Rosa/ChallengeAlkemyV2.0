package com.alkemychallengev2.disney.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PeliculaRequest {



    private String imagen;

    @NotEmpty
    @Size(min = 2, max = 30, message = "El nombre debe contener entre 2 y 30 caracteres")
    private String titulo;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaCreacion;

    @Range (min = 1, max = 5, message = "El rango debe ser de 1 a 5")
    private Integer calificacion;

    @NotNull
    private String genero;


}
