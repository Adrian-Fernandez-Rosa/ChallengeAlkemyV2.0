package com.alkemychallengev2.disney.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PersonajeResponsePel {
    private Long id;
    private String nombre;
    private String imagen; //TODO: ver si se reemplaza por url o queda base64

}
