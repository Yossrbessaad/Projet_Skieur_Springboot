package tn.esprit.yossr_bessaad_4se.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.yossr_bessaad_4se.repositories.IPisteRepository;
import tn.esprit.yossr_bessaad_4se.entities.Piste;

import java.util.ArrayList;
import java.util.List;

@Service
public class PisteServicesImpl implements IPisteServices{

    @Autowired//on peut ajouter @AllArgsController pour generer automatiquement des constructeurs et c'est le 3eme type de configuration d'un Bean
    private IPisteRepository pisteRepository;

    public Piste addPiste (Piste piste){
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrivePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
    public List<Piste> retriveAllPists() {
        return (List<Piste>) pisteRepository.findAll();
    }

    @Override
    public void deletePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste) ;
    }


}
