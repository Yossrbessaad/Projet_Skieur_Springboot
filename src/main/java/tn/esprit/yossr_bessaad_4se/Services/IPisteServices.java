package tn.esprit.yossr_bessaad_4se.Services;

import tn.esprit.yossr_bessaad_4se.entities.Piste;

import java.util.List;

public interface IPisteServices {
    Piste addPiste (Piste psite);
    Piste retrivePiste (Long numPiste);
    List <Piste> retriveAllPists();
    void deletePiste (Long numPiste);

    Piste updatePiste(Piste piste);
}
