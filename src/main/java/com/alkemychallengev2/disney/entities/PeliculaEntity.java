package com.alkemychallengev2.disney.entities;

import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "peliculas")
@Getter
@Setter
@SQLDelete(sql = "UPDATE peliculas SET deleted = true WHERE id=?")
@Where(clause = "deleted = false")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PeliculaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String titulo;

    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "yyyyy/MM/dd")
    private LocalDate fechaCreacion;

    private Integer calificacion;

    private boolean deleted = Boolean.FALSE;

    //personajes
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "personaje_pelicula",
            joinColumns = @JoinColumn(name = "pelicula_id"),
            inverseJoinColumns = @JoinColumn(name = "personaje_id")
    )
    private Set<PersonajeEntity> personajes = new HashSet<>();

    @ManyToOne
    private GeneroEntity genero;
    //generos

    @Column(name = "genero_id", nullable = false)
    private Long generoId;
    //genero id

     public void addPersonaje(PersonajeEntity personaje){
         this.personajes.add(personaje);
     }

     public void removePersonaje(PersonajeEntity personaje){
         this.personajes.remove(personaje);
     }

}
