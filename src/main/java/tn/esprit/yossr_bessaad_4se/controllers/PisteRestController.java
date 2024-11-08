package tn.esprit.yossr_bessaad_4se.controllers;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.yossr_bessaad_4se.Services.IPisteServices;
import tn.esprit.yossr_bessaad_4se.Services.PisteServicesImpl;
import tn.esprit.yossr_bessaad_4se.entities.Piste;

import java.util.List;

@RestController
@RequestMapping("piste")
@RequiredArgsConstructor
public class PisteRestController {

    private final PisteServicesImpl pisteService;

    @PostMapping("add")
    public Piste addPiste(@RequestBody Piste piste) {
        return pisteService.addPiste(piste);
    }


    @GetMapping("/{numPiste}")
    public Piste retrievePiste(@PathVariable("numPiste") Long numPiste) {
        return pisteService.retrivePiste(numPiste);
    }


    @GetMapping
    public List<Piste> retrieveAllPistes() {
        return pisteService.retriveAllPists();
    }

    @DeleteMapping("/{id}")
    public void deletePiste(@PathVariable Long id) {
        pisteService.deletePiste(id);
    }

    @PutMapping
    public void updatePiste(@RequestBody Piste piste) {
        pisteService.updatePiste(piste);
    }
}