package tn.esprit.yossr_bessaad_4se.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.yossr_bessaad_4se.entities.Skier;
import tn.esprit.yossr_bessaad_4se.repositories.ISkierRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class SkierServiceImpl implements ISkierServices {
    private  ISkierRepository skierRepository;

    @Override
    public Skier addSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier retrieveSkier(Long numSkier) {
        Optional<Skier> skier = skierRepository.findById(numSkier);
        return skier.orElse(null);
    }

    @Override
    public List<Skier> retrieveAllSkiers() {
        return (List<Skier>) skierRepository.findAll();
    }

    @Override
    public void deleteSkier(Long numSkier) {
        skierRepository.deleteById(numSkier);
    }

    @Override
    public void updateSkier(Skier skier) {
        skierRepository.save(skier);
    }
}
