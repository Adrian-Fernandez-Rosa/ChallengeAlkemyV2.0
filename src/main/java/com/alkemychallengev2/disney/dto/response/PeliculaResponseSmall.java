package com.alkemychallengev2.disney.dto.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PeliculaResponseSmall {

    private String imagen;

    private String titulo;

    private LocalDate fechaCreacion;

}
