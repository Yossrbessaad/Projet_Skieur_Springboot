package tn.esprit.yossr_bessaad_4se.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Instructor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long numInstructor;

     String firstName;
     String lastName;
     LocalDate dateOfHire;
     @OneToMany
     List<Course> courses;


}
