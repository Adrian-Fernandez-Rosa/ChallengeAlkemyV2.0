package com.alkemychallengev2.disney.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GeneroRequest {

    @NotBlank
    @Size(min = 3, max = 20, message = "El genero debe ser entre 10 y 20 caracteres")
    private String nombreG;

    private String imagen;

}
