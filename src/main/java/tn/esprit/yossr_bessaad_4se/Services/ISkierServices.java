package tn.esprit.yossr_bessaad_4se.Services;

import tn.esprit.yossr_bessaad_4se.entities.Skier;

import java.util.List;

public interface ISkierServices {
    Skier addSkier(Skier skier);
    Skier retrieveSkier(Long numSkier);
    List<Skier> retrieveAllSkiers();
    void deleteSkier(Long numSkier);
    void updateSkier(Skier skier);
    Skier assignSkierToPiste(Long numSkier, Long numPiste);
}
