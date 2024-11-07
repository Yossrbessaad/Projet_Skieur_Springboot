package tn.esprit.yossr_bessaad_4se.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.yossr_bessaad_4se.Services.SkierServiceImpl;
import tn.esprit.yossr_bessaad_4se.entities.Skier;

import java.util.List;

@RestController
@RequestMapping("/api/skiers")
@AllArgsConstructor
public class SkierRestController {

    private  SkierServiceImpl skierService;

    @PostMapping
    public Skier addSkier(@RequestBody Skier skier) {
        return skierService.addSkier(skier);
    }

    @GetMapping("/{id}")
    public Skier retrieveSkier(@PathVariable Long id) {
        return skierService.retrieveSkier(id);
    }

    @GetMapping
    public List<Skier> retrieveAllSkiers() {
        return skierService.retrieveAllSkiers();
    }

    @DeleteMapping("/{id}")
    public void deleteSkier(@PathVariable Long id) {
        skierService.deleteSkier(id);
    }

    @PutMapping
    public void updateSkier(@RequestBody Skier skier) {
        skierService.updateSkier(skier);
    }
}
