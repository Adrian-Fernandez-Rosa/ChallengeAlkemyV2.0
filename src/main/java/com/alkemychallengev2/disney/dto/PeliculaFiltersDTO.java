package com.alkemychallengev2.disney.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PeliculaFiltersDTO {

    private String titulo;
    private Long generoID;
    private String orden; //asc desc



}
