package tn.esprit.yossr_bessaad_4se.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkier;
    private  String firstName;
    private String lastName;
    @Column(nullable = false)
    private LocalDate dateOfBirth;
    private String city;

    @OneToOne(cascade ={ CascadeType.PERSIST,CascadeType.REMOVE})
    Subscription subscription;

    @OneToMany(mappedBy = "skier" , fetch = FetchType.EAGER)
    Set<Registration> registrations;


    @ManyToMany(mappedBy = "skiers")
    Set<Piste>pistes;
}
