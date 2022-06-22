package com.alkemychallengev2.disney.mapper;

import com.alkemychallengev2.disney.dto.request.PeliculaRequest;
import com.alkemychallengev2.disney.dto.response.PeliculaResponse;
import com.alkemychallengev2.disney.entities.PeliculaEntity;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PeliculaMapper {

    public PeliculaEntity peliculaDTO2Entity(PeliculaRequest request){

        return PeliculaEntity.builder()
                .titulo(request.getTitulo())
                .imagen(request.getImagen())
                .fechaCreacion(request.getFechaCreacion())
                .calificacion(request.getCalificacion())
                .build();
    }

    //formateo a año- mes-día
    /*
    private LocalDate string2localDate(String stringDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(stringDate, formatter);
    }

     */



    //entidad a dto
    public PeliculaResponse peliculaEntity2DTO(PeliculaEntity entity, boolean loadpersonajes){


        return null;
    }


}
