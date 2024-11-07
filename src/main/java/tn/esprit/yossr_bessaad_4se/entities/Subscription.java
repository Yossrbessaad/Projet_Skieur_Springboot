package tn.esprit.yossr_bessaad_4se.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.yossr_bessaad_4se.enums.TypeSubscription;

import java.io.Serializable;
import java.time.LocalDate;
@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long numSub;

     LocalDate startDate;
     LocalDate endDate;
     Float price;

    @Enumerated(EnumType.STRING)
     TypeSubscription typeSub;

}
