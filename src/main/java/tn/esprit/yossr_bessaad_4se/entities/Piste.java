package tn.esprit.yossr_bessaad_4se.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.yossr_bessaad_4se.entities.Skier;
import tn.esprit.yossr_bessaad_4se.enums.Color;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long numPiste;
     String namePiste;
    @Enumerated(EnumType.STRING)
     Color color;
     int length;
     int slope;

    @ManyToMany
    Set<Skier> skiers;
}