package tn.esprit.yossr_bessaad_4se.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.yossr_bessaad_4se.enums.Support;
import tn.esprit.yossr_bessaad_4se.enums.TypeCourse;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long numCourse;

     int level;

    @Enumerated(EnumType.STRING)
     TypeCourse typeCourse;

    @Enumerated(EnumType.STRING)
     Support support;

     Float price;
     int timeSlot;
     @OneToMany(mappedBy = "course")
     Set<Registration> registrations;

}
