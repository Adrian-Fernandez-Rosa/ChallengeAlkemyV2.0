package com.alkemychallengev2.disney.entities;

import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "personajes")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@SQLDelete(sql = "UPDATE personajes SET deleted = true WHERE id=?")
@Where(clause = "deleted = false")
public class PersonajeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String nombre;

    private Integer edad;

    private Double peso;

    @Column(length = 1024)
    private String historia;

    private boolean deleted = Boolean.FALSE;

    @ManyToMany(mappedBy = "personajes", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<PeliculaEntity> peliculas = new HashSet<>();

    @Override
    public boolean equals(Object obj) {
      if (obj == null){
          return false;
      }
      if(getClass() != obj.getClass())
          return false;
      final PersonajeEntity otro = (PersonajeEntity) obj;

      return otro.id.equals(this.id);
    }


}
